import classes.chainOfResponsibility.BankAccount;
import classes.chainOfResponsibility.CreditCard;
import classes.chainOfResponsibility.CreditLimit;
import classes.chainOfResponsibility.PaymentHandler;
import classes.command.*;
import classes.iterator.Iterator;
import classes.iterator.Playlist;
import classes.mediator.Employee;
import classes.mediator.MeetingRoomBookingSystem;
import classes.memento.History;
import classes.memento.UserSettings;
import classes.observer.ConcreteSubscriber;
import classes.observer.SimpleYouTubeChannel;
import classes.state.Order;
import classes.strategy.SurvivalLeader;
import classes.template.CocktailPreparation;
import classes.template.MargaritaPreparation;
import classes.template.MojitoPreparation;
import classes.visitor.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Chain of responsibility
        PaymentHandler bank = new BankAccount(500);
        PaymentHandler creditCard = new CreditCard(700);
        PaymentHandler creditLimit = new CreditLimit(1000);

        bank.setNext(creditCard);
        creditCard.setNext(creditLimit);

        bank.pay(700);
        bank.pay(1200);


        //Command
        GameController  game = new GameController();
        Player  player = new Player();

        Command forward = new MoveForwardCommand(player);
        Command backward = new MoveBackwardCommand(player);
        Command left = new MoveLeftCommand(player);
        Command right = new MoveRightCommand(player);

        game.executeCommand(forward);
        game.executeCommand(backward);
        game.executeCommand(left);
        game.executeCommand(right);
        game.undoCommand();

        //Iterator
        Playlist  playlist = new Playlist();
        Iterator<String> iterator = playlist.createPlaylistIterator();

        playlist.addSong("Linkin Park - Numb");
        playlist.addSong("Imagine Dragons - Thunder");
        playlist.addSong("Queen - Bohemian Rhapsody");

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        //Mediator
        MeetingRoomBookingSystem bookingSystem = new MeetingRoomBookingSystem(1);
        Employee nastya = new Employee("Nastya", bookingSystem);
        Employee liza = new Employee("Liza", bookingSystem);

        nastya.bookRoom();
        liza.bookRoom();
        nastya.leaveRoom();
        liza.bookRoom();

        //memento
        UserSettings settings = new UserSettings();
        History history = new History();

        settings.setSettings("Dark", "Ukrainian");
        history.saveCheckpoint(settings.save());

        settings.setSettings("Light", "Japanese");
        settings.load(history.loadCheckpoint());

        //observer
        SimpleYouTubeChannel channel = new SimpleYouTubeChannel("Beauty chanel");
        ConcreteSubscriber subscriber1 = new ConcreteSubscriber("user123", true);
        ConcreteSubscriber subscriber2 = new ConcreteSubscriber("superMario111", false);

        channel.addSubscriber(subscriber1);
        channel.addSubscriber(subscriber2);

        channel.uploadNewVideo("New cool lipstick (or not cool)");

        subscriber2.toggleNotificationEnabled();

        channel.uploadNewVideo("Unboxing of new cosmetic secret box!");

        //State
        Order order = new Order();
        order.sendToKitchen();
        order.completeOrder();
        order.cancelOrder();
        order.sendToKitchen();

        //strategy
        SurvivalLeader leader = new SurvivalLeader();
        String situation = "Zombies is attacking!";
        System.out.println(situation);
        leader.chooseSurvivalStrategy(situation);
        leader.executeSurvivalStrategy();
        situation = "Zombies is approaching!";
        System.out.println(situation);
        leader.chooseSurvivalStrategy(situation);
        leader.executeSurvivalStrategy();
        situation = "The base is destroyed after atack!";
        System.out.println(situation);
        leader.chooseSurvivalStrategy(situation);
        leader.executeSurvivalStrategy();
        situation = "Peace times";
        System.out.println(situation);
        leader.chooseSurvivalStrategy(situation);
        leader.executeSurvivalStrategy();

        //template
        CocktailPreparation margarita = new MargaritaPreparation();
        margarita.prepareCoctail();
        CocktailPreparation mojito = new MojitoPreparation();
        mojito.prepareCoctail();

        //visitor
        Product apple = new Fruit("Apple", 30, 5000);
        Product cola = new Drink("Cola", 150, 500);
        ProductVisitor calorieCalculator = new CalorieCalculator();
        apple.accept(calorieCalculator);
        cola.accept(calorieCalculator);



    }
}
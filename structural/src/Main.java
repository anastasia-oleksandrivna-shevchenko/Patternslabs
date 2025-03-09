import patterns.adapter.USB;
import patterns.adapter.SDCard;
import patterns.adapter.SDCardToUSBAdapter;
import patterns.bridge.*;
import patterns.bridge.Rectangle;
import patterns.bridge.Shape;
import patterns.composite.Dish;
import patterns.composite.MenuCategory;
import patterns.composite.Menu;
import patterns.decorator.*;
import patterns.facade.*;
import patterns.flyweight.CosmeticProduct;
import patterns.flyweight.CosmeticProductFactory;
import patterns.proxy.Media;
import patterns.proxy.MovieProxy;

import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //adapter
        USB usbAdapter = new SDCardToUSBAdapter(new SDCard());
        usbAdapter.connectWithUsbCable();
        //bridge
        Renderer rasterRenderer = new RasterRenderer();

        Shape circle2D = new Circle(rasterRenderer, 10);
        Shape rectangle2D = new Rectangle(20, 40, rasterRenderer);

        circle2D.draw();
        rectangle2D.draw();

        Renderer vectorRenderer = new VectorRenderer();
        Shape circle3D = new Circle(rasterRenderer, 10);
        Shape rectangle3D = new Rectangle(20, 40, vectorRenderer);

        circle3D.draw();
        rectangle3D.draw();

        // composite
        Dish dish1 = new Dish("Spaghetti Carbonara", 12.99);
        Dish dish2 = new Dish("Margherita Pizza", 9.99);
        Dish dish3 = new Dish("Cheeseburger", 8.99);
        Dish dish4 = new Dish("Caesar Salad", 7.49);

        MenuCategory mainDishes = new MenuCategory("Main Dishes");
        MenuCategory drinks = new MenuCategory("Drinks");
        MenuCategory desserts = new MenuCategory("Desserts");

        mainDishes.add(dish1);
        mainDishes.add(dish2);
        drinks.add(dish3);
        desserts.add(dish4);

        Menu restaurantMenu = new Menu();
        restaurantMenu.add(mainDishes);
        restaurantMenu.add(drinks);
        restaurantMenu.add(desserts);

        restaurantMenu.print();

        //decorator
        patterns.decorator.Dish pizza = new Pizza("Pepperoni", 9.99);
        System.out.println(pizza.getDescription() +  " - "  + pizza.getPrice());
        pizza = new CheeseSidesDecorator(pizza);
        System.out.println(pizza.getDescription() +  " - "  + pizza.getPrice());
        pizza = new DoubleCheeseDecorator(pizza);
        System.out.println(pizza.getDescription() +  " - "  + pizza.getPrice());
        pizza = new DoubleMeatDecorator(pizza);
        System.out.println(pizza.getDescription() +  " - "  + pizza.getPrice());

        //facade
        TV tv = new TV();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();
        StreamingService streamingService = new StreamingService();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(tv, projector, soundSystem, streamingService);

        homeTheater.watchMovie("The Matrix", "Anastasiia");
        System.out.println("\nMovie has ended!");
        homeTheater.endMovie();

        //flyweight
        CosmeticProductFactory productFactory = new CosmeticProductFactory();
        CosmeticProduct lipstick1 = productFactory.getCosmeticProduct("Lipstick", "L'Oréal");
        lipstick1.displayProductInformation("Red");
        CosmeticProduct mascara1 = productFactory.getCosmeticProduct("Mascara", "Maybelline");
        mascara1.displayProductInformation("Black");
        CosmeticProduct powder1 = productFactory.getCosmeticProduct("Powder", "Clinique");
        powder1.displayProductInformation("Translucent");
        CosmeticProduct lipstick2 = productFactory.getCosmeticProduct("Lipstick", "L'Oréal");
        lipstick2.displayProductInformation("Pink");
        System.out.println("\nTotal unique product objects created: " + productFactory.getProductCount());

        //proxy
        Media movie1 = new MovieProxy("Inception", false);
        Media movie2 = new MovieProxy("The Matrix", true);

        System.out.println("Free Account:");
        movie1.play();

        System.out.println("\nPremium Account:");
        movie2.play();

    }
}
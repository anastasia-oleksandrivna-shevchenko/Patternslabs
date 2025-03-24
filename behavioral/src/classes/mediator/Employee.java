package classes.mediator;

public class Employee {
    private String name;
    private BookingMediator bookingMediator;

    public Employee(String name, BookingMediator bookingMediator) {
        this.name = name;
        this.bookingMediator = bookingMediator;
    }

    public String getName() {
        return name;
    }

    public void bookRoom(){
        System.out.println(this.name + " is trying to book the room");
        bookingMediator.requestRoom(this);
    }
    public void leaveRoom(){
        System.out.println(this.name + " is leaving the room");
        bookingMediator.releaseRoom(this);
    }
}

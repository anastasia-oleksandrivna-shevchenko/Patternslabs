package classes.mediator;

import java.util.ArrayList;
import java.util.List;

public class MeetingRoomBookingSystem  implements BookingMediator{
    private List<Employee> bookedRooms =  new ArrayList<>();
    private int roomNumber;

    public MeetingRoomBookingSystem(int roomNumber){
        this.roomNumber = roomNumber;
    }
    @Override
    public void requestRoom(Employee e) {
        if(bookedRooms.size() <  roomNumber){
            bookedRooms.add(e);
            System.out.println(e.getName() + " booked the room");
        }
        else{
            System.out.println("All rooms are already booked");
        }
    }
    @Override
    public void releaseRoom(Employee e) {
        if(bookedRooms.remove(e)){
            System.out.println(e.getName() + " left the room");
        }
        else{
            System.out.println(e.getName() + " haven`t booked the room");
        }
    }
}

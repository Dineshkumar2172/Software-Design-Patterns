package unified_modeling_language_uml;

import java.util.ArrayList;
import java.util.List;

class Room {

    private String name;

    public Room(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

class House {

    private String name;

    private List<Room> rooms;

    public House(String name){
        this.name = name;
        rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
        rooms.add(new Room("Bedroom"));
    }

    public void showRooms(){
        System.out.println("rooms from " + name + "'s house");
        for (Room room : rooms) {
            System.out.println(room.getName());
        }
    }
} 

public class CompositionExample {
    public static void main(String[] args) {
        // Composition: A stronger association where one object is part of another and cannot exist independently.
        //
        // Composition is a strong "has-a" relationship, where one class owns objects of another class. If the container object
        // is destroyed, the contained objects are destroyed as well.

        // If the house is destroyed, rooms are also destroyed
        House house = new House("Dinesh");
        house.showRooms();
    }

}

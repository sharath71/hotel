import java.util.ArrayList;
import java.util.List;

class Room {
    private String roomNumber;
    private double price;
    private List<String> photos;

    public Room(String roomNumber, double price) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.photos = new ArrayList<>();
    }

    public void addPhoto(String photoUrl) {
        photos.add(photoUrl);
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public List<String> getPhotos() {
        return photos;
    }
}

class Hotel {
    private String name;
    private List<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void displayDetails() {
        System.out.println("Hotel: " + name);
        for (Room room : rooms) {
            System.out.println("Room Number: " + room.getRoomNumber());
            System.out.println("Price: $" + room.getPrice());
            System.out.println("Photos:");
            for (String photo : room.getPhotos()) {
                System.out.println(photo);
            }
            System.out.println("---------------------");
        }
    }
}

public class HotelMain {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Example Hotel");

        Room room1 = new Room("101", 100.00);
        room1.addPhoto("https://www.google.co.in/search?sca_esv=1a09264f90f8d044&q=images&tbm=isch&source=lnms&prmd=ivsnmbtz&sa=X&ved=2ahUKEwjTn76qlYKFAxXnw6ACHR0WAOwQ0pQJegQIFRAB&biw=1366&bih=664&dpr=1#imgrc=ASMDFNsL7Vw1YM");
        room1.addPhoto("https://www.google.co.in/search?sca_esv=1a09264f90f8d044&q=images&tbm=isch&source=lnms&prmd=ivsnmbtz&sa=X&ved=2ahUKEwjTn76qlYKFAxXnw6ACHR0WAOwQ0pQJegQIFRAB&biw=1366&bih=664&dpr=1#imgrc=ASMDFNsL7Vw1YM");

        Room room2 = new Room("201", 150.00);
        room2.addPhoto("https://www.google.co.in/search?sca_esv=1a09264f90f8d044&q=images&tbm=isch&source=lnms&prmd=ivsnmbtz&sa=X&ved=2ahUKEwjTn76qlYKFAxXnw6ACHR0WAOwQ0pQJegQIFRAB&biw=1366&bih=664&dpr=1#imgrc=ASMDFNsL7Vw1YM");
        room2.addPhoto("https://www.google.co.in/search?sca_esv=1a09264f90f8d044&q=images&tbm=isch&source=lnms&prmd=ivsnmbtz&sa=X&ved=2ahUKEwjTn76qlYKFAxXnw6ACHR0WAOwQ0pQJegQIFRAB&biw=1366&bih=664&dpr=1#imgrc=ASMDFNsL7Vw1YM");

        hotel.addRoom(room1);
        hotel.addRoom(room2);

        hotel.displayDetails();
    }
}

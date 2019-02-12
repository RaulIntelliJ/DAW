public class Habitacion {
    public char roomCode;
    public int capacity;
    public int floor;
    private boolean available;



    public Habitacion(){
        System.out.println("Constructor");
    }

   public Habitacion(char roomCode, int capacity, int floor, boolean available){
        this.roomCode = roomCode;
        this.capacity = capacity;
        this.floor = floor;
        this.available = available;
    }

    public String toString(){
       return "RoomCode: " + this.roomCode + " Capacity: " + this.capacity + " Floor: " + this.floor + " Available: " + this.available;
    }



    public boolean getAvailable() {
        return available;
    }
}

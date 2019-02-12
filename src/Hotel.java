import java.util.Arrays;
import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char roomCode = 'a';
        byte capacity = 0;
        byte floor = 0;
        boolean available = false;
        char[] roomCodeArray = BuildRoomCode(roomCode);
        byte[] roomsCapacity = BuildRoomsCapacity();
        byte[] roomsFloor = BuildRoomsCapacity();
        boolean[] availabilities = BuildAvailabilities(available);
        showfloors(roomCodeArray, roomsCapacity, roomsFloor, availabilities);
        System.out.println("Dime la planta donde quieras saber las habitaciones");
        getRoomsFromFloor(roomsFloor, roomCodeArray, sc.nextByte());
        System.out.println("Dime la capacidad y te dire las habitaciones");
        getRoomsForCapacity(roomsCapacity, roomCodeArray, sc.nextByte());
        System.out.println("Dime la capacidad y te dire las habitaciones que tenemos disponibles");
        getAvailableRoomsForCapacity(roomsCapacity, roomCodeArray, availabilities, sc.nextByte());
    }

    private static void showfloors(char[] roomCodeArray, byte[] roomsCapacity, byte[] roomsFloor, boolean[] availabilities) {
        for ( int i = 0; i < roomCodeArray.length; i++ ) {
            System.out.println("RoomCode: " + roomCodeArray[i]);
            System.out.println("Capacity: " + roomsCapacity[i]);
            System.out.println("Floor: " + roomsFloor[i]);
            System.out.println("Available: " + availabilities[i]);
            System.out.println();
        }
    }

    private static boolean[] BuildAvailabilities(boolean available) {
        boolean[] availabilities = new boolean[20];
        for ( int i = 0; i < availabilities.length; i++ ) {
            available = !available;
            availabilities[i] = available;
        }
        return availabilities;
    } 

    private static byte[] BuildRoomsCapacity() {
        byte[] byteArray = new byte[20];
        for ( int i = 0; i < byteArray.length; i++ ) {
            byteArray[i] = (byte) (Math.floor(Math.random()*2) + 1);
        }
        return byteArray;
    }

    private static char[] BuildRoomCode(char roomCode) {
        char[] charArray = new char[20];
        for ( int i = 0; i < charArray.length; i++ ) {
            charArray[i] = roomCode += 1;
        }
        return charArray;
    }

    private static void getAvailableRoomsForCapacity(byte[] roomsCapacity, char[] roomCodes, boolean[] availabilities, byte capacity) {
        for ( int i = 0; i < roomsCapacity.length; i++ ) {
            if (roomsCapacity[i] ==  capacity && availabilities[i]){
                System.out.print(roomCodes[i] + ", ");
            }
        }
    }

    private static void getRoomsForCapacity(byte[] floors, char[] roomCode, byte capacity) {
        for ( int i = 0; i < floors.length; i++ ) {
            if (floors[i] ==  capacity){
                System.out.print(roomCode[i] + ", ");
            }
        }
    }

    private static void getRoomsFromFloor(byte[] floors, char[] roomCodeArray , byte floor) {
        for ( int i = 0; i < floors.length; i++ ) {
            if (floors[i] == floor){
                System.out.print(roomCodeArray[i] + ", ");
            }
        }
    }
}

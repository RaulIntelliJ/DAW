public class prueba {
    public static void main(String[] args) {
       Habitacion room = new Habitacion('a',2,2,true);
        System.out.println(room);
        System.out.println(room.getAvailable());
    }


    public Habitacion creaHabitacion(){
        return new Habitacion('a', 2, 2, true);
    }
}

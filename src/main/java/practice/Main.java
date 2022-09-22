package practice;

public class Main {
    public static void main(String[] args) {
       RamTruck ram = new RamTruck();
       Audi audi = new Audi();
       Tesla tesla = new Tesla();
       Bugatti bugatti = new Bugatti();
       BMW bmw = new BMW();

       ram.getSpeed();
       audi.getSpeed();
       tesla.getSpeed();
       bugatti.getSpeed();
       bmw.getSpeed();


    }
}

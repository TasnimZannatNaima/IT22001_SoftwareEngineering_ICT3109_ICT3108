class Vehicle {
    int speed = 130;
}

class Bike extends Vehicle {
    void showSpeed() {
        System.out.println("\nBike speed is " + speed + " km/h");
    }
}

public class Transport {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.showSpeed();
    }
}


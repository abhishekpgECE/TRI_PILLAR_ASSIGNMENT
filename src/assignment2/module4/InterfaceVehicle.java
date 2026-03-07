package assignment2.module4;

public interface InterfaceVehicle {
    interface Vehicle{
        void start();   // interface method
    }

    class Car implements Vehicle {
        public void start() {
            System.out.println("Car is starting");
        }
    }

       class interfacevehicle {
        public static void main(String[] args) {
            Car c = new Car();   // object creation
            c.start();           // method call
        }
    }
}

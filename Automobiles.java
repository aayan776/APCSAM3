abstract class Vehicle{
    private String make;
    private String model;
    private int year;
    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    abstract void drive();
}
class Car extends Vehicle{
    private int numDoors;
    Car(String make, String model, int year, int numDoors){
        super(make, model, year);
        this.numDoors = numDoors;
    }
    @Override
    public void drive(){
        System.out.println("Car is being driven");
    }
    public int getNumDoors(){
        return numDoors;
    }
}
class Truck extends Vehicle{
    private int capacity;
    Truck(String make, String model, int year, int capacity){
        super(make, model, year);
        this.capacity = capacity;
    }
    @Override
    public void drive(){
        System.out.println("Truck is being driven");
    }
    public int getCapacity(){
        return capacity;
    }
}
class Automobiles{
    public static void main(String[] args) {
        Vehicle c = new Car("Toyota", "Corolla", 1997, 4);
        Vehicle t = new Truck("Ford", "F-150", 2020, 5);

        c.drive();
        t.drive();
    }
}
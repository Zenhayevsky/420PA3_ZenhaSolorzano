abstract class Vehicle {

    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public abstract String getDescription();
}

class Car2 extends Vehicle {

    private int numberOfDoors;

    public Car2(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getDescription() {
        return "Car: " + getMake() + " " + getModel() + " (" + getYear() + "), Doors: " + numberOfDoors;
    }
}

package Builder.Car;

public class Car {
    private Doors doors;
    private Tires tires;

    
    public Doors getDoors() {
        return doors;
    }
    public void setDoors(Doors doors) {
        this.doors = doors;
    }
    public Tires getTires() {
        return tires;
    }
    public void setTires(Tires tires) {
        this.tires = tires;
    }
    @Override
    public String toString() {
        return "Car [doors=" + doors + ", tires=" + tires + "]";
    }

    
}

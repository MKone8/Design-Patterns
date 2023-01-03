package Builder.Car;

public class BigCarBuilder implements CarBuilder {



    private Car car;

    public BigCarBuilder(){
        this.car = new Car();
    }

    @Override
    public void buildTires() {
        Tires tires = new Tires();
        tires.setAmountOfWheels(4);
        car.setTires(tires);
        
        
    }

    @Override
    public void buildDoors() {
        Doors doors = new Doors();
        doors.setAmountOfDoors(2);
        car.setDoors(doors);
        
        
    }

    @Override
    public Car getCar() {

        return car;
    }

    @Override
    public String toString() {
        return "BigCarBuilder [car=" + car + "]";
    }
    
}

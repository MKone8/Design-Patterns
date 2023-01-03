package Builder.Car;

public class Doors {
    private int amount;

    public int getAmountOfDoors(){
        return amount;
    }
    public void setAmountOfDoors(int amount){
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Doors [amount=" + amount + "]";
    }
    
}

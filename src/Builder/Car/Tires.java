package Builder.Car;

public class Tires {
    private int amount;

    public int getAmountOfWheels(){
        return amount;
    }

    public void setAmountOfWheels(int amount){
        this.amount = amount;
        
    }

    @Override
    public String toString() {
        return "Tires [amount=" + amount + "]";
    }
    
}

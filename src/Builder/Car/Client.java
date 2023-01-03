package Builder.Car;

public class Client {
    public static void main(String[]args){
        CarBuilder carBuilder = new BigCarBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        carDirector.makeCar();

        Car car = carDirector.getCar();
        System.out.println(car);
    }
}

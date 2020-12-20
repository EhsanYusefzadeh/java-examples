package ir.javacup.toyfactory;


public class Main {
    public static void main(String[] args){

        Car car = new Car(20000, ToySize.SMALL);
        System.out.println(car.getPrice());
        System.out.println(car.getPrice(20));
    }
}

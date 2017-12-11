package ir.javacup.toyfactory;

public class Car extends Toy{

    // Constructor
    public Car(double basePrice, ToySize size){
        super(basePrice, size);
    }

    public double getPrice(){
        if(this.size == ToySize.SMALL){
            return 2 * this.getBasePrice();
        } else if(this.size == ToySize.MEDIUM){
            return 2.5 * this.getBasePrice();
        } else {
            return 3 * this.getBasePrice();
        }
    }



}

package ir.javacup.toyfactory;

public class Toy {
    private double basePrice;
    protected ToySize size;

    // Constructor
    public Toy(double basePrice, ToySize size){
        this.basePrice = basePrice;
        this.size = size;
    }

    // getter
    public double getPrice(){
        if(this.size == ToySize.SMALL){
            return this.getBasePrice();
        } else if(this.size == ToySize.MEDIUM){
            return this.getBasePrice() * 1.5;
        } else {
            return this.getBasePrice() * 2;
        }
    }

    // price getter with discount
    public double getPrice(double discount){
        return (this.getPrice()) - (this.getPrice() * discount / 100);
    }

    // getter for basePrice
    public double getBasePrice(){
        return this.basePrice;
    }
}

enum ToySize{
    SMALL, MEDIUM, LARGE
}

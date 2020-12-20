package ir.javacup.paint;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Circle extends Shape {
    Double redius;

    public Circle(Color c, Pattern p, double r) {
        super(c, p);
        this.redius = r;
    }


    public String toString() {

        NumberFormat nf = new DecimalFormat("##.###");

        String stringToReturn = "";
        stringToReturn = "Circle[color:";
        stringToReturn += this.color + ", pattern:";
        stringToReturn += this.pattern + ", redius:" + nf.format(this.redius) + "]";
        return stringToReturn;
    }


    public boolean equals(Circle crl){
        if(crl == null)
            return false;

        if(redius.equals(crl.redius) && this.color == crl.color && this.pattern == crl.pattern){
            return true;
        }else{
            return false;
        }
    }
}
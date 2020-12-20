package ir.javacup.paint;


public class Square extends Shape {

    Integer length;

    public Square(Color c, Pattern p, int length) {
        super(c, p);
        this.length = length; // autoboxing

    }

    public String toString(){
        String stringToReturn = "";
        stringToReturn = "Square[color:";
        stringToReturn += this.color + ", pattern:";
        stringToReturn += this.pattern + ", length:" + this.length + "]";
        return stringToReturn;
    }

    public boolean equals(Square sqr){
        if(sqr == null)
            return false;

        if(this.length == sqr.length && this.color == sqr.color && this.pattern == sqr.pattern){
            return true;
        }else{
            return false;
        }
    }
}
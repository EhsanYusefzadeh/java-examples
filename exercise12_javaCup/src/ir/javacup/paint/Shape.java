package ir.javacup.paint;


public class Shape {
    public static void main(String[] args){
        Circle c = new Circle(Color.BLUE, Pattern.DOTTED, 10);
        System.out.println(c);

        Square s = new Square(Color.BLUE, Pattern.DOTTED, 10);
        System.out.println(s);
    }

    Color color;
    Pattern pattern;

    public Shape(Color c, Pattern p) {
        this.color = c;
        this.pattern = p;
    }

}

enum Color {
    BLUE, GREEN, RED
}

enum Pattern {
    DOTTED, STRIPED, ZIGZAG
}
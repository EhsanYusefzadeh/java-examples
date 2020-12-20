import java.util.Random;

/**
 * Created by MNIM on 10/29/2017.
 */
public class Program {
    public static void main (String[] args){

        Random rand = new Random();

        int points = 10000000;
        double x, y;
        int SquarePoints = 0, CirclePoints = 0;

        for (int i = 0; i < points; i++) {
            x = Math.random();
            y = Math.random();

            if (x * x + y * y < 1){
                CirclePoints ++;
            }
            SquarePoints ++;
        }
        System.out.printf("%.4f", 4.0 * CirclePoints / SquarePoints);
    }
}
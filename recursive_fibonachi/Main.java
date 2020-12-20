import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input, count = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        while (count < input){
            System.out.println(fibonachi(count));
            count++;
        }
    }
    static long fibonachi(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return fibonachi(n - 1) + fibonachi(n - 2);
    }
}

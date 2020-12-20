import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input, count = 0;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        while (input >= count){
            System.out.println(factorial(count));
            count++;
        }
    }
    static long factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

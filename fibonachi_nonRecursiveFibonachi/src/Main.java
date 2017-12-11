import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int previous = 0;
        int current = 1;
        int input, res;
        int temp;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        while(current <= input){
            res = previous + current;
            System.out.println(res);
            temp = current;
            current = res;
            previous = temp;
        }
    }
}

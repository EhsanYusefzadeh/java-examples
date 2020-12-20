import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        for(int i = 1; i < 300; i++){
            long tmp = (long)Math.pow(2, i);
            if(tmp > input){
                System.out.println(tmp);
                break;
            }
        }
    }
}

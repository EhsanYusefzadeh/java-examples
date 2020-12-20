import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        input = 2 *input + 1;

        int a = 0, b = 0;
        for(int i = 1; i <= input; i+=2){

            //------- for printing correct spaces --------
            for(int k = input/2 - a - 1; k >= 0; k--){
                System.out.print(" ");
            }
            a++;
            //------- End of printing correct spaces -----


            for(int j = 1; j <= i; j++){
                    System.out.print("*");
            }
            System.out.println();
        }

        a = input/2 - 2;
        for(int i = input-2; i >= 1; i-=2){

            // for printing correct spaces
            for(int k = 1; k < input / 2 - a; k++){
                System.out.print(" ");
            }
            a--;
            // -----------------

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
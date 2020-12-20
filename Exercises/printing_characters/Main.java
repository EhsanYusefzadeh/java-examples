import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt();
        alphabitPrinterWithPace(input);
    }
    static void alphabitPrinterWithPace(int n){
        for (char ch = 'a'; ch <= 'z' ; ch += n){
            System.out.print(ch);
        }
    }
}

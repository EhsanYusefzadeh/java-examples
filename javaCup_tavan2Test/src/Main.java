import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLong();
        if(isPowerOfTwo(input)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
    static boolean isPowerOfTwo(long num){
        if(num == 1)
            return true;
        if(num % 2 != 0)
            return false;
        while (num > 2){
            if(num % 2 != 0)
                return false;
            num /= 2;
        }
        return true;
    }
}

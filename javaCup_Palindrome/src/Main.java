import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextLong();

        // Number of digits are produced correctly
        // System.out.println(numberOfDigits(input));

        // Reversing an number is working correctly
        // System.out.println(reversedNumber(input));

        if(isPalindrome(input)) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    static boolean isPalindrome(long n){
        if(reversedNumber(n) == n){
            return true;
        }
        else {
            return false;
        }
    }
    static int numberOfDigits(long n){
        if (n == 0){
            return 1;
        }
        int numOfDigs = 0;
        while(n > 0){
            numOfDigs++;
            n /= 10;
        }
        return numOfDigs;
    }
    static long reversedNumber(long n){
        long temp;
        long sum = 0;
        for(int i = numberOfDigits(n)-1; i >= 0; i--){
            temp = n % 10;
            sum += temp * Math.pow(10, i);
            n /= 10;
        }
        return sum;
    }
}

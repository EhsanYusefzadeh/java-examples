import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();
        for(int i = 0, j = input.length() - 1 ; i <=j; i++, j--){
            if(input.charAt(i) == input.charAt(j)){
                continue;
            }
            else{
                System.out.printf("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

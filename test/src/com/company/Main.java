import java.util.*;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i=0;
        int j=0;
        boolean k=false;

        if (n > 2) System.out.println(2);
        for (i=2 ; i <= n ; i++) {
            for (j = 2; j <i; j++) {


                if (i % j == 0) {
                    k = false;
                    break;
                }
                else k = true;
            }

            if (k==true) {System.out.println(i);}
        }

    }
}
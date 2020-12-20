
public class Main {
    public static void main(String[] args) {
        for (int i = 6; i <= 10000; i++){
            if(isComplete(i) == 1){
                System.out.println(i);
            }
        }
    }


    public static int isComplete(int in){
        int sum = 0;
        for (int i = 1; i < in; i++){
            if(in % i == 0){
                sum += i;
            }
        }
        if(sum == in){
            return 1;
        }
        else
        {
            return 0;
        }
    }
    }
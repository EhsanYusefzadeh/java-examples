public class Main {
    public static void main(String[] args) {
        int [] a = {6,5,9,7,1,2,3,4};
        sort(a);
    }
    static void sort(int[] array){
        int temp;

        // As I wrote this in this manner, in fact it acts like selection sort
        // which it searches for maximum
        // In fact in each pace we select maximum among remained elements

        for(int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
            for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }

    }
}
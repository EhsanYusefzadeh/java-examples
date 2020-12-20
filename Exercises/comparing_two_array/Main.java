public class Main {
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {1,2,3,4};
        if(isEqual(a, b)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    static boolean isEqual(int[] a, int[] b){
        if(a.length != b.length){
            return false;
        }
        for(int i=0; i<a.length; i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}

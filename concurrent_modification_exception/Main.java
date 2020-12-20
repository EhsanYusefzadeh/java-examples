import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        List<String> list2 = new ArrayList<String>();

        list2.add("Ali");
        list2.add("Jamshid");
        list2.add("Parviz");
        list2.add("Ehsan");
        list2.add("Akbar");
        list2.add("Ayhan");
        list2.add("Orhan");
        list2.add("Hussein");
        list2.add("Mohammad");
        list2.add("Ali");
        list2.add("Ahmad");

        Iterator<String> iterator = list2.iterator();

        while(iterator.hasNext()){
            String str = iterator.next();
            if(str == "Ali"){
                iterator.remove();
            }
        }

        iterator = list2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // this causes error because of concurrent modification
        /*for(Integer s: list){
            if(s.equals(1)){
                list.remove(s);
            }
        }*/

        Random random = new Random();
        Long[] array = new Long[100];
        Arrays.fill(array, 5L);

    }
}

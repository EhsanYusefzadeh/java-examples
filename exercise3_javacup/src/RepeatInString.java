public class RepeatInString {
    public int StringInString(String one, String two) {
        if(one == "" || two == "" || one == null || two == null){
            return 0;
        }

        int index = 0;
        int count = 0;

        // SuperString.indexOf(subString, indexToStartSearch) -> if not find will return -1

        while(index != -1){
            index = one.indexOf(two, index);
            if(index != -1){
                count++;
                index += 1;
                if(index >= one.length() ){
                    index = -1;
                }
            }
        }
        return count;
    }
}
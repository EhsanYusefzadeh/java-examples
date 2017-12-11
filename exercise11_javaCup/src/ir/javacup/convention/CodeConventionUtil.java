package ir.javacup.convention;

public class CodeConventionUtil {

    public String getFieldsName(String... params){
        String stringToReturn = "";
        String lowecased = "";
        for(int i = 0; i < params.length; i++){
            lowecased = params[i].toLowerCase();
            if(i != 0)
                lowecased = Character.toUpperCase(lowecased.charAt(0)) + lowecased.substring(1);
            stringToReturn += lowecased;
        }
        return stringToReturn;
    }

    public String getMethodsName(String... params){
        String stringToReturn = "";
        String lowecased = "";
        for(int i = 0; i < params.length; i++){
            lowecased = params[i].toLowerCase();
            if(i != 0)
                lowecased = Character.toUpperCase(lowecased.charAt(0)) + lowecased.substring(1);
            stringToReturn += lowecased;
        }
        return stringToReturn;
    }

    public String getClassName(String... params){
        String stringToReturn = "";
        String lowecased = "";
        for(int i = 0; i < params.length; i++){
            lowecased = params[i].toLowerCase();
            lowecased = Character.toUpperCase(lowecased.charAt(0)) + lowecased.substring(1);
            stringToReturn += lowecased;
        }
        return stringToReturn;
    }

    public String getConstantsName(String... params){
        String stringToReturn = "";
        String uppercased = "";
        for(int i = 0; i < params.length; i++){
            uppercased = params[i].toUpperCase();
            stringToReturn += uppercased;
            if(i < params.length-1)
                stringToReturn += "_";
        }
        return stringToReturn;    }

}
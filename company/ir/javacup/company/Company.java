package ir.javacup.company;

public class Company {
    private static String name = "JavaCup.co";

    private static Company instance = new Company();

    private Company(){}

    public static String getName(){
        return Company.name;
    }

    public static void setName(String n){
        Company.name = n;
    }

    public static  Company getInstance(){
        return instance;
    }
}

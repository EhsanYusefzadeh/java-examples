package com.company;

public class Main {

    public static void main(String[] args) {
        print("Ehsan","is","King");
        print("he is", "a good developer");
    }

    static void print(String ...  params){
        String[] array = params;
        System.out.println(array.length);
        for(String p: params){
            System.out.println(p);
        }
    }
}

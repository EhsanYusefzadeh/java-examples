package com.company;
// before submitting it on quera site, you have to remove the package directives in files


public class Branch {
    private String code;
    private String city;
    private int rate;

    // setters and getters
    public void setCode(String code){
        this.code = code;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setRate(int rate){
        this.rate = rate;
    }

    public String getCode(){
        return code;
    }

    public String getCity() {
        return city;
    }

    public int getRate(){
        return rate;
    }
}
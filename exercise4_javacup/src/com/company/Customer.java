package com.company;
// before submitting it on quera site, you have to remove the package directives in files

public class Customer {
    private String name;
    Account account;
    CreditCard creditCard;

    // setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public double calCustomerBalance(){
        return (creditCard.getCredit() + account.getBalance());
    }
}

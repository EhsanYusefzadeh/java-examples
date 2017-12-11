public class Book {
    private String title;
    private int numOfPages;
    private double price;
    private int quantity;

    // Constructor
    public Book(String title, int numOfPages, double price, int quantity){
        this.title = title;
        this.numOfPages = numOfPages;
        this.price = price;
        this.quantity = quantity;
    }

    // sell method
    public double sell(int quantity){
        if(quantity == 0 || quantity < 0 || quantity > this.quantity){
            return 0;
        }
        this.quantity -= quantity;
        return this.price*quantity;
    }

    // showing all information of a book
    public String toString(){
        return "Book Title: " + this.title + "\n" + "Book Number of Pages: " +this.numOfPages
                + "\n" + "Book Price: " + this.price + "\n" + "Book Quantity: " +
                this.quantity;
    }

    // method for creating a new book on more than 300 pages books
    public Book cliffNote(){
        if(this.numOfPages <= 300){
            return null;
        } else {
            Book newBook = new Book(this.title + "Cliff", this.numOfPages/6, this.price/2,
                    this.quantity);
            return newBook;
        }
    }

    // returns book object title
    public String getTitle(){
        return this.title;
    }




    // Exercise 2 - Part 2 - Adding 3 methods to Book class

    public void addQuantity(int newQuantity){
        this.quantity = newQuantity;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double getPrice(){
        return this.price;
    }


    // method which should be added
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
}

import java.util.ArrayList;

public class BookStore {

    // attributes
    private String name;
    private ArrayList<Book> books;
    private double income = 0;

    public BookStore(String name, ArrayList<Book> books){
        this.name = name;
        this.books = books;
    }

    // methods
    public void addNewBook(Book book){
        books.add(book);
    }

    public void addBookQuantity(String title, int quantity){

        boolean isThereBookWithThisTitle = false;

        for(int i=0; i<books.size(); i++){
            if(books.get(i).getTitle() == title){
                books.get(i).setQuantity(quantity);
                isThereBookWithThisTitle = true;
                break;
            }
        }
        if(isThereBookWithThisTitle == false){
            System.out.println("Nothing is Done!");
        }
    }



    public boolean inStock(String title, int quantity){

        for(int i=0; i < books.size(); i++){
            if(books.get(i).getTitle() == title){
                if(books.get(i).getQuantity() >= quantity){
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }


    public boolean sell(String title, int quantity){
        int temp;

        if(inStock(title, quantity)){
            for(int i=0; i<books.size(); i++){
                if(books.get(i).getTitle() == title){
                    temp = books.get(i).getQuantity() - quantity;
                    books.get(i).setQuantity(temp);
                    income += quantity * books.get(i).getPrice();
                    return true;
                }
            }
        }
        return false;
    }

    public void listTitles(){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i) != null) {
                System.out.println(books.get(i).getTitle());
                System.out.println(" --------------------- ");
            }
        }
    }


    public double getIncome(){
        return this.income;
    }

}
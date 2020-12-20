import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Book Class Test
        Book book1 = new Book("C++", 400, 40, 100);
        Book book2 = new Book("Java", 300, 40, 100);

        Book cliffBook1;
        Book cliffBook2;

        cliffBook1 = book1.cliffNote();
        cliffBook2 = book2.cliffNote();

        System.out.println(book1.toString());
        System.out.println(book2.toString());


        System.out.println(cliffBook1.toString());
        if(cliffBook2 == null){
            System.out.println("Nothing");
        }

        System.out.println(book1.getTitle());
        System.out.println(book2.getTitle());
        System.out.println(cliffBook1.getTitle());
        if(cliffBook2 != null) {
            System.out.println(cliffBook2.getTitle());
        }else{
            System.out.println("Nothing");
        }
        System.out.println(book1.sell(5));
        if(cliffBook2 != null) {
            System.out.println(book2.sell(3));
        }else{
            System.out.println("Nothing");
        }
        System.out.println(cliffBook1.sell(2));
        if(cliffBook2 != null) {
            System.out.println(cliffBook2.sell(1));
        }else{
            System.out.println("Nothing");
        }




        // BookStore class Test
        ArrayList<Book> booksArrayList = new ArrayList<Book>();

        booksArrayList.add(book1);
        booksArrayList.add(book2);
        booksArrayList.add(cliffBook1);
        booksArrayList.add(cliffBook2);


        BookStore bs1 = new BookStore("Mehro Mah", booksArrayList);


        Book newBook = new Book("Perl, Learn How to Program!", 240, 300, 1000);
        bs1.addNewBook(newBook);

        System.out.println(bs1.getIncome());

        bs1.listTitles();


        if(bs1.inStock("C++", 10))
            System.out.println("CPP Yes");
        else
            System.out.println("CPP NO");

        if(bs1.inStock("Java", 2))
            System.out.println("Java YES");
        else
            System.out.println("Java NO");

        bs1.listTitles();

        if(bs1.inStock("C++", 4)){
            System.out.println("In Stock YES");
        }
        else {
            System.out.println("In Stock NO");
        }

        bs1.addBookQuantity("C++", 100);
        bs1.addBookQuantity("Java", 100);


        bs1.listTitles();

        bs1.sell("C++", 10);
        bs1.sell("Java", 10);

        System.out.println(bs1.getIncome());

/*        ArrayList<Book> books1 = new ArrayList<Book>();
        Book book1 = new Book("C++", 400, 40, 100);
        Book book2 = new Book("Java", 300, 40, 100);
        books1.add(book1);
        books1.add(book2);

        ArrayList<Book> books2 = books1;

        for(int i=0; i<books2.size(); i++)
            System.out.println(books2.get(i).getTitle());*/
    }
}

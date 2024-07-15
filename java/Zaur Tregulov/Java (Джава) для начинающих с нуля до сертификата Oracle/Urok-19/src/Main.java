class Book{
    double price;
    String name;

    Book(double price, String name){
        this.name=name;
        this.price=price;
    }
}

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(34.5, "Book1");
        Book book2 = new Book(32.1, "Book2");
        Book book3 = new Book(16.3, "Book3");
        Book books[] = {book1, book2, book3};

        for (Book book: books){
            System.out.println(book.name);
        }

        String s1 = "salom";
        String s2 = "salom1";
        String s3 = "salom2";
        String str[] = {s1, s2, s3};

        for (String s: str){
            System.out.println(s);
        }
    }
}

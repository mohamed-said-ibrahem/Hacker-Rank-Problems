import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

//start of code
class MyBook extends Book{
    String title;
    String author;
    int price;
    
    MyBook(String title, String author,int price){
        super(title,author);
        this.price = price;
    }
    void display(){
        System.out.println("Title: "+super.title);
        System.out.println("Author: "+super.author);
        System.out.println("Price: "+price);
    }
}

//end of code

public class Solution {
	   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}
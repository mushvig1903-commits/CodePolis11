package Mentor.Lesson6OOP.Book;

public class BookMain {
    static void main(String[] args) {

    Book book1 = new Book("Shantaram","Gregory David Roberts",936);
    Book book2 = new Book("Sufis: The People of the Path", "Osho", 461);
    System.out.println("Book name: " + book1.getName()+ ". Author: " + book1.getAuthor()+ ". Page: " + book1.getPageCount() );
    System.out.println("Book name: " + book2.getName()+ ". Author: " + book2.getAuthor()+ ". Page: " + book2.getPageCount() );
    book1.setName("The Mountain Shadow");
    book1.setPageCount(912);
    System.out.println("Update Book name: " + book1.getName()+ ". Author: " + book1.getAuthor()+ ". Update Page: " + book1.getPageCount() );


    }
}


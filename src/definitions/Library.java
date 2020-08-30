/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    private Book[] availableBooks;

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Library() {
        Book book1 = new Book("java for beginners", "Roy", "123456789S234");
        Book book2 = new Book("Electronic engineering", "Troy", "121356789X237");
        Book book3 = new Book("C language", "Steve", "153456789A239");
        Book book4 = new Book("Engineering mathematics", "Justin", "624456789C238");
        Book[] books = new Book[]{book1, book2, book3, book4};
        this.availableBooks = books;
    }

    public Book[] getAvailableBooks() {
        return availableBooks;
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBooks=" + Arrays.toString(availableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getAvailableBooks(), library.getAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBooks());
    }

    /**
     * This method will allow us to issue a book from Library.
     *
     * @param nameOfBook name of book which we want.
     */
    public void issueBook(String nameOfBook) {
        System.out.println("Book Name \"" + nameOfBook + "\" assigned to You");
    }

    /**
     * This method will allow us to see previous books issued to student.
     *
     * @param studentName name of book which we want.
     * @param rollNumber  name of book which we want.
     * @param books       name of book which we want.
     */
    public void issuedBooksToStudent(String studentName, long rollNumber, Book[] books) {
        System.out.println("books assigned to  " + studentName + " roll number " + rollNumber + " are: " + Arrays.toString(books));
    }

    /**
     * this method is allow us to return book to Library.
     */

    public void returnBook() {
        String bookName;
        System.out.println("Enter the name which you want to return");
        Scanner scanner = new Scanner(System.in);
        bookName = scanner.nextLine();
        System.out.println("Thank you for returning book: \"" + bookName + "\"");
    }
}
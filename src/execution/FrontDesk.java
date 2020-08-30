/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Arrays;
import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_NEW_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_ALL_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int customerInput;
        String studentName;
        long universityRollNumber;
        String nameOfBook;
        String authorName;
        String ISBNNumber;
        System.out.println("Enter your Name\r");
        studentName = scanner.nextLine();
        System.out.println("Enter your university roll number\r");
        universityRollNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter book name you have assigned earlier\r");
        nameOfBook = scanner.nextLine();
        System.out.println("Enter book's author Name");
        authorName = scanner.nextLine();
        System.out.println("Enter 13 digit ISBN number");
        ISBNNumber = scanner.nextLine();
        Book book = new Book(nameOfBook, authorName, ISBNNumber);
        Book[] issuedBooks = {book};
        Student student = new Student(studentName, universityRollNumber, issuedBooks.length, issuedBooks);
        Library library = new Library();
        System.out.println("******************************************************************************");

    }

}
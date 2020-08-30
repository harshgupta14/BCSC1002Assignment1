/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;
import java.util.Objects;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumber;

    public Book(String bookName, String authorName, String ISBNNumber) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumber = ISBNNumber;
    }
    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }



}
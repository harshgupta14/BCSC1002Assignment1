/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String studentFullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private long universityRollNumber;
    private int numberOfBooksIssuedToStudent;
    private Book[] nameOfBooksIssuedToStudent;

    public Student() {
    }

    public Student(String studentFullName, long universityRollNumber, int numberOfBooksIssuedToStudent, Book[] nameOfBooksIssuedToStudent) {
        this.studentFullName=studentFullName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssuedToStudent = numberOfBooksIssuedToStudent;
        this.nameOfBooksIssuedToStudent = nameOfBooksIssuedToStudent;
    }

    public Student(String firstName, String middleName, String lastName, long universityRollNumber, int numberOfBooksIssuedToStudent, Book[] nameOfBooksIssuedToStudent) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.universityRollNumber = universityRollNumber;
        this.numberOfBooksIssuedToStudent = numberOfBooksIssuedToStudent;
        this.nameOfBooksIssuedToStudent = nameOfBooksIssuedToStudent;
        this.studentFullName = firstName + middleName + lastName;

    }


}

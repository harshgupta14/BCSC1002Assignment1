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

    public String getStudentFullName() {
        return studentFullName;
    }

    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssuedToStudent() {
        return numberOfBooksIssuedToStudent;
    }

    public void setNumberOfBooksIssuedToStudent(int numberOfBooksIssuedToStudent) {
        this.numberOfBooksIssuedToStudent = numberOfBooksIssuedToStudent;
    }

    public Book[] getNameOfBooksIssuedToStudent() {
        return nameOfBooksIssuedToStudent;
    }

    public void setNameOfBooksIssuedToStudent(Book[] nameOfBooksIssuedToStudent) {
        this.nameOfBooksIssuedToStudent = nameOfBooksIssuedToStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFullName='" + studentFullName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssuedToStudent=" + numberOfBooksIssuedToStudent +
                ", nameOfBooksIssuedToStudent=" + Arrays.toString(nameOfBooksIssuedToStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssuedToStudent() == student.getNumberOfBooksIssuedToStudent() &&
                Objects.equals(getStudentFullName(), student.getStudentFullName()) &&
                Objects.equals(getFirstName(), student.getFirstName()) &&
                Objects.equals(getMiddleName(), student.getMiddleName()) &&
                Objects.equals(getLastName(), student.getLastName()) &&
                Arrays.equals(getNameOfBooksIssuedToStudent(), student.getNameOfBooksIssuedToStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getStudentFullName(), getFirstName(), getMiddleName(), getLastName(), getUniversityRollNumber(), getNumberOfBooksIssuedToStudent());
        result = 31 * result + Arrays.hashCode(getNameOfBooksIssuedToStudent());
        return result;
    }
}
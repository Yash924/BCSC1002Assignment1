/*  Created by IntelliJ IDEA.
 *  User: Yash Garg (yash924)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;

public class Student {
    private String studentFirstName;
    private String StudentMiddleName;
    private String studentLastName;
    private long studentUniversityRollNumber;
    private int numberOfIssuedBooks;
    private String[] issuedBooksName;

    public Student()
    {   this.studentFirstName = "studentFirstName";
        this.StudentMiddleName = "studentMiddleName";
        this.studentLastName = "studentLastName";
        this.studentUniversityRollNumber = 191500924;
        this.numberOfIssuedBooks = 3;
        this.issuedBooksName = new String[numberOfIssuedBooks];
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentMiddleName() {
        return StudentMiddleName;
    }

    public void setStudentMiddleName(String studentMiddleName) {
        StudentMiddleName = studentMiddleName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public long getStudentUniversityRollNumber() {
        return studentUniversityRollNumber;

    }

    public void setStudentUniversityRollNumber(long studentUniversityRollNumber) {
        this.studentUniversityRollNumber = studentUniversityRollNumber;
    }

    public int getNumberOfIssuedBooks() {
        return numberOfIssuedBooks;
    }

    public void setNumberOfIssuedBooks(int numberOfIssuedBooks) {
        this.numberOfIssuedBooks = numberOfIssuedBooks;
    }

    public String[] getIssuedBooksName() {
        return issuedBooksName;
    }

    public void setIssuedBooksName(String[] issuedBooksName) {
        this.issuedBooksName = issuedBooksName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentFirstName='" + studentFirstName + '\'' +
                ", StudentMiddleName='" + StudentMiddleName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                ", studentUniversityRollNumber=" + studentUniversityRollNumber +
                ", numberOfIssuedBooks=" + numberOfIssuedBooks +
                ", issuedBooksName=" + Arrays.toString(issuedBooksName) +
                '}';
    }
}






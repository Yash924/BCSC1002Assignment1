/*  Created by IntelliJ IDEA.
 *  User: Yash Garg (yash924)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

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
}
/*  Created by IntelliJ IDEA.
 *  User: Yash Garg (yash924)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Student;
import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    public static void main(String[] args) {
        Student student = new Student();
        Book book = new Book();
        Library library = new Library();
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
        System.out.println("How may I help you today?");
        System.out.println("1. Issue a new book for me.");
        System.out.println("2. Return a previously issues book for me.");
        System.out.println("3. Show me all my issues books.");
        System.out.println("4. Exit.");
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter the number");
        int choice = scannerObject.nextInt();
        if (choice == 1) {
            System.out.println("Enter your First name: ");
            student.setStudentFirstName(scannerObject.nextLine());
            System.out.println("Enter your Middle name: ");
            student.setStudentMiddleName(scannerObject.nextLine());
            System.out.println("Enter your Last name: ");
            student.setStudentLastName(scannerObject.nextLine());
            System.out.println("Enter your University roll number: ");
            student.setStudentUniversityRollNumber(scannerObject.nextLong());
            System.out.println("Enter the details of the books you want to issue: ");
            System.out.println("enter book name");
            String bookName = scannerObject.nextLine();
            System.out.println("enter book author name");
            String bookAuthorName = scannerObject.nextLine();
            System.out.println("enter isbn number of the book");
            String bookIsbnNumber = scannerObject.nextLine();
            System.out.println("Currently available books in the library: ");
            library.availableBooks();
            scannerObject.nextLine();
            System.out.println("Thank you for Issuing the Books..");
        }

        if (choice == 2) {
            System.out.println("Enter the name of the book you want to return: ");
            scannerObject.nextLine();
            String bookName = scannerObject.nextLine();
            if (bookName.equals(student.getIssuedBooksName())) {
                System.out.println("Thank you for returning the book " + bookName + ".");
            } else if (student.getNumberOfIssuedBooks() == 0) {
                System.out.println("THere is no issued book in your account so you are not egible o return any book");
            } else {
                System.out.println("Ivaild Book Name,Please check again");
            }
        }
        if (choice == 3) {
            student.getIssuedBooksName();
        }
        if (choice == 4) {
            System.out.println("Thanks for using our service.");
            System.exit(0);
        }
    }
}







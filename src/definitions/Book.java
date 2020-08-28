/*  Created by IntelliJ IDEA.
 *  User: Yash Garg(yash924)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthorName;
    private String isbnNumber;

   public Book(String bookName,String bookAuthorName,String isbnNumber){
       this.bookName=bookName;
       this.bookAuthorName=bookAuthorName;
       this.isbnNumber=isbnNumber;
   }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName =bookName;
    }

    public String getBookAuthorName() {
        return bookAuthorName;
    }

    public String getISBN() {
        return isbnNumber;
    }

    public void setISBN(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthorName='" + bookAuthorName + '\'' +
                ", isbnNumber='" + isbnNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getBookAuthorName(), book.getBookAuthorName()) &&
                Objects.equals(isbnNumber, book.isbnNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getBookAuthorName(), isbnNumber);
    }
}




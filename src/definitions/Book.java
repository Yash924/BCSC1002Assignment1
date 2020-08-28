/*  Created by IntelliJ IDEA.
 *  User: Yash Garg(yash924)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : book.java
 * */
package definitions;
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
}

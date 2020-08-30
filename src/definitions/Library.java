/*  Created by IntelliJ IDEA.
 *  User: Yash Garg(yash924)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;
import java.util.Arrays;

public class Library {
    private Book [] currentlyAvailableBooks;
    private static final int MAXIMUM_BOOKS = 3;

    public Library() {
        this.currentlyAvailableBooks= new Book[MAXIMUM_BOOKS];
        for (int Index = 0; Index < MAXIMUM_BOOKS; Index++) {
            this.currentlyAvailableBooks[Index] = new Book();
        }
    }

    public Book[] getCurrentlyAvailableBooks() {
        return currentlyAvailableBooks;
    }

    public void setCurrentlyAvailableBooks(Book[] currentlyAvailableBooks) {
        this.currentlyAvailableBooks = currentlyAvailableBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "currentlyAvailableBooks=" + Arrays.toString(currentlyAvailableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getCurrentlyAvailableBooks(), library.getCurrentlyAvailableBooks());
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(getCurrentlyAvailableBooks());

    }
    public void availableBooks(){
        currentlyAvailableBooks[0].setBookName("java:The complete Refrence");
        currentlyAvailableBooks[0].setBookAuthorName("Yashkant");
        currentlyAvailableBooks[0].setIsbnNumber("8765435467546");
        currentlyAvailableBooks[1].setBookName("Let Us Python");
        currentlyAvailableBooks[1].setBookAuthorName("zed Shaw");
        currentlyAvailableBooks[1].setIsbnNumber("1234567898765");
        currentlyAvailableBooks[2].setBookName("C: Amordren Approach");
        currentlyAvailableBooks[2].setBookAuthorName("K.N.King");
        currentlyAvailableBooks[2].setIsbnNumber("5643289756098");
    }
    public void showBooks(){
        System.out.println("Currently Available Books are: ");
        System.out.println(Arrays.toString(currentlyAvailableBooks));
    }
}

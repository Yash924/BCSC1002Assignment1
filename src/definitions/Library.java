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

    }}

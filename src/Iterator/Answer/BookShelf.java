package Answer;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private final ArrayList<Book> books;

    public BookShelf(final int initialsize) {
        this.books = new ArrayList<Book>(initialsize);
    }

    public Book getBookAt(final int index) {
        return (Book)books.get(index);
    }

    public void appendBook(final Book book) {
        books.add(book);
    }
    public int getLength() {
        return books.size();
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
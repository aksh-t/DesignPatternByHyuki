package Answer;
 

public class BookShelf implements Aggregate{
    private final Book[] books;
    private int last = 0;

    public BookShelf(final int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(final int index) {
        return books[index];
    }

    public void appendBook(final Book book) {
        this.books[last] = book;
        last++;
    }
    public int getLength() {
        return last;
    }
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
package Iterator.Answer;

public class BookShelfIterator implements Iterator {
    private final BookShelf bookShelf;
    private int index;

    public BookShelfIterator(final BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        final Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
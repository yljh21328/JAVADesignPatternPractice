package iterator1;

public class BookShelf {
    private Book[] bookCollection;
    private int last = 0;
    public BookShelf(int maxsize) {
        this.bookCollection = new Book[maxsize];
    }
    public Book getBookAt(int index) {
        return bookCollection[index];
    }
    public void appendBook(Book book) {
        this.bookCollection[last] = book;
        last++;
    }
    public int getLength() {
        return last;
    }
}

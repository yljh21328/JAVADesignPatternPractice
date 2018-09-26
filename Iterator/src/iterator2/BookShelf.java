package iterator2;

import iterator.Iterator;

public class BookShelf {
    private Book[] bookCollection;
    //private Vector bookCollection;
    private int last = 0;
    public BookShelf(int maxsize) {
        bookCollection = new Book[maxsize];
        //bookCollection = new Vector(maxsize); 
    }

    public Book getBookAt(int index) {
        return bookCollection[index];
       //return bookCollection.get(index);
    }

    public void appendBook(Book book) {
        bookCollection[last] = book;
        //bookCollection.add(book);
        last++;
    }

    public int getLength() {
        return last;
        //return bookCollection.capacity();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}

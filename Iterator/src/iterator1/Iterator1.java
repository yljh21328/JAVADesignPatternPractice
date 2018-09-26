package iterator1;

public class Iterator1 {

    public static void main(String[] args) {
        System.out.println("Iterator1");
        BookShelf bookShelf = new BookShelf(3);
        Book book;
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        for(int i = 0; i < bookShelf.getLength(); i++) {
           book = bookShelf.getBookAt(i);
           System.out.println("" + book.getName());
        }
    }

}

package iterator2;

import iterator.Iterator;

public class Iterator2 {

    public static void main(String[] args) {
        System.out.println("Iterator2");
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("A"));
        bookShelf.appendBook(new Book("B"));
        bookShelf.appendBook(new Book("C"));
        //我們只有用到Iterator的方法，實際上BookShelf內部怎麼實作的我們不管。
        //如果今天BookShelf把陣列改成vector，下面的程式碼還是不會變動。
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
        }
    }

}

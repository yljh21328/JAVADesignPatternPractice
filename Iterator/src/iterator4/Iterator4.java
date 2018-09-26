package iterator4;

import java.util.Iterator;

import iterator4.Book;
import iterator4.ConcreteAggregate;

public class Iterator4 {

    public static void main(String[] args) {
        System.out.println("Iterator4");
        ConcreteAggregate collection = new ConcreteAggregate(3);

        collection.appendItem(new Book("A"));
        collection.appendItem(new Book("B"));
        collection.appendItem(new Book("C"));
        Iterator<Object> it = collection.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
        }
        
        for (Object book : collection) {
            System.out.println("" + ((Book)book).getName());
        }
    }

}

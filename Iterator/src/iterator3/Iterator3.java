package iterator3;

import iterator.Iterator;

public class Iterator3 {

    public static void main(String[] args) {
        System.out.println("Iterator3");
        ConcreteAggregate collection = new ConcreteAggregate(3);

        collection.appendItem(new Book("A"));
        collection.appendItem(new Book("B"));
        collection.appendItem(new Book("C"));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
        }
    }

}

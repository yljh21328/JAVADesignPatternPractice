package iterator3;

import iterator.Iterator;

public class ConcreteIterator implements Iterator {
    private ConcreteAggregate collection;
    private int index;
    public ConcreteIterator(ConcreteAggregate collection) {
        this.collection = collection;
        this.index = 0;
    }
    public boolean hasNext() {
        if (index < collection.getLength()) {
            return true;
        } else {
            return false;
          }
    }
    public Object next() {
        Object item = collection.getItemAt(index);
        index++;
        return item;
    }
}

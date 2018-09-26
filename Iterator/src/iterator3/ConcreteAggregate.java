package iterator3;

import iterator.Aggregate;
import iterator.Iterator;

public class ConcreteAggregate implements Aggregate {
    private Object[] collection;
    //private Vector collection;
    private int last = 0;
    public ConcreteAggregate(int maxsize) {
        collection = new Object[maxsize];
        //collection = new Vector(maxsize); 
     }

    public Object getItemAt(int index) {
        return collection[index];
       //return ((Object)collection.get(index));
    }

    public void appendItem(Object item) {
        this.collection[last] = item;
        //collection.add(item);
        last++;
    }

    public int getLength() {
        return last;
        //return collection.capacity();
    }

    public Iterator iterator() {
        return new ConcreteIterator(this);
    }
}

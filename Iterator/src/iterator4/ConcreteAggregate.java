package iterator4;

import java.util.Iterator;

public class ConcreteAggregate implements Iterable<Object> {
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

    @Override
    public Iterator<Object> iterator() {
        return new ConcreteIterator(this);
    }

}

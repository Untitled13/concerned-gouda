
import java.util.*;


public abstract class SinglyLinked implements Iterable<Object> {
    abstract public SinglyLinked push(Object x);
    abstract public SinglyLinked rest(); 
    abstract public Object first();
    abstract public boolean contains(Object x);
    abstract public int size();
    abstract public boolean isEmpty();
    abstract public Object get(int n);
    abstract public SinglyLinked remove(Object x);
    abstract public SinglyLinked join(SinglyLinked other);
    abstract public SinglyLinked id();
    abstract public Object find(Object x);
    public Iterator<Object> iterator() {
        return new Iterator<Object>() {
            SinglyLinked current = id();
            public boolean hasNext() {
                return !current.isEmpty();
            }
            Object temp;
            public Object next() {
                temp = current.first();
                current = current.rest();
                return temp;
            }
        };
    }
}
import java.util.*;

public class HashTable implements Iterable<Object> {
    int size = 16;
    int elements = 0;
    double loadFactor = .8;
    double minLoad = .5;

    SinglyLinked[] table; // actual type SinglyLinked<Pair<A,B>>
    public HashTable(int s) {
        size = s;
        init();
    }
    public HashTable() {
        init();
    }
    private void init() {
        table = new SinglyLinked[size];
        for (int i=0; i<size; i++)
            table[i] = new Empty();
        elements = 0;
    }
    public boolean add(Object a) {
        elements ++;
        table[index(a)] = table[index(a)].push(a);
        resize();
        return true;
    }
    private int index(Object a) {
        int x;
        return (x = a.hashCode() % size) < 0 ? x + size : x;
    }
    public boolean contains(Object a) {
        return table[index(a)].contains(a);
    }
    public void resize(int n) {
        if ((double) elements / size >= loadFactor) {
            SinglyLinked temp = toList();
            size = (int) (elements / minLoad);
            init();
            addAll(temp);
        }
    }
    public void resize() {
        resize(size * 2);
    }
    public SinglyLinked toList() {
        SinglyLinked temp = new Empty();
        for (int i = 0; i < size; i++)
            temp = table[i].join(temp);
        return temp;
    }
    public void remove(Object a) {
        elements --;
        table[index(a)] = table[index(a)].remove(a);
    }
    public Iterator<Object> iterator() {
        return toList().iterator();
    }
    public String toString() {
        String stor = "";
        for (int i = 0; i < size; i++)
            stor += "{" + table[i].toString() + "}\n";
        return stor;
    }
    public void addAll(Iterable<Object> coll) {
        coll.forEach(x -> add(x));
    }
    public Object get(Object a) {
        return table[index(a)].find(a);
    }
}

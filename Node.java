import java.util.*;

public class Node extends SinglyLinked{
    Object first;
    SinglyLinked rest;

    public Node(Object x) {
        first = x;
        rest = new Empty();
    }
    public Node(Object x, SinglyLinked y) {
        first = x;
        rest = y;
    }
    public SinglyLinked push(Object x) {
        return new Node(x, this);
    }
    public SinglyLinked rest() {
        return rest;
    }
    public Object first() {
        return first;
    }
    public SinglyLinked join(SinglyLinked other) {
        return new Node(first(), rest().join(other));
    }
    public boolean contains(Object x) {
        return x.equals(first()) || rest().contains(x);
    }
    public String toString() {
        return first().toString() + " " + rest().toString();
    }
    public int size() {
        return 1 + rest().size();
    }
    public boolean isEmpty() {
        return false;
    }
    public Object get(int n) {
        if (n == 0)
            return first();
        return rest().get(n-1);
    }
    public SinglyLinked remove(Object x) {
        if (first().equals(x))
            return rest();
        return (rest().remove(x)).push(first());
    }
    public SinglyLinked id() {
        return this;
    }
    public Object find(Object a) {
        if (a.equals(first()))
            return first();
        return rest().find(a);
    }
}
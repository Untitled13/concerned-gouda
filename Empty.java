
public class Empty extends SinglyLinked {
    public SinglyLinked rest() {
        return new Empty();
    }
    public boolean contains(Object x) {
        return false;
    }
    public Object first() {
        return null;
    }
    public SinglyLinked push(Object x) {
        return new Node(x);
    }
    public String toString() {
        return "";
    }
    public int size() {
        return 0;
    }
    public boolean isEmpty() {
        return true;
    }
    public Object get(int i) {
        return null;
    }
    public SinglyLinked remove(Object x) {
        return this;
    }
    public SinglyLinked join(SinglyLinked other) {
        return other;
    }
    public SinglyLinked id() {
        return this;
    }
    public Object find(Object x) {
        return null;
    }
}



public class Pair {
    private Object left;
    private Object right;    
    
    public Pair(Object x) {
        left = x;
    }
    public Pair(Object a, Object b) {
        left = a;
        right = b;
    }
    public Object left() {
        return left;
    }
    public Object right() {
        return right;
    }
    public boolean equals(Pair other) {
        return left().equals(other.left());
    }
    public boolean equals(Object other) {
        return other.equals(left());
    }
    public String toString() {
        return "(" + left() + ", " + right() + ")";
    }
    public int hashCode() {
        return left.hashCode();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        SinglyLinked list = new Node(1, new Node(3));
        HashTable hash = new HashTable(3);
        hash.add(13);
        hash.add(-1);
        System.out.println(hash);
        hash.add(4);
        hash.add(15);
        // System.out.println(hash.toList());
        System.out.println(hash);
        System.out.println(hash.contains(4));
        System.out.println(hash.contains(-1));
        System.out.println(hash.contains(15));
        System.out.println(hash.contains(13));
        System.out.println(hash.contains(0));
        System.out.println(hash.contains(1));
        System.out.println(hash.contains(2));
        System.out.println(hash.contains(3));
        System.out.println(hash.contains(5));
        hash.addAll(list);
        System.out.println(hash);
        hash.forEach(x -> System.out.print(x + " "));
        System.out.println("\n");
        hash = new HashTable(4);
        hash.add(new Pair(2,5));
        hash.add(new Pair(-3,19));
        hash.add(new Pair(17,-4));
        System.out.println(hash);
        System.out.println(hash.get(new Pair(2))); // can effectivly act as a dictionary when Pairs are used.
        System.out.println(hash.get(new Pair(-3)));
        System.out.println(hash.get(new Pair(17)));
    }
}

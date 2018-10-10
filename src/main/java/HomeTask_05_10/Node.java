package HomeTask_05_10;

public class Node {
    String name;
    Node before;
    Node after;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Node)) return false;

        Node node = (Node) o;

        if (name != null ? !name.equals(node.name) : node.name != null) return false;
        if (before != null ? !before.equals(node.before) : node.before != null) return false;
        return after != null ? after.equals(node.after) : node.after == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (before != null ? before.hashCode() : 0);
        result = 31 * result + (after != null ? after.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        MyLinkedList glist = new MyLinkedList();
        System.out.println(glist.size());
    }
}

package HomeTask_05_10;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList implements Collection<Node> {
    Node head;
    Node last;
    int size;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
       return this.size == 0;
    }

    public boolean contains(Object o) {
        for(Object obj : this)
            if(obj.equals(o)) return true;
        return false;
    }

    public Iterator<Node> iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(T[] ts) {
        return null;
    }

    public boolean add(Node node) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    public boolean addAll(Collection<? extends Node> collection) {
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    public void clear() {

    }
}

package mylibrary;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class MyStack<Item> implements Iterable<Item> {
    private Node<Item> first;
    private int n;


    private static class Node<Item>{
        private Item item;
        private Node<Item> next;
    }
    public MyStack(){
        n = 0;
        first = null;

    }
    public boolean isEmpty(){
        return n == 0;
    }
    public void push(Item item){
        Node<Item> oldFirst = first;
        first = new Node<Item>();
        first.next = oldFirst;
        first.item = item;
        n ++;
    }
    public Item pop(){
        if (n == 0)throw new NoSuchElementException("Empty stack");
        Item item = first.item;
        first = first.next;
        n--;
        return item;
    }
    public Item peek(){
        if (n == 0)throw new NoSuchElementException("Empty stack");
        return first.item;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Item item: this){
            s.append(item).append(" ");
        }
        return s.toString();
    }

    @Override
    public Iterator<Item> iterator() {
        return new LinkedIterator(first);
    }

    private class LinkedIterator implements Iterator<Item>{
        private Node<Item> current;
        private LinkedIterator(Node first){
            this.current = first;
        }
        public boolean hasNext(){
            return current != null;
        }
        public Item next(){
            if (!hasNext())throw new NoSuchElementException();
            Node<Item> old = current;
            current = current.next;
            return old.item;
        }
    }
}

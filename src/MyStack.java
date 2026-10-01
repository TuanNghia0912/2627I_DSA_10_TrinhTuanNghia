import java.util.NoSuchElementException;

public class MyStack<Item> implements Iterable<Item> {
    private Node first;
    private int n;
    private class Node{
        private Item item;
        private Node next;
    }
    public MyStack(){
        n = 0;
        first = null;

    }
    public boolean isEmpty(){
        return n == 0;
    }
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
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
        for (Item item: MyStack){
            s.append(item);
        }
        return s.toString();
    }



}

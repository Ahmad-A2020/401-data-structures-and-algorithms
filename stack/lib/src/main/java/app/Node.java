package app;

public class Node<T> {
    private T value;
   private Node<T> next;

    public Node(T d) {
        value = d;
        next = null;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }


}

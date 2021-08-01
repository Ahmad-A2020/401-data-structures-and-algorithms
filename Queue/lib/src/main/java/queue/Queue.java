package queue;

import Node.Node;

public class Queue<T> {
    private Node<T> front;
    private Node<T> back;

    public void enqueue(T value){
         Node<T> newNode = new Node<T>(value);

        if (front == null){
             front= newNode;
             back=newNode;
         } else {
           Node<T> current  = back.getNext();
           current=newNode;
           back=newNode;
        }
     }
    public T dequeue(){
        if (front==null){
            return (T) "the Queue is empty";
        }else{
            Node<T> current = front;
            front=front.getNext();
            return current.getValue();
        }
   }
   public T peek(){
        if (front==null){
            return (T) "the Queue is empty";
        }else{
            return front.getValue();
        }
   }
   public boolean isEmpty(){
        return front==null;
   }

    @Override
    public String toString() {
        return "QueueLinkedLIst{" +
                "front=" + front.getValue() +
                ", back=" + back.getValue() +
                '}';
    }
}

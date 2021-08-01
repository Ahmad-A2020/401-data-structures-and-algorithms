package queue;

import Node.Node;

public class Stack<T> {
    private Node<T> top;

    public void  push(T data){
        Node<T> newNode = new Node<>(data);
        if (top == null){
            top= newNode;
        }else{
            newNode.setNext(this.top);
            this.top=newNode;
        }
    }

    public String content(){
        Node<T> current = this.top;
        String commulative="";
        while (current != null){
            commulative += "[ "+current.getValue()+" ] << ";
            current= current.getNext();
        }
        commulative += " [null]";
        System.out.println(commulative);
        return commulative;
    }
    public T pop(){
        if (this.top == null){
            return (T)"The stack is empty ";

        }else {
            Node<T> oldTop= top;
            top = top.getNext();
            oldTop.setNext(null);
            return oldTop.getValue();
        }
    }
    public T peek(){
        if (top==null){
            return (T) "the stack is empty";
        } else{
            return top.getValue();
        }
    }
    public boolean isEmpty(){
        return top==null;
    }




}

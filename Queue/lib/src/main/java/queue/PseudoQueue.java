package queue;
public class PseudoQueue<T> {
    Stack <T> stack1 = new Stack<>() ;
    Stack <T> stack2 = new Stack<>();

//    public PseudoQueue(StackLinkedList<T> stack1, StackLinkedList<T> stack2) {
//        this.stack1 = stack1;
//        this.stack2 = stack2;
//    }
    public void enqueue( T value){

        stack1.push(value);
    }
    // create stack2 from reverse stack 1
    public void stack2Generator(){
        while ( ! stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }
    // create stack1 from reverse stack 2
    public void stack1Generator(){
        while ( ! stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }

    public T dequeue(){
        stack2Generator();
        T removedValue= stack2.pop();
        stack1Generator();
        return removedValue;

    }
    public String content(){
        return stack1.content();
    }

}

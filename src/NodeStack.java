public class NodeStack {

    int data;
    Node topOfStack;
    Node head;
    int size ;

    public NodeStack(int data){
        this.data = data;
        this.head = new Node(data);
        this.topOfStack =head;
        this.size =1;
        System.out.println("A new stack using Linked List has been created .");

    }

    public void push(int ele){
        Node newNode = new Node(ele);
        topOfStack.next =newNode;
        topOfStack =newNode;
        size++;
        System.out.println(" A new element has been pushed to the stack");
    }

    public void pop(){
        if(size == 0){
            System.out.println("Stack is Empty");
        }

        Node temp = head;
        while(temp.next!=topOfStack){
            temp = temp.next;
        }

        temp.next =null;
        topOfStack = temp;
        size--;
        System.out.println("Element has been popped sucessfullyu");
    }
    public int peek(){
        return topOfStack.data;
    }

    public boolean isEmpty(){
        if(head==null && topOfStack == null){
            return true;
        }else{
            return false;
        }
    }

    public void delete(){
        head = null;
        topOfStack = null;
    }






}

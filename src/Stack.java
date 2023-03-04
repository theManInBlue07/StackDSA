public class Stack {
    // using arr

    int[] arr;
    int topOfStack;
//
    //creation
    public Stack(int size){
        this.arr =new int[size];
        this.topOfStack =-1;
        System.out.println("Empty stack of size "+size+ " has been created");
    }

    public boolean isEmpty(){
        if(topOfStack ==-1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(topOfStack == arr.length-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(int ele){
        if(isFull()){
            System.out.println("Stack is filled completely ");
        }else{
            topOfStack ++;
            arr[topOfStack] = ele;
            System.out.println("The elemnet has been pushed to position "+topOfStack+".");
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            int c = arr[topOfStack];
            arr[topOfStack] =-1;
            topOfStack--;
            int a = topOfStack+1;
            System.out.println("The elemnet "+c
                    +" has been popped from position "+a+".");
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[topOfStack];
        }
    }

    public void delete(){
        // for deleting entire stack
        arr= null;
        System.out.println(" stack is deleted from memory");

    }
}

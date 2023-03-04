public class Main {
    public static void main(String[] args) {

    Stack stack1  = new Stack(2);
    System.out.println(stack1.isEmpty());
    System.out.println(stack1.isFull());
    stack1.push(1);
    stack1.push(2);
    stack1.push(3);
        System.out.println("********************************");
//     stack1.pop();
//     stack1.pop();
//    stack1.pop();
    int a = stack1.peek();
        System.out.println(a);
        stack1.delete();
       // stack1.push(1);

        System.out.println("---------------------------------");
        NodeStack n1 = new NodeStack(5);
        n1.push(6);
       n1.push(7);
        System.out.println(n1.peek());
        System.out.println(n1.isEmpty());
        n1.delete();
        System.out.println(n1.isEmpty());
        n1.push(7);

    }







}
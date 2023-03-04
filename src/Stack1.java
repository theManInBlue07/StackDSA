import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        st1.push(9);
        st1.push(10);
        st1.push(11);
        st1.push(12);
        st1.push(13);
        st1.push(14);
        System.out.println(st1.peek());
        int a = st1.pop();
        System.out.println(a);
        System.out.println(st1.peek());
        System.out.println(st1.empty());
        System.out.println(st2.empty());

        // Exception handling
        try{
            System.out.println(st1.peek());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("stack method execution completed");
        }

        // searching in stack
        int b = st1.size();
        System.out.println(b);

        System.out.println(st1.search(12)); // return the index of the object as value


        // printing all values in stack using iterator

        Iterator it = st1.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj +"-->");
        }

    }
}

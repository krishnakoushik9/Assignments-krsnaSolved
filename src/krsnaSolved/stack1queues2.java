package krsnaSolved;

import java.util.LinkedList;
import java.util.Queue;

class stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    //----------------------------
    void stackPush(int a){
        q1.add(a);
    }
    //----------------------------
    int stackPop(){
        while (q1.size() != 1) {
            q2.add(q1.poll());
        }
        int popped = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return popped;
    }
    //----------------------------
    int peek() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int top = q1.peek();
        q2.add(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
    //----------------------------
    boolean isEmpty() {
        return q1.isEmpty();
    }
    //----------------------------
    int size() {
        return q1.size();
    }
}

public class stack1queues2 {
    public static void main(String[] args) {
        stack st = new stack();
        st.stackPush(6);
        st.stackPush(0);
        st.stackPush(8);
        System.out.println(st.stackPop());
    }

}

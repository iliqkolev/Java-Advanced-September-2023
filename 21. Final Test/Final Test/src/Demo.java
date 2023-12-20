import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);


        Deque<Integer> stack2 = new ArrayDeque<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);


        ArrayDeque<Integer> stack3 = new ArrayDeque<>();
        stack3.push(1);
        stack3.push(2);
        stack3.push(3);


        System.out.println();

    }
}

import java.util.*;

public class ReverseNumbersStack_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] input=scanner.nextLine().split("\\s+");
        Deque <Integer> stack=new ArrayDeque<>();

        for (String n:input){
            stack.push(Integer.valueOf(n));
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}

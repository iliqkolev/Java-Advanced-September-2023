import java.util.*;

public class BasicStackOperations_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] tokens=scanner.nextLine().split("\\s+");

        int n=Integer.parseInt(tokens[0]);
        int s=Integer.parseInt(tokens[1]);
        int x=Integer.parseInt(tokens[2]);

        Deque<Integer> stack=new ArrayDeque<>();

         int [] numbers=Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

         //Add n elements to the stack
        for (int i = 0; i < n; i++) {
            stack.push(numbers[i]);
        }

        //Remove n elements from the stack
        for (int i = 0; i < s; i++) {
            stack.pop();
        }


        if (stack.isEmpty()){
            System.out.println(0);
        }else if(stack.contains(x)){
            System.out.println(true);  //Check if x is present
        }else{
            System.out.println(Collections.min(stack));
        }


    }
}

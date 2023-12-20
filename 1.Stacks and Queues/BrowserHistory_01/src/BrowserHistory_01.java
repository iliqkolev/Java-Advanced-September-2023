import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<String> stack=new ArrayDeque<>();

        String command=scanner.nextLine();
        String prevURL="no previous URLs";
        stack.push(prevURL);

        while (!command.equals("Home")){
            if (command.equals("back")){
                if (stack.size() == 1){
                    System.out.println(stack.peek());
                }else{
                    prevURL=stack.pop();
                    System.out.println(prevURL);
                }
            }else{
                if (!"no previous URLs".equals(prevURL)){
                    stack.push(prevURL);
                }
                prevURL= command;
                System.out.println(command);
            }

        command=scanner.nextLine();
        }

    }
}
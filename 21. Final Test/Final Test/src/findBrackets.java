import java.util.Scanner;
import java.util.Stack;

public class findBrackets {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);

        System.out.print("Въведете числов израз: ");
        String userInput = scanner.nextLine();

        if (checkBrackets(userInput)) {
            System.out.println("Изразът е коректен.");
        } else {
            System.out.println("Изразът не е коректен.");
        }
    }
    public static boolean checkBrackets(String expression) {
        Stack<Character> bracketStack = new Stack<>();
        String openingBrackets = "({[<";
        String closingBrackets = ")}]>";

        for (char ch : expression.toCharArray()) {
            if (openingBrackets.indexOf(ch) != -1) {
                bracketStack.push(ch);
            } else if (closingBrackets.indexOf(ch) != -1) {
                if (bracketStack.isEmpty()) {
                    return false; // Няма предходна отваряща скоба
                }
                char top = bracketStack.pop();
                if (openingBrackets.indexOf(top) != closingBrackets.indexOf(ch)) {
                    return false; // Несъответствие между видовете скоби
                }
            }
        }

        return bracketStack.isEmpty(); // Изразът е коректен, ако стекът е празен в края
    }
}

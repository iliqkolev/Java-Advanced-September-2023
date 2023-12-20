import java.util.*;
import java.util.stream.Collectors;

public class BalancedParentheses_05 {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);

        List<String> input=Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());

        String result = isBalanced(input) ? "YES" : "NO";
        System.out.println(result);

    }

    private static boolean isBalanced(List<String> input) {
        Deque<String> openBracketStack=new ArrayDeque<>();
        for (int i = 0; i < input.size(); i++) {
            String brace=input.get(i);
            switch (brace){
                case ")":
                    if (openBracketStack.isEmpty()){
                        return false;
                    }
                     String openBrace=openBracketStack.pop();
                    if (!openBrace.equals("(")){
                        return  false;
                    }
                    break;
                case "]":
                    if (openBracketStack.isEmpty()){
                        return false;
                    }
                    openBrace=openBracketStack.pop();
                    if (!openBrace.equals("[")){
                        return  false;
                    }
                    break;
                case "}":
                    if (openBracketStack.isEmpty()){
                    return false;
                }
                    String openBrace1=openBracketStack.pop();
                    if (!openBrace1.equals("{")){
                        return  false;
                    }
                    break;
                default: openBracketStack.push(brace);
            }
        }
        return  true;
    }
}

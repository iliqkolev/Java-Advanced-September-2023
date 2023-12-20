import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Meeting_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Deque<Integer> males= parseInputAsStack(scanner.nextLine());
        Deque<Integer> females= parseInputAsQueue(scanner.nextLine());
        int matches=0;

        while (!males.isEmpty() && !females.isEmpty()){
            //pollFirst() -> retrieves and REMOVE
            var female=getPerson(females); // 12
            //-1 -5 -123 25
            if (female == null){
                break;
            }

            var male=getPerson(males); //12
            if (male == null){
                females.addFirst(female);
                break;
            }

            if (female.equals(male)){
                matches++;
            }else{
                males.addFirst(male - 2);
            }
        }

        System.out.println(Output(matches,males,females));
    }

    private static String Output(int matches,Deque<Integer> males, Deque<Integer> females) {
        //males.toString -> "[2, 5, 6]"
        var stringifiedMales=males.toString();
        var stringifiedFemales=females.toString();

            return "Matches: " + matches +
                    "\nMales left: " + (males.isEmpty()
                    ? "none"
                    : stringifiedMales.substring(1,stringifiedMales.length() - 1)) +
                    "\nFemales left: " + (females.isEmpty()
                    ? "none"
                    : stringifiedFemales.substring(1,stringifiedFemales.length() - 1));

    }

    private static Integer getPerson(Deque<Integer> people) {
        while (!people.isEmpty()){
            var person=people.pollFirst();
            if (person <= 0){
                continue;
            }
            if (person % 25 == 0){
                people.pollFirst();
                continue;
            }
            return person;
        }

        return null;
    }

    private static Deque<Integer> parseInputAsQueue(String nextLine) {
        return Arrays.stream(nextLine.split(" "))
                .map(Integer::parseInt)
                .collect(ArrayDeque::new,
                        ArrayDeque::addLast,
                        ArrayDeque::addAll);
    }

    private static Deque<Integer> parseInputAsStack(String line) {
        var stack=new ArrayDeque<Integer>();
        for (String input : line.split(" ")){
            stack.addFirst(Integer.valueOf(input));
        }
        return stack;
    }
}

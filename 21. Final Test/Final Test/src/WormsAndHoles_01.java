import java.util.*;

public class WormsAndHoles_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> wormsStack = new ArrayDeque<>();
        Deque<Integer> holesQueue = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(wormsStack::push);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(holesQueue::offer);

        int matches = 0;

        while (!wormsStack.isEmpty() && !holesQueue.isEmpty()){
            int currentWorm = wormsStack.peek();
            int currentHole = holesQueue.peek();

            if (currentWorm == currentHole){
                wormsStack.pop();
                holesQueue.poll();
                matches++;
            }else{
                wormsStack.push(wormsStack.pop() - 3);
                if (wormsStack.peek() <= 0){
                    wormsStack.pop();
                }
                holesQueue.poll();
            }


        }

        output(matches, wormsStack, holesQueue);
    }


    private static void output(int matches, Deque<Integer> wormsStack, Deque<Integer> holesQueue) {

        if (matches != 0){
            System.out.println("Matches: " + matches);
        }else{
            System.out.println("There are no matches.");
        }

        if (wormsStack.isEmpty() && holesQueue.isEmpty()){
            System.out.println("Every worm found a suitable hole!");
        }else if (!wormsStack.isEmpty()){
            System.out.print("Worms left: ");
            ArrayList<Integer> wormsList = new ArrayList<>();
            int size = wormsStack.size();

            for (int i = 0; i < size; i++) {
                int worm = wormsStack.pollLast();
                wormsList.add(worm);
            }
            System.out.print(String.join(", ", wormsList.stream().map(Object::toString).toArray(String[]::new)));
            System.out.println();
        } else{
            System.out.println(" none");
            System.out.println();
        }

        if (!holesQueue.isEmpty()){
            String hole = holesQueue.toString();
            System.out.println("Holes left: " + hole.substring(1, hole.length() - 1));
        }else{
            System.out.println("Holes left: none");
        }

    }

}
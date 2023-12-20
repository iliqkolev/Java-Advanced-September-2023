import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class offRoadChallengeList {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

        List<Integer> fuels = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> consumptionIndexes = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> quantities = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<String> reachedAltitudes = new ArrayList<>();

        for (int index = 0; index < fuels.size(); index++) {
            int num=fuels.get(fuels.size() - 1 - index);
            int b=consumptionIndexes.get(index);
            int neededFuel = fuels.get(fuels.size() - 1 - index) - consumptionIndexes.get(index);
            if (neededFuel < quantities.get(index)) {
                System.out.println("John did not reach: Altitude " + (index + 1));
                System.out.println("John failed to reach the top.");
                System.out.print("Reached altitudes: ");
                System.out.println(String.join(", ", reachedAltitudes));
                return;
            } else {
                reachedAltitudes.add("Altitude " + (index + 1));
                System.out.println("John has reached: Altitude " + (index + 1));
            }
        }
        System.out.println("John has reached all the altitudes and managed to reach the top!");
    }
}

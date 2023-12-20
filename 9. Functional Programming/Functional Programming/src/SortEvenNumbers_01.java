import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEvenNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(joinNumbers(numbers));

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(joinNumbers(sortedNumbers));
    }

    private static String joinNumbers(List<Integer> numbers) {
        return  numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}

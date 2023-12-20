import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n=Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isDivisible= num -> num % n == 0;

        numbers.removeIf(isDivisible);

        Collections.reverse(numbers);

        Consumer<List<Integer>> print= list -> list.forEach(e -> System.out.print(e + " "));

        print.accept(numbers);
    }
}

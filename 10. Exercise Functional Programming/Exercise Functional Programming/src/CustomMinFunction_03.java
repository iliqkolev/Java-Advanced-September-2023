import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class CustomMinFunction_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);




        Function<Integer[],Integer> smallestNum= arr->{
            return Arrays.stream(arr)
                    .min(Integer::compare)
                    .get();
        };

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Integer smallestNumber = smallestNum.apply(numbers);
        System.out.println(smallestNumber);
    }
}

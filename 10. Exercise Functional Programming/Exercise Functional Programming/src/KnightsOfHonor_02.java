import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[]tokens=scanner.nextLine().split("\\s+");
        Consumer<String> sirNames=s -> System.out.println("Sir " + s);
        Arrays.stream(tokens).forEach(sirNames);
    }
}

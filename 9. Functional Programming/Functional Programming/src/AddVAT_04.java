import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AddVAT_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Prices with VAT:");

        Function<String,Double> parsePriceAddingVat=s -> Double.parseDouble(s) * 1.2;

        Arrays.stream(scanner.nextLine().split(", "))
                .map(parsePriceAddingVat)
                .forEach(v -> System.out.printf("%.2f\n",v));
    }
}

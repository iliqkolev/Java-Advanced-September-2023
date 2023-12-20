import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        TreeMap<String, LinkedHashMap<String, Double>> data = new TreeMap<>();

        while (!"Revision".equals(input)){
            String [] tokens=input.split(", ");
            String shop=tokens[0];
            String product=tokens[1];
            double price=Double.parseDouble(tokens[2]);

            data.putIfAbsent(shop, new LinkedHashMap<>());
            data.get(shop).put(product,price);

            input=scanner.nextLine();
        }

        for (var entry : data.entrySet()) {
            System.out.println(entry.getKey() + "->");
            LinkedHashMap<String, Double> innerData = entry.getValue();
            for (var productData : innerData.entrySet()) {
            System.out.printf("Product: %s, Price: %.1f\n", productData.getKey(),productData.getValue() );
            }
        }
    }
}

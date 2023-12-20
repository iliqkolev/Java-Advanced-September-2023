import java.util.*;
import java.util.stream.Collectors;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        int n=Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, LinkedHashMap<String, List<String>>> data=new LinkedHashMap<>();

        while (n-- > 0){
            String input=scanner.nextLine();
            String [] tokens=input.split(" ");
            String continent=tokens[0];
            String country=tokens[1];
            String city=tokens[2];

            data.putIfAbsent(continent, new LinkedHashMap<>());
            LinkedHashMap<String, List<String>> citiesByCountry=data.get(continent);
            citiesByCountry.putIfAbsent(country, new ArrayList<>());
            citiesByCountry.get(country).add(city);

        }

        data.forEach((key, value) -> {
            System.out.println(key + ":");

            value.forEach((key1, value1) -> {

                String cities = String.join(", ", value1);

                System.out.println(key1 + " -> " + cities);
            });
        });

    }
}

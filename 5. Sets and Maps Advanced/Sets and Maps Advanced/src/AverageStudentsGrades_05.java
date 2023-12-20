import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentsGrades_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        TreeMap<String, List<Double>> students=new TreeMap<>();
        int n=Integer.parseInt(scanner.nextLine());

        while (n-- > 0){

            String[] tokens=scanner.nextLine().split(" ");
            String name=tokens[0];
            Double grade=Double.parseDouble(tokens[1]);

            students.putIfAbsent(name,new ArrayList<>());
            students.get(name).add(grade);

        }

        students.entrySet()
                .forEach(entry -> {
                    double sum=0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }

                    double avgSum=sum/ entry.getValue().size();

                    System.out.print(entry.getKey() + " -> ");
                    entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
                    System.out.printf("(avg: %.2f)\n", avgSum);
                });
    }
}

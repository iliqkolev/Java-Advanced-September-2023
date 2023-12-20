import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Set<String> names=new LinkedHashSet<>();
        int n=Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input=scanner.nextLine();
            names.add(input);
        }

        for (String e : names) {
            System.out.println(e);
        }
    }
}

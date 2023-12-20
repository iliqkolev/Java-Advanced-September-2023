import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String input=scanner.nextLine();
        HashMap<String,String> phoneBookMap=new HashMap<>();

        while (!"search".equals(input)){
            String[] tokens = input.split("-");
            phoneBookMap.put(tokens[0], tokens[1]);

            input=scanner.nextLine();
        }

        input=scanner.nextLine();

        while (!"stop".equals(input)){
            String name=input;
            if (!phoneBookMap.containsKey(name)){
                System.out.printf("Contact %s does not exist.\n", name);
            }else{
                 System.out.printf("%s -> %s\n", name,phoneBookMap.get(name));
            }

            input=scanner.nextLine();
        }

    }
}

import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String name=scanner.nextLine();
        LinkedHashMap<String,String> map=new LinkedHashMap<>();

        while (!"stop".equals(name)){
            String email=scanner.nextLine();
            if (!email.endsWith(".us") && !email.endsWith(".uk") && !email.endsWith(".com")){
                map.put(name,email);
            }
            name=scanner.nextLine();
        }
        map.forEach((keyName,email) -> System.out.printf("%s -> %s\n",keyName,email));
    }
}

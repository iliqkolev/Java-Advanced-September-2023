import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        TreeSet<String> vip=new TreeSet<>();
        TreeSet<String> regular=new TreeSet<>();

        String guest=scanner.nextLine();

        while (!guest.equals("PARTY")){
            char startsWith=guest.charAt(0);
            if (Character.isDigit(startsWith)){
                vip.add(guest);
            }else{
                regular.add(guest);
            }
            guest=scanner.nextLine();
        }

        guest=scanner.nextLine();

        while (!guest.equals("END")){
            vip.remove(guest);
            regular.remove(guest);

            guest=scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (String s : vip) {
            System.out.println(s);
        }

        for (String s : regular) {
            System.out.println(s);
        }
    }
}

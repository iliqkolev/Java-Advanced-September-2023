import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Integer> getInt=
                () -> new Random().nextInt(3);
        int n= getInt.get();
        System.out.println(n);
    }
}
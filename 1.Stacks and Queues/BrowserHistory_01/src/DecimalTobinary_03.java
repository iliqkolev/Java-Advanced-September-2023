import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalTobinary_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //FIRST WAY

//            int number = Integer.parseInt(scanner.nextLine());
//            System.out.println(Integer.toBinaryString(number));

        //SECOND WAY
        int number = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (number == 0){
            System.out.println(0);

        }

        while (number != 0) {
            int reminder = number % 2;
            stack.push(reminder);
            number = number / 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}

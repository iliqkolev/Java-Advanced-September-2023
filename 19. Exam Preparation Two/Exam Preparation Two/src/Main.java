import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.add(2);
        queue.offer(3);
        queue.add(5);
        queue.offer(13);

        System.out.println(queue.peek()); //13

        int lastElement = queue.pollLast(); //13
        System.out.println(lastElement);
        System.out.println(queue.size()); //2
        System.out.println(queue.contains(3)); //true
        System.out.println(queue.contains(32)); //false
        System.out.println(queue.isEmpty()); //false

        queue.forEach(System.out::println);

    }
}
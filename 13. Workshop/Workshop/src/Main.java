import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        SmartStack stack=new SmartStack();
//
//        stack.push(13);
//        stack.push(42);
//        stack.push(69);
//        stack.push(73);
//
//        stack.forEach(System.out::println);
//
//

        SmartArray smartArray=new SmartArray();

        smartArray.add(5);
        smartArray.add(10);
        smartArray.add(15);
        int value = smartArray.get(2);
        int remove= smartArray.remove(2);

        ArrayList<Integer> list=new ArrayList<>();

        System.out.println(System.currentTimeMillis());
        list.add(5);
        list.add(10);
        list.add(15);
        int element = list.get(2);
        int removed= list.remove(2);

        System.out.println(System.currentTimeMillis());

    }
}
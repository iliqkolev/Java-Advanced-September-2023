import java.util.*;

public class OffroadChallenge_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayDeque<Integer> fuelQuantityStack=new ArrayDeque<>();
        ArrayDeque <Integer> additionalConsumptionQueue=new ArrayDeque<>();
        ArrayDeque <Integer> neededAmountOfFuelQueue=new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(fuelQuantityStack::push);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(additionalConsumptionQueue::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(neededAmountOfFuelQueue::offer);

        List<Integer> reachAltitude=new ArrayList<>();
        int reach=0;
        int notReach=0;

        boolean isPositive=true;

        while (isPositive){
            int quantity=fuelQuantityStack.peek();
            int consumption=additionalConsumptionQueue.peek();
            int result=quantity - consumption;

            int neededFuel=neededAmountOfFuelQueue.peek();

            if (result >= neededFuel){
                reach++;
                reachAltitude.add(reach);
                fuelQuantityStack.pop();
                additionalConsumptionQueue.poll();
                neededAmountOfFuelQueue.poll();
                System.out.println("John has reached: Altitude " + reachAltitude.size());
            }else{
                notReach=reach + 1;
                System.out.printf("John did not reach: Altitude %d\n", notReach);

                if (reachAltitude.size() == 0){
                    System.out.println("John failed to reach the top. John didn't reach any altitude.");
                }

                StringBuilder sb=new StringBuilder();
                StringBuilder res= new StringBuilder();
                sb.append(String.format("John failed to reach the top.\nReached altitudes: "));

                reachAltitude.stream()
                        .forEach(e -> {
                            sb.append(String.format("Altitude %d, ", e));
                        });

                if (sb.toString().endsWith(" ")){
                    res.append(sb.substring(0, sb.toString().length() - 2));
                }

                System.out.println(res.toString());

                isPositive=false;
                break;
            }
            if (fuelQuantityStack.isEmpty() && additionalConsumptionQueue.isEmpty() && neededAmountOfFuelQueue.isEmpty()){
                System.out.println("John has reached all the altitudes and managed to reach the top!");
                break;
            }
        }

    }
}

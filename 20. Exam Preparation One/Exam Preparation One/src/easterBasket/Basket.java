package easterBasket;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;


    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg){
        if (this.data.size() >= capacity){
            throw new RuntimeException("The basket is out of capacity!");
        }
        data.add(egg);
    }
    public boolean removeEgg(String color){
        int eggCount=data.size();

        data=data.stream()
                .filter(egg -> !egg.getColor().equals(color))
                .collect(Collectors.toList());

        return data.size() != eggCount;
    }
    public Egg getStrongestEgg(){
        return data.stream().reduce(
                (egg1, egg2) -> egg1.getStrength() > egg2.getStrength() ? egg1 : egg2
        ).orElse(null);
    }
    public Egg getEgg(String color){
        return data.stream().filter(egg -> egg.getColor().equals(color)).findFirst().orElse(null);
    }
    public int getCount(){
        return data.size();
    }
    public String report(){
        var sj=new StringJoiner("\n");
        sj.add(material + " basket contains:");
        for (Egg egg : data) {
            sj.add(egg.toString());
        }
        return sj.toString();
    }

}

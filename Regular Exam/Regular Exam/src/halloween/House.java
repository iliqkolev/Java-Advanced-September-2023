package halloween;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Kid> data;
    private int capacity;

    public House(int capacity) {
        this.capacity = capacity;
        this.data=new ArrayList<>();
    }

    // Method addKid(Kid kid) – adds an entity to the data
    // if there is an empty space for the kid.
    public void addKid(Kid kid){
        if (this.data.size() < capacity){
            this.data.add(kid);
        }
    }

    //removes the kid by given name, if such exists, and returns boolean.
    public boolean removeKid(String name){
        return this.data.removeIf(kid -> kid.getName().equals(name));
    }

    //returns the kid of a given street or null if no such kid exists.
    public Kid getKid(String street){
        return this.data.stream()
                .filter(kid -> kid.getStreet().equals(street))
                .findFirst()
                .orElse(null);
    }

    public int getAllKids(){
       return this.data.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Children who visited a house for candy:"));

        this.data.forEach(kid -> {
            sb.append(System.lineSeparator());
            sb.append(String.format("%s from %s street", kid.getName(), kid.getStreet()));
        });

        return sb.toString();
    }

}

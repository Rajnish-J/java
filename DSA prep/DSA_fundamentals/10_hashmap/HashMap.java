import java.util.*;

class hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer> population = new HashMap<>();

        // ! add = put method
        population.put("India", 138);
        population.put("pakistan", 22);
        population.put("Nepal", 3);
        population.put("USA", 33);
        population.put("Australia", 4);

        // ! get method
        System.out.println(population.get("India")); // ? 138

        // ! check whether the key value is present or not
        System.out.println(population.containsKey("India")); // ? true

        // ! printing all the key elements
        for(String s: population.keySet()){
            System.out.println(s);
        }
        // ! Insertion order is not maintained
        //? USA
        //? pakistan
        //? Australia
        //? Nepal
        //? India

        // ! size of the hashmap
        System.out.println(population.size()); //? 5

        // ! removal of an element
        population.remove("pakistan"); // ? remnove
        System.out.println(population.containsKey("pakistan")); // ? false
    }
}
package CollectionsStudy.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapProgramme {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {

        // Change the program to allow players to type full words, or phrases, then move to the
        // correct location based upon their input.
        // The player should be able to type commands such as "Go West", "run South", or just "East"
        // and the program will move to the appropriate location if there is one.  As at present, an
        // attempt to move in an invalid direction should print a message and remain in the same place.
        //
        // Single letter commands (N, W, S, E, Q) should still be available.

        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java"));
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building"));
        locations.put(2, new Location(2, "You are at the top of a hill"));
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring"));
        locations.put(4, new Location(4, "You are in a valley beside a stream"));
        locations.put(5, new Location(5, "You are in the forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("N", 5);

        locations.get(2).addExit("N", 5);

        locations.get(3).addExit("W", 1);

        locations.get(4).addExit("N", 1);
        locations.get(4).addExit("W", 2);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("W", 2);


        command();

    }
    public static void command() {
        Map<String, String> vocabularies = new HashMap<String, String>();
        vocabularies.put("WEST", "W");
        vocabularies.put("EAST", "E");
        vocabularies.put("NORD", "N");
        vocabularies.put("SOUTH", "S");
        vocabularies.put("QUIT", "Q");

        int loc = 1;
        while(true){
            if(loc == 0){
                break;
            }
            System.out.println(locations.get(loc).getDescription());
            System.out.println("Available exits are ");
            Map<String, Integer> map = locations.get(loc).getExits();
            for(String key : map.keySet()){
                System.out.print(key + ",");
            }

            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine().toUpperCase();
            String[] keys = input.split(" ");
            for(String key: keys){
                if(vocabularies.containsKey(key)){
                    String val = vocabularies.get(key);
                    loc = locations.get(loc).getExits().get(val);
                }else{
                    //Rester sur la même place
                    System.out.println("You cannot go in that direction");
                    break;
                }
            }
        }
    }
}

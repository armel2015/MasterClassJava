package InputOutputJavaUtil.FileReader.WithOutBufferStream;

import java.io.*;
import java.util.*;

/**
 * Created by timbuchalka on 2/04/2016.
 */
public class Locations2 implements Map<Integer, InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2> {
    private static Map<Integer, InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2> locations = new LinkedHashMap<Integer, InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2>();

    public static void main(String[] args) throws IOException {
        try (DataOutputStream locFile = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
            for (InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2 location : locations.values()) {
                locFile.writeInt(location.getLocationID());
                locFile.writeUTF(location.getDescription());
                System.out.println("Writing location " + location.getLocationID() + " : " + location.getDescription());
                System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
                locFile.writeInt(location.getExits().size() - 1);
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
                        locFile.writeUTF(direction);
                        locFile.writeInt(location.getExits().get(direction));
                    }
                }
            }
        }

    }

    static {

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations_big.txt")))) {
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2(loc, description, tempExit));
            }

        } catch(IOException e) {
            e.printStackTrace();
        }

        // Now read the exits
        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions_big.txt"))) {
            String input;
            while((input = dirFile.readLine()) != null) {
                String[] data = input.split(",");
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);

                System.out.println(loc + ": " + direction + ": " + destination);
                InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2 location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2 get(Object key) {
        return locations.get(key);
    }

    @Override
    public InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2 put(Integer key, InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2 value) {
        return locations.put(key, value);
    }

    @Override
    public InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2 remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, InputOutputJavaUtil.FileReader.WithOutBufferStream.Location2>> entrySet() {
        return locations.entrySet();
    }
}

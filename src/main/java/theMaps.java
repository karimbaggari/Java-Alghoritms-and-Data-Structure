import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static java.lang.String.valueOf;

public class theMaps {
    public static void main(String[] args) {
        Map<Integer,String>  map = new HashMap<>();
        map.put(1,"first");
        map.put(2,"second");
        map.put(3,"thirth");
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.containsKey(3));
        System.out.println(map.keySet());
        System.out.println(map);
        System.out.println(map.entrySet());

        map.entrySet().forEach(x -> System.out.println(x));

        map.forEach((key,value) -> {
            System.out.println(key + " - " + value);
        });
        map.remove(3);
        System.out.println(map.getOrDefault(3,"default because there is no value or key with that thing in the left"));
        System.out.println(map.values());
    }
}

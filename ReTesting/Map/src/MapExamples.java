import java.util.*;
import java.util.stream.Collectors;

public class MapExamples {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        //fill the map
        for (int i = 1; i <= 9; i++) {
            map.put(i, "String_" + i);
        }
        //print the map
        for (Map.Entry<Integer, String> mapObject : map.entrySet()) {
            System.out.println(mapObject.getKey() + "/" + mapObject.getValue());
        }
        // print the map using lambda
        map.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });

        //info about map
        Set<Map.Entry<Integer, String>> setOfMapObjects = map.entrySet(); // <- set og map objects k,v
        Set<Integer> setOfKeys = map.keySet(); // <- set of keys from map
        Collection<String> collectionOfValues = map.values(); //<- collection of values from map

        //filtering map in streamAPI
        Map<Integer, String> mapOfFilteredElements = map.entrySet().stream()
                .filter(e -> e.getKey() < 3)
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

        mapOfFilteredElements.forEach((k, v) -> {
            System.out.println(k + "--" + v);
        });

        //retrieving list of values from map
        List<String> listOfValues = map.entrySet().stream()
                .filter(e -> e.getValue().equals("String_4"))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());


        //returning filtered EntrySet
        List<Map.Entry<Integer, String>> filteredEntrySet = map.entrySet().stream()
                .filter(e -> e.getValue().equals("String_4"))
                .collect(Collectors.toList());

        for (Map.Entry<Integer, String> e : filteredEntrySet) {
            System.out.println(e.getValue());
        }
    }
}

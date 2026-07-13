import java.util.HashMap;

public class AddKeyValuePairToHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        addPair(map, 100, "anup");
        addPair(map, 101, "shivam");
        addPair(map, 102, "rohan");
        System.out.println(map);
    }
    public static void addPair(HashMap<Integer, String> map, int key, String value){
        map.put(key, value);
    }
}

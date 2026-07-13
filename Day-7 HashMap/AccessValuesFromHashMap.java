import java.util.*;
public class AccessValuesFromHashMap {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(100, "anup");
        hm.put(102, "shivam");
        hm.put(101, "rohan");
        String value = getValue(hm, 102);
        System.out.println("Value: "+value);
    }
    public static String getValue(HashMap<Integer, String> hm, int key){
        return hm.get(key);
    }
}

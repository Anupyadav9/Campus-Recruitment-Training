import java.util.*;
public class HashMapDemo1 {
    public static void main(String[] args){
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();
        hm.put(100, "anup");
        hm.put(102, "shivam");
        hm.put(101, "rohan");
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

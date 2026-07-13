import java.util.*;
public class HashMapDemo2 {
    public static void main(String[] args){
        HashMap hm = new HashMap();
        hm.put("anup", 700);
        hm.put("shivam", 100);
        hm.put("rohan", 200);
        hm.put("levi", 500);
        System.out.println(hm);
        System.out.println(hm.put("anup", 1000));
        System.out.println(hm);
        Set s = hm.keySet();
        System.out.println(s);
        Collection c = hm.values();
        System.out.println(c);
        Set s1 = hm.entrySet();
        System.out.println(s1);
        Iterator it = s1.iterator();
        while(it.hasNext()){
            Map.Entry m1 = (Map.Entry)it.next();
            System.out.println(m1.getKey()+" "+m1.getValue());
            if(m1.getKey().equals("anup")){
                m1.setValue(10000);
            }
            System.out.println(m1);
        }
    }
}

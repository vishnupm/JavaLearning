package CollectionsDemo.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("Vishnu","Man");
        hm.put("Keshav","Boy");
        hm.put("Akhila","Woman");
        System.out.println(hm);

        hm.remove("Vishnu");
        System.out.println(hm);

//        for each loop
        for (String key : hm.keySet()){
            System.out.println("Key is: "+key+ " Value is: "+ hm.get(key));
        }

        Set s = hm.keySet();
        Iterator<String> itr = s.iterator();
        while (itr.hasNext()){
            String key = itr.next();
            System.out.println("Key is: "+key+ " Value is: "+ hm.get(key));
        }
    }
}

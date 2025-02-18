package CollectionsDemo.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<Integer>();
        hset.add(12);
        hset.add(14);
        hset.add(16);
        hset.add(19);
        hset.add(16);
        System.out.println(hset);

        hset.remove(14);
        System.out.println(hset);

        Iterator itr = hset.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for (Integer i : hset){
            System.out.println(i);
        }
    }
}

package CollectionsDemo.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

//        Add items to arraylist
        al.add(10);
        al.add("Vishnu");
        al.add(true);
//        System.out.println(al.size());
//        System.out.println(al);

//     ==============Remove item==============
        al.remove(0);
//        System.out.println(al.size());
//        System.out.println(al);

//        ============Fetch value==============
//        System.out.println(al.get(0));
//        System.out.println(al.get(1));

        al.add(10);
        al.add("Pratap");
        al.add("test");

//        for (int i = 0; i < al.size(); i++){
//            System.out.println(al.get(i));
//        }
//        for (Object obj : al){
//            System.out.println(obj);
//        }

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

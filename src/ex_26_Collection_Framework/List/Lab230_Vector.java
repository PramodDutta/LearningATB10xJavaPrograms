package ex_26_Collection_Framework.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab230_Vector {
    public static void main(String[] args) {
        Vector v = new Vector(); // Array
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);

        System.out.println(" ---- ");

        Iterator iterator  = v.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" -- Enumeration -- ");

        // Extra Enumeration
        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }


    }
}

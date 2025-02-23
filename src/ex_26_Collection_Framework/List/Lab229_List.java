package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab229_List {
    public static void main(String[] args) {

        List mylist = new ArrayList(5);
        List mylist0 = new ArrayList(); // // Arrays Format - Continuous



        List mylist2 = new LinkedList(); // Doubly Linked List.
        mylist2.add("Pramod");
        mylist2.add("Dutta");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);
        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Dutta"));
        System.out.println(mylist2.indexOf("Dutta"));





    }
}

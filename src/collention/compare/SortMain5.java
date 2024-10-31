package collention.compare;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        TreeSet<MyUser> tresSet1 = new TreeSet<>();
        tresSet1.add(myUser1);
        tresSet1.add(myUser2);
        tresSet1.add(myUser3);
        System.out.println("Comparable 기본 정렬");
        System.out.println(tresSet1);

        TreeSet<MyUser> tresSet2 = new TreeSet<>(new IdComparator());
        tresSet2.add(myUser1);
        tresSet2.add(myUser2);
        tresSet2.add(myUser3);
        System.out.println("IdComparator 정렬");
        System.out.println(tresSet2);
    }
}

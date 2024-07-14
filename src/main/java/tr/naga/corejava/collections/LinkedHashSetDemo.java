package tr.naga.corejava.collections;

import java.util.*;

class LinkedHashSetDemo{

public static void main(String[] args){


HashSet hs=new HashSet();

hs.add(10);

hs.add(1);

hs.add(20);

hs.add(4);

hs.add(10);

hs.add(3);


System.out.println("HashSet output");

System.out.println(hs);


LinkedHashSet lhs=new LinkedHashSet();

lhs.add(10);

lhs.add(1);

lhs.add(20);

lhs.add(4);

lhs.add(10);

lhs.add(3);

System.out.println("LinkedhashSet output");

System.out.println(lhs);


}

}
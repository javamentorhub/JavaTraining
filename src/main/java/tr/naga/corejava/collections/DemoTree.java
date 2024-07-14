package tr.naga.corejava.collections;

import java.util.*;

class DemoTree{

public static void main(String[] args){

//TreeSet hs=new TreeSet(new MyComparator());

TreeSet hs=new TreeSet();

hs.add("Z");


hs.add("N");


hs.add("W");


hs.add("M");

System.out.println(hs);

}

}

class MyComparator implements Comparator{

public int compare(Object obj1,Object obj2){

String e1=obj1.toString();
String e2=obj2.toString();

return e1.compareTo(e2);

}
}



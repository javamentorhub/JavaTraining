package tr.naga.corejava.collections;

import java.util.*;

class HashSetDemo{

public static void main(String[] args){

TreeSet hs=new TreeSet(new MyComparator());  

//hs.add("A");

hs.add(new StringBuffer("A"));

hs.add(new StringBuffer("Z"));

hs.add(new StringBuffer("K"));

hs.add(new StringBuffer("L"));


System.out.println(hs);

}
}


class MyComparator implements Comparator{

public int compare(Object obj1,Object obj2){


String s1=obj1.toString();
String s2=obj2.toString();

int l1=s1.length();

int l2=s2.length();

if(l1<l2)
  return -1;
else if(l1>l2)
  return +1;
else
 return s1.compareTo(s2);

}
}


package tr.naga.corejava.collections;

import java.util.*;

class ArrayListDemo{

public static void main(String[] args){


ArrayList<Integer> al=new ArrayList<Integer>();

al.add(10);

al.add(20);

al.add(30);

al.add(40);

al.add(20);



System.out.println(al); //[10,20,30,40,20]

ListIterator itr=al.listIterator();

while(itr.hasNext()){

System.out.println(itr.next());

}

}

}

/*
// Iterator:
============
1. it is universal cursor(List, Set) but map indirectly
2. forward direction cursor
3. read and remove opeartion
4.

// ListIterator 


1. it is not universal cursor(List Implemented class)
2. forward and backward traverse
3. read and write and remove

*/



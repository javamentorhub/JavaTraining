package tr.naga.corejava.collections;

import java.util.*;

class LinkedListDemo{

public static void main(String[] args){

HashMap hm=new HashMap();
hm.put("Naga","Amit");
hm.put(102,"Ravi");
hm.put(101,"Vijay");
hm.put(103,"Rahul");
hm.put(101,"arjun");
hm.put(106,"arjun");
hm.put(107,"null");// NullPointerException
System.out.println(hm);
Set set=hm.entrySet();
Iterator itr=set.iterator();
while(itr.hasNext()){
Map.Entry m=(Map.Entry)itr.next();
System.out.println(m.getKey()+" "+m.getValue());
}
}
}
package tr.naga.corejava.collections;

import java.util.*;

class DemoHash{ // Object class equals method compare reference

public static void main(String[] args){

Student s=new Student(1,"Naga"); //123

Student s1=new Student(2,"Arjun");//245

Student s2=new Student(1,"Arun"); //345



HashSet hs=new HashSet();


hs.add(s); // 123

hs.add(s1); // 245.equals(123) // 345

hs.add(s2); // 345.equals(123) - false , 345.equals(245) - false



hs.add(10);

hs.add("Naga");

hs.add(10);
 

System.out.println(hs);

}
}


// insertion order is not followed

// objects cab be added to HashSet depends upon hashCode

// if we want to add custom object 

// Student , Employee , PolicyCreation , PolicyCancellation


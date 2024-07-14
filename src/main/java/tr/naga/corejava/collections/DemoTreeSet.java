package tr.naga.corejava.collections;

import java.util.*;


class Employee  {

int eid;

Employee(int eid){
this.eid=eid;
}

public String toString(){
return "E-"+eid;
}

public int compareTo(Object obj){
int eid1=this.eid;
Employee e2=(Employee)obj;
int eid2=e2.eid;
if (eid1<eid2)
 return -1;
else if (eid1>eid2)
 return +1;
else
 return 0;
}
}

class DemoTreeSet{

public static void main(String[] args){


TreeSet hs=new TreeSet();  // Natural Sorting order 

Employee e1=new Employee(100);

Employee e2=new Employee(300);

Employee e3=new Employee(50);

Employee e4=new Employee(500);  


hs.add(e1); 
hs.add(e2); 
hs.add(e3); 
hs.add(e4); 


System.out.println("natural soring logic");


System.out.println(hs);



TreeSet hs1=new TreeSet(new MyComparator());  

hs1.add(e1);

hs1.add(e2);

hs1.add(e3);

hs1.add(e4);

System.out.println("custom soring logic");

System.out.println(hs1);


}
}

class MyComparator implements Comparator{

public int compare(Object obj1,Object obj2){

Employee e1=(Employee)obj1;
Employee e2=(Employee)obj2;

return e2.compareTo(e1);

}
}


// if any class supportinhg natural sorting order (homogenious and Comparable)

// incase if we want to perform custom sorting order(ASC or DSC) then our class should be Comparator


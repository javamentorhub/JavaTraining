package tr.naga.corejava.collections;

import java.util.*;

class HashTableDemo{

public static void main(String[] args){ 

HashMap ht=new HashMap();  // 16 , 0.75

ht.put(1,"Naga"); // <K,V> - entry

ht.put("ab","Arjun");

ht.put("bc","Arun");

ht.put("na","kishore");

ht.put("kk",4);

ht.put("mm","naga");

ht.put("re","Sunny");

ht.put(null,"arjun");

ht.put(9,null);

System.out.println("hashmap output ");

System.out.println(ht);


LinkedHashMap hlm=new LinkedHashMap();   

hlm.put(1,"Naga"); 

hlm.put("ab","Arjun");

hlm.put("bc","Arun");

hlm.put("na","kishore");

hlm.put("kk",4);

hlm.put("mm","naga");

hlm.put("re","Sunny");

hlm.put(null,"arjun");

hlm.put(9,null);


System.out.println("Linkedhashmap output ");

System.out.println(hlm);


}
}


/*

1. Iterator is not part of Map interface so we cant use directly

2. So Convert Map to Set by using entrySet(map object reference followed by<K,V> entry)

3. entrySet() method will retrun Set Object 

4. Set conatins Iterator interface(where we can get Collection objects one by one)

5. By using Set object reference will get Iterator object(using iterator())

6. while fetching the object entries we are excepting same entry<K,V> as output

7. If we are looking for entry<K,V> as out put we need to convert Set to Map

8. To Convert Set to Map object format we need to type cast by using Map.Entry it returns Map object.

9. By using Map object wil featch key and values.

*/


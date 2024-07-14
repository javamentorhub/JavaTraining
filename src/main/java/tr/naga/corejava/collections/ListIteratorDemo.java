package tr.naga.corejava.collections;

import java.util.*;


	class ListIteratorDemo 
	{
	public static void main(String[] args) 
	{
        	LinkedList ll=new LinkedList();
        	
		ll.add("nag");
	       	ll.add("raj");
		ll.add("arjun");


		System.out.println(ll);
	        
		ListIterator litr=ll.listIterator();
		
		System.out.println("data in forword direction");
		
		while(litr.hasNext())
		{
			String s=(String)litr.next();
			System.out.println(s);
		}
	    		
		System.out.println(ll); 
   		
		System.out.println("data in backword direction");
	    	while(litr.hasPrevious())
		{
			 String s1=(String)litr.previous();
			 System.out.println(s1);
		}
		 ll.add("siva");
		 System.out.println(ll);
		}
            	}

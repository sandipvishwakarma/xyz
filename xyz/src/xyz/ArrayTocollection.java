package xyz;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayTocollection {

	public static void main(String[] args) {

		Integer[] a= {4,5,6,6,4,2,3,3,5,9,7,9};
	/*List<Integer>lst =(Arrays.asList(a));
	//lst.remove("2");
    System.out.println(lst);*/
	/*	
	Array to set conversion
	*/	
    Set<Integer>s= new HashSet<Integer>(Arrays.asList(a));
    Iterator<Integer> it= s.iterator();
    while(it.hasNext()){
    System.out.print(" "+it.next());
    }
   /* 
    Set to array conversion
   */ 
    Object[] aa= s.toArray();
    System.out.println(Arrays.toString(aa));
	}

}

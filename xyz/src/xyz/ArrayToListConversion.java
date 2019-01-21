package xyz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayToListConversion {

	public static void main(String[] args) {
		
		ArrayList<String>al=new ArrayList<>();
         al.add("11");
         al.add("1");
         al.add("5");
         al.add("19");
         al.add("15");
         System.out.println(al);
         Collections.reverse(al);
         Set<String>s = new HashSet<>(al);
       
         System.out.println(s.toString());
         System.out.println(al);
      /*   
         Reverse a Array
	*/
         int [] a = {2,4,3,5,53,33,66,10};
         Integer[] aa =new Integer[a.length];
         for(int i=0; i<a.length;i++)
         {
        	 aa[i]=Integer.valueOf(a[i]);
         }
         System.out.println(Arrays.toString(aa));
	/*
	        convert into ArrayList
	*/
         List<Object>all= (Arrays.asList(a));
        // List<Integer>lst =(Arrays.asList(a));
         Collections.reverse(all);
        // System.out.println(Arrays.toString(all));
        Iterator<Object>it =all.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
	}

}

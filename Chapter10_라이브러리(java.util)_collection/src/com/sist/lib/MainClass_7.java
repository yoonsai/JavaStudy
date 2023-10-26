package com.sist.lib;
/*
 *  검색
 */
import java.util.*;
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set=new HashSet<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			int k=r.nextInt(100)+1;
			set.add(k);
			
		}
		System.out.println(set);
	
	    // 50보다 작은수
	    for(int a:set)
	    {
		    if(a<50)
		    {
		 	System.out.print(a+" ");
		    }
	    }
	    System.out.println();
	    // 50보다 큰수
	    for(int a:set)
	    {
		    if(a>50)
		    {
		 	System.out.print(a+" ");
		    }
	    }
	    System.out.println();
	    TreeSet<Integer> tset=new TreeSet<Integer>(); // TreeSet => 자동정렬
	    tset.addAll(set); 
	    System.out.println("=======tset=======");
	    System.out.println(tset);
	    System.out.println("50보다 작은 수:"+tset.headSet(50));
	    System.out.println("50보다 큰 수:"+tset.tailSet(50));
	    
		
		
	}
	
	

}

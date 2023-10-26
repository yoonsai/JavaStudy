package com.sist.seoul;
import java.util.*;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SeoulManager sm=new SeoulManager();
//		Seoul[] sl=sm.seoulString();
//		for(Seoul ss:sl)
//		{
//			System.out.println(ss.getRank()+"."+ss.getLocation());
//		}
//		
		
		SeoulManager2 sm=new SeoulManager2();
		Scanner scan=new Scanner(System.in);
		System.out.print("지역(1),자연(2):");
		int a=scan.nextInt();
		Seoul[] sm1=sm.SeoulAllData(a);
		for(Seoul ss:sm1)
		{
			System.out.println(ss.getRank()+"."+ss.getLocation());
		}
	}

}

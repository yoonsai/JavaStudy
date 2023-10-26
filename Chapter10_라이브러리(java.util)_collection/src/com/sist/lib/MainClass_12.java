package com.sist.lib;
import java.util.*;
public class MainClass_12 {
	// 제네릭 => 매개변수
	/*
	 *  ArrayList<Integer>과 ArrayList<Double>의 데이터형은 Object로 동일 단지 저장된 데이터형이 무엇인지만 다를뿐
	 *  => 오버로딩 불가능 => 메소드명이 달라야함
	 */
	public static void display1(ArrayList<Integer> list) {
		for(int i:list)
		{
			System.out.println(i+" ");
		}
	}
    public static void display2(ArrayList<Double> list) {
    	for(double d:list)
		{
			System.out.println(d+" ");
		}
	}
    public static void display3(ArrayList<String> list) {
    	for(String s:list)
		{
			System.out.println(s+" ");
		}
	}
    public static void display5(ArrayList<?> list) {
    	for(Object s:list)
    	{
    		System.out.println(s);
    	}
    }
    //display(double d) ==> display(10)
    //ArrayList<String> list=new ArrayList<String>();
    //display5(list) => Object
    
    public static void display6(ArrayList list) {
    	for(Object o:list)
		{
			System.out.println(o+" ");
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		display1(list1);
		
		ArrayList<Double> list2=new ArrayList<Double>();
		list2.add(10.0);
		list2.add(20.0);
		list2.add(30.0);
		display2(list2);
		
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("A");
		list3.add("B");
		list3.add("C");
		display3(list3);
	}

}

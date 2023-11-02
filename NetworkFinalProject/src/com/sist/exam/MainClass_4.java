package com.sist.exam;

public class MainClass_4 /*implements Runnable*/{
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run Call....2");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//1번째 방식
//		Runnable r=()->{
//			System.out.println("run Call...1");
//		};
//		Thread t=new Thread(r);
//		t.start();
		
//		//2번째 방식
//		MainClass_4 m=new MainClass_4();
//		Thread t=new Thread(m);
//		t.start();
		
		//3번째 방식
		Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run Call..3");
			}
			
		};
		Thread t=new Thread(r);
		t.start();
		/*
		 * function aaa(){} => implements
		 * let aaa=function(){}
		 * let aaa=()=>{}=> 
		 * 메소드는 메소드명이 주소
		 */
		
	}


	

}

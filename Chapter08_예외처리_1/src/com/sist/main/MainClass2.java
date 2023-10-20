package com.sist.main;
/*
 *    인터페이스의 다형성
 *             ----
 *              한개 메소드를 
 */
interface II
{
	public void print();
	
}
class Music implements II
{
	public void print()
	{
		System.out.println("음악 목록 출력");
	}
}
class Movie implements II
{
	public void print()
	{
		System.out.println("영화 목록 출력");
	}
}
class Food implements II
{
	public void print()
	{
		System.out.println("맛집 목록 출력");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		II i=new Music();
		i.print();
		i=new Movie();
		i.print();
		i=new Food();
		i.print();

		
	}

}

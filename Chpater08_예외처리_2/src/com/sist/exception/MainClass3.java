package com.sist.exception;
/*
 * 
 */
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			for(int i=1;i<=10;i++)
			{
				int j=(int)(Math.random()*3);
				System.out.println("j="+j+"i="+i+",i/j="+(i/j));
				// 제외 => continue;
			}
		}catch(Exception e)
		{
			
		}
	}

}

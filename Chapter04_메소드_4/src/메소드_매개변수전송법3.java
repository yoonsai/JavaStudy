/*
 * 
 */

import java.util.Arrays;

public class 메소드_매개변수전송법3 {
	static void change(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
			
		}
	}
	static void change2(String s)
	{
		s="Hello Method";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp=new int[5];
		System.out.print("적용전:");
		System.out.println(Arrays.toString(temp));
		System.out.print("적용후:");
		change(temp);  // 얕은 복사, 같은 메모리를 사용
		System.out.println(Arrays.toString(temp));
		String ss="";
		change2(ss);
		System.out.println("ss="+ss );

	}

}

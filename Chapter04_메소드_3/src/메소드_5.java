/*
 * 
 */
import java.util.Arrays;
public class 메소드_5 {
	static int[] userInput()
	{
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	static int max(int[] arr)
	{
		int m=arr[0];
		for(int i:arr)
		{
			if(i>m)
				m=i;
		}
		return m;
	}
	static int min(int[] arr)
	{
		int m=arr[0];
		for(int i:arr)
		{
			if(i<m)
				m=i;
		}
		return m;
	}
	static void print(int max,int min)
	{
		System.out.println("max="+max);
		System.out.println("min="+min);
	}
	static void process()
	{
		int[] a=userInput();
		System.out.println(Arrays.toString(a));
		int max=max(a);
		int min=min(a);
		print(max,min);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int[] arr=new int[5];
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=(int)(Math.random()*100)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		
//		int max=arr[0];
//		int min=arr[0];
//		
//		for(int i:arr)
//		{
//			if(i>max)
//				max=i;
//			if(i<min)
//				min=i;
//		}
//		System.out.println("max="+max);
//		System.out.println("min="+min);
		process();
	}

}

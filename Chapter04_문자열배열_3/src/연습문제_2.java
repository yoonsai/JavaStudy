// 10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성

import java.util.Arrays;
public class 연습문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		int max=0;
		int min=100;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		for(int a:arr)
		{
			if(max<a)
				max=a;
			if(min>a)
				min=a;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
	}

}

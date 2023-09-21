/*
 *  
 */

import java.util.Scanner;
public class 문자열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String data=scan.next();
		
		int count=0;
		// charAt() 문자를 한개씩 자르는 경우에 사용
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			if(c=='a' || c=='A')
				count++;
		}
		System.out.println("a와 A의 개수는 "+count+"개 입니다");
	}

}

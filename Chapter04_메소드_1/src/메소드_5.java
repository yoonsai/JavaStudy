/*
 * 사칙연산 => 메소드 4 + 조립기 => 5개
 */
import java.util.*;
public class 메소드_5 {
	static int userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg+" 정수 입력:");
		return scan.nextInt();
	}
	static char opInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("연산자입력:");
		return scan.next().charAt(0);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=userInput("첫번째");
		int num2=userInput("두번째");
		char op=opInput();
		
		switch(op)
		{
		case '+':
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
		    break;
		case '-':
			System.out.printf("%d+%d=%d\n",num1,num2,num1-num2);
		    break;
		case '*':
			System.out.printf("%d+%d=%d\n",num1,num2,num1*num2);
		    break;    
		case '/':
			if(num2==0)
			{
				System.out.println("0으로 나눌 수 없다");
			}
			else
			{
				System.out.printf("%d+%d=%d\n",num1,num2,num1/(double)num2);
			    break;   
			}
		
		}
	}

}

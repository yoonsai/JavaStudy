// => up down 게임

import java.util.Scanner;

public class 메소드_문제_6 {
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("입력:");
		return scan.nextInt();
	}
	static int com()
	{
		int com=(int)(Math.random()*100)+1;
		return com;
	}
	static String hint(int com,int user)
	{
		String s="";
        if(com>user)
			s="입력된 값보다 큰 수를 입력하세요";
		else if(com<user)
			s="입력된 값보다 작은 수를 입력하세요";
		else
			s="game over!!";
		return s;
	}
	static void process()
	{
		int com=com();
		while(true)
		{
			int user=userInput();
			String h=hint(com,user);
			System.out.println(h);
			if(h.contains("game"))
				break;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}

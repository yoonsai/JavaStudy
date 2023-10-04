/*
 * 1. 1~10까지 출력하는 메소드 구현
   2. 1~10까지 합을 구하는 메소드 구현
   3. 1~n까지 합을 구하는 메소드 구현
   4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
   5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
   6. 문자열을 거꾸로 출력하는 메소드 구현
   
   메소드 : 기능처리(연산자+제어문)

 */
import java.util.Scanner;
public class 연습문제_2 {
	//1. 1~10까지 출력하는 메소드 구현
	static void out()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
	
	//2. 1~10까지 합을 구하는 메소드 구현
	static int sum()
	{
		int sum1=0;
		for(int i=1;i<=10;i++)
		{
			sum1+=i;
		}
		return sum1;
	}
	
	// 3. 1~n까지 합을 구하는 메소드 구현
	// 매개변수 (o), 리턴형(x)
	/*
	 *  메소드 사용시에 => 호출
	 *  ------------------ main()은 컴파일러에 의해 자동 호출
	 *                    ----------------------------
	 *                             | Callback
	 *  메소드
	 *  = Callback => main => 자동 호출되는 메소드(시작점)
	 *  = 사용자 정의 : 프로그래머가 직접 제작
	 *  = 라이브러리 : 이미 제작된 메소드 => 만들지 못하는 프로그램
	 *     = 자바에서 제공
	 *     = 외부업체에서 지원 (Jsoup,Spring) => mvnrespository.com
	 *     = CBD => 조립식
	 *       ------------ 메소드 호출
	 *  = 조립할때, 재사용, 유지보수가 편리하게 만든다
	 *  = 재사용
	 *    메소드를 불러온다
	 *    -------------
	 *    int aaa() ===> int a=aaa()
	 *    double bbb() ===> double d=bbb()
	 *    void ccc() ===> ccc()
	 *    boolean ddd() ===> boolean b=ddd()
	 *    ----------------------------------
	 *    
	 *    class A
	 *    {
	 *       int aaa(){}
	 *    }
	 *    class B
	 *    {
	 *       main()
	 *       {
	 *           A.aaa()  ==> (int)(Math.random()*100)
	 *                             -------------------- double
	 *       }
	 *      
	 *    }
	 *          
	 */
	static int userInput()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		return scan.nextInt();
	}
	static void sumInput(int a)
	{
		int sum1=0;
		for(int i=1;i<=a;i++)
		{
			sum1+=i;
		}
		System.out.println(sum1); 
	}
	
	// 4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현
	static String div(int a, int b)
	{
		String result="";
		if(b==0)
			result="0으로 나눌 수 없습니다!";
		else
			result=a+"/"+b+"="+a/b;
		return result;
	}
	/*
	 * 
	 * static void div(int a, int b)
	   {
		   double c=a/b;
		   System.out.println(c);
	   }
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	// 5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	static void upperChange(String a)
	{
//		String result="";
//		
//		for(int i=0;i<a.length();i++)
//		{
//			char c=a.charAt(i);
//			result+=(char)(c-32);
//		}
//		System.out.println(result);
		
		System.out.println(a.toUpperCase());
	}
	
	// 6. 문자열을 거꾸로 출력하는 메소드 구현
	static void changeOut(String b)
	{
		String result="";
		for(int i=b.length()-1;i>=0;i--)
		{
			char c=b.charAt(i);
			result+=c;
		}
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///1번문제
		out();
		///2번문제
		int sum1=sum();
		System.out.println("\n"+sum1);
		///3번문제
		int user=userInput();
		sumInput(user);
		///4번문제
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번쨰 정수 입력:");
		int num1=scan.nextInt();
		System.out.print("두번쨰 정수 입력:");
		int num2=scan.nextInt();
		
		String res=div(num1,num2);
		System.out.println(res);
		
		///5번문제
		upperChange("aaaaaa");
		///6번문제
		changeOut("qwer");
		
		
		
	}

}

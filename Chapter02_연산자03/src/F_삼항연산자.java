/*
 * if~else
 * (조건)?값1:값2
 *  조건 :true => 값1
 *  조건 :false => 값2
 *  java.lang.* => String,System,Math (import 없이 사용 가능)
 *  
 */
public class F_삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		//            0.0~0.99 =>0.99~ +1 => 1~100
		// Random r=new Random() r.next(100)
		System.out.println(a%2==0?a+"는 짝수다":+a+"는 홀수다");
		
		char ch='a';
		char c=(char)((Math.random()*26)+65); //A~Z
		int s=(int)(Math.random()*2); // 0,1
		ch=s==0?c:(char)(c+32); //대문자 소문자는 32차이
		// 'A'(65)+32 => 97('a')
		System.out.println(ch>'A' && ch<='Z'?ch+"는 대문자입니다.":ch+"는 소문자입니다.");
		
		
		
		
		char c1=(char)((Math.random()*26)+65); //A~Z
		int s1=(int)(Math.random()*2); // 0,1
		char ch1=s1==0?c1:(char)(c1+32); //대문자 소문자는 32차이
		// 'A'(65)+32 => 97('a')
		System.out.println(ch1>'A' && ch1<='Z'?ch1+"는 대문자입니다.":ch1+"는 소문자입니다.");
	}

}

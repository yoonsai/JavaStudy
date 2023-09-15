import java.util.Scanner;
public class 단일조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 점수를 입력해주세요:");
		int a=scan.nextInt();
		System.out.print("첫번째 점수를 입력해주세요:");
		int b=scan.nextInt();
		System.out.print("첫번째 점수를 입력해주세요:");
		int c=scan.nextInt();
		int sum=a+b+c;
		System.out.println("총점:"+sum);
		double avg=(a+b+c)/3.0;
		System.out.println("평균:"+avg);
		// \n => enter 새로운 줄에 입력
		// \t=> tab 
		// "\"홍길동\"" => 따옴표까지 출력하려면 따옴표 앞에 \ 입력
		
//		int temp=(int)avg/10;
//		if(temp==10 || temp==9)
//			System.out.println("학점:A");
//		if(temp==8)
//			System.out.println("학점:B");
//		if(temp==7)
//			System.out.println("학점:C");
//		if(temp==6)
//			System.out.println("학점:D");
//		if(temp<6)
//			System.out.println("학점:F");
		
		
		
		
		
	
		char score='A';
		char op=' '; //공백은 한칸 띄워야함
		if(avg>=90 && avg<=100) {
			score='A';
			if (avg>=97)
				op='+';
			if (avg>=93 && avg<=96)
				op='0';
			if (avg<93)
				op='-';				
		}
		if(avg>=80 && avg<90) {
			score='B';
			if (avg>=87)
				op='+';
			if (avg>=83 && avg<=86)
				op='0';
			if (avg<83)
				op='-';	
		}
		if(avg>=70 && avg<80) {
			score='C';
			if (avg>=77)
				op='+';
			if (avg>=73 && avg<=76)
				op='0';
			if (avg<73)
				op='-';	
		}
		if(avg>=60 && avg<70) {
			score='D';
			if (avg>=67)
				op='+';
			if (avg>=63 && avg<=66)
				op='0';
			if (avg<63)
				op='-';	
		}
		if(avg<60) {
			score='F';
		}
		System.out.print("학점:"+score);	
		System.out.print(op);
		
		
		
	}
}

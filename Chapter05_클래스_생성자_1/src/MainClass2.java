import java.util.*;
class Student{
	// heap 프로그램 종료시까지 메모리 유지
	String name;
	int kor,eng,math; // 0,0,0 => heap
	// 매개변수 / 지역변수 => stack
	Student(String name,int kor,int eng, int math)
	{
		// 매개변수 / 지역변수 => 메소드 안에서만 사용이 가능 => 자동 메모리 할당
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] st=new Student[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<st.length;i++)
		{
			System.out.print((i+1)+"번째 학생의 이름 입력:");
			String name=scan.next();
			
			System.out.print((i+1)+"번째 학생의 국어 점수 입력:");
			int kor=scan.nextInt();
			
			System.out.print((i+1)+"번째 학생의 영어 점수 입력:");
			int eng=scan.nextInt();
			
			System.out.print((i+1)+"번째 학생의 수학 점수 입력:");
			int math=scan.nextInt();
			
			Student j1=new Student(name,kor,eng,math);
			st[i]=j1;
		
		}
		for(int i=0;i<st.length;i++)
		{
			//System.out.println(st[i].name+" "+st[i].kor+" "+st[i].eng+" "+st[i].math);
			System.out.printf("%-5s%-5s%-5s%-5s\n",st[i].name,st[i].kor,st[i].eng,st[i].math);
		}
		
	}

}

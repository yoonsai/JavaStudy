import java.util.Scanner;
public class 문제풀이_1 {

	public static void main(String args[]) 
	{ 
	     Scanner scan=new Scanner(System.in);
	     System.out.println("농구공 갯수 : ");
	     int ball=scan.nextInt();
	     int box=ball/5;
	     
	     System.out.println(ball%5==0?"필요한 상자의 수 : "+box:"필요한 상자의 수 : "+(box+1));
	     
	     // System.out.println("필요한 상자의 수 : "+(int)(Math.ceil(ball/5.0))); 
	     // 반올림함수
	}



}

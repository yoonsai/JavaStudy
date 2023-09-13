
import java.util.Scanner; // import Scanner 쓴다음에 ctrl+space+enter

public class 문제풀이 {
   public static void main(String[] arg) {
	   Scanner scan=new Scanner(System.in); // Scanner scan=new Scanner 쓰고 ctrl+space+enter
	   System.out.print("3개 정수 입력(10 20 30):");
	   int a=scan.nextInt();
	   int b=scan.nextInt();
	   int c=scan.nextInt();
	   System.out.println(a*b+c);

   }

}
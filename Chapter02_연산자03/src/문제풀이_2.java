import java.util.Scanner;
public class 문제풀이_2 {

	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력: ");
	    char ch =scan.next().charAt(0); 
	    char lowerCase = (ch>='A' && ch<='Z'?(char)(ch+32):(char)(ch-32)); 
	    System.out.println("ch : " + ch); 
	    System.out.println("ch to lowerCase : " + lowerCase);
	}


}


import  java.util.Scanner;
public class 문제풀이 {

	public static void main(String[] args) { 
		
		Scanner scan=new Scanner(System.in);
		System.out.print("문자 입력:");
	    char ch =scan.next().charAt(0);  // 맨 첫자만 가져오는것 charAt(0), 두번쨰 문자 가져올때charAt(1) , 두번쨰 문자 가져올때charAt(2) 
	    System.out.println(ch);
	    boolean b = (ch>'A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9'?true:false); 
	    System.out.println(b); 
	}

}

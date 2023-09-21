/*
 * equals (==)
 */
import java.util.Scanner;
public class 문자열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String MID="admin", MPWD="1234";
		Scanner scan=new Scanner(System.in);
		System.out.print("아이디 입력:");
		String id=scan.next();
		System.out.println("비밀번호 입력:");
		String pw=scan.next();
		//대소문자 구분 => equals
		// 검색은 대소문자 구분하면 안됨 =>equalsIgnoreCase
		if(id.equalsIgnoreCase(MID) || pw.equals(MPWD))
			System.out.println(id+"님이 로그인되었습니다.");
		else
			System.out.println("ID나 PW가 틀렸습니다");
			
	}

}

// 1=> 메모방, 2=> 그림판, 3=> 브라우저
//=> 메뉴 클릭/ 버튼 클릭시 처리 => gui
import java.util.Scanner;
public class G_제어문_조건문3_3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 int no;
		 Scanner scan=new Scanner(System.in);
		 System.out.print("메뉴 선택:");
		 no=scan.nextInt();
		 if(no==1) {
			 System.out.println("메모장을 선택했습니다.");
		 }
		 else if(no==2) {
			 System.out.println("그림판을 선택했습니다.");
		 }
		 else if(no==3) {
			 System.out.println("브라우저를 선택했습니다.");
			 Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			 
		 }
		 
	}

}

/*
 * 컴퓨터 vs 플레이어 => 가위바위보 게임
 * ----------------------------
 * => 다중조건문 => 경우의 수 9개
 *              -----------조건문
 *              
 *   
 *     컴퓨터       플레이어
 *     -------------------------------
 *     가위         가위
 *                 바위
 *                 보
 *     바위         가위
 *                 바위
 *                 보
 *     보           가위
 *                 바위
 *                 보            
 *     ------------------------------- 가정 => 가위(0), 바위(1), 보(2)
 *     ==> 중첩 if
 *     <로그인 상태>
 *     if(조건문) {
 *     
 *         if(조건문) {  => 관리자 
 *         }
 *         if(조건문) {  => 사용자 
 *         }
 *     }
 *     else {  => 게스트
 *     }
 *                 
 * 
 */

import java.util.Scanner;
public class F_제어문_조건문3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com;
		int user;
		com=(int)(Math.random()*3);
		Scanner scan=new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) :");
		user=scan.nextInt();
		
		System.out.print("컴퓨터:");
		if(com==0)
			System.out.println("가위");
		else if(com==1)
			System.out.println("바위");
		else if(com==2)
			System.out.println("보");
		

		
		System.out.print("사용자:");
		if(user==0)
			System.out.println("가위");
		else if(user==1)
			System.out.println("바위");
		else if(user==2)
			System.out.println("보");
		
		
		int res=com-user;
		if(res==-2 || res==1)
			System.out.println("컴퓨터가 이김");
		else if(res==-1 || res==2)
			System.out.println("사용자가 이김");
		else
			System.out.println("비김");
		
		
//		if(com==0) { // 컴퓨터가 가위일때
//			if(user==0) {
//				System.out.println("비겼음"); //com - user = 0
//			}
//			else if(user==1) {
//				System.out.println("사용자가 이김"); //com - user = -1 (U)
//			}
//            else if(user==2) {
//            	System.out.println("컴퓨터가 이김"); //com - user = -2 (C)
//			}
//		}
//		else if (com==1) { // 컴퓨터가 바위일때
//			if(user==0) {
//				System.out.println("컴퓨터가 이김"); //com - user = 1 (C)
//			}
//			else if(user==1) {
//				System.out.println("비겼음"); //com - user = 0
//			}
//            else if(user==2) {
//            	System.out.println("사용자가 이김"); //com - user = -1 (U)
//			}
//		}
//        else if (com==2) { // 컴퓨터가 보일때
//        	if(user==0) {
//				System.out.println("사용자가 이김"); // com - user = 2 (U)
//			}
//			else if(user==1) {
//				System.out.println("컴퓨터가 이김"); //com - user = 1 (C)
//			}
//            else if(user==2) {
//            	System.out.println("비겼음"); //com - user = 0
//			}
//		}
	}

}

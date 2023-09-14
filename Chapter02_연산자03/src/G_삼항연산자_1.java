/*
 * 컴퓨터와 가위바위보 (0,1,2)
 * 0 = 가위
 * 1 = 바위
 * 2 = 보
 * 
 *  => 1. 컴퓨터 난수 발생
 *  => 2. 사용자 입력
 *  => 3. 컴퓨터, 사용자의 가위바위보 출려
 *  => 4. 결과값
 *        -------
 *        컴퓨터           사용자    결과     뺄셈
 *        -----------------------------------------
 *        0(가위)           0      s       0
 *        0(가위)           1      W      -1
 *        0(가위)           2      L      -2
 *       -----------------------------------------
 *        1(바위)           0      L       1
 *        1(바위)           1      s       0
 *        1(바위)           2      W      -1
 *       -----------------------------------------
 *        2(보)             0      W      2
 *        2(보)             1      L      1
 *        2(보)             2      s      0       
 */  

import java.util.Scanner;
public class G_삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int com=(int)(Math.random()*3);
    Scanner scan=new Scanner(System.in);
    System.out.println("가위(0) 바위(1) 보(2):");
    int user=scan.nextInt();
    
    System.out.print("컴퓨터:");
    System.out.print(com==0?"가위":"");
    System.out.print(com==1?"바위":"");
    System.out.print(com==2?"보":"");
    System.out.println();
    System.out.print("플레이어:");
    System.out.print(user==0?"가위":"");
    System.out.print(user==1?"바위":"");
    System.out.print(user==2?"보":"");
    System.out.println();
    
    
    int result=com-user;
    System.out.print(result==0?"무승부":"");
    System.out.print(result==-1 || result==2?"사용자가 이겼습니다.":"");
    System.out.print(result==1 || result==-2?"컴퓨터가 이겼습니다.":"");
    
    
	}

}

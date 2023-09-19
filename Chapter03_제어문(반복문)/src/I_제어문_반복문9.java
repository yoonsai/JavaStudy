/*
 * updown 게임
 * -------------
 *   컴퓨터 난수 발생 : 1~100
 *   --------------------
 *   => 힌트
 *      ---
 *      => 정답이 나올때까지 반복
 *      ----------------------- 무한루프
 *      for() => while(true)
 */

import java.util.Scanner;
// impor tjava.lang.*; => 시스템에서 자동으로 불러오는 폴더 lang / lang이 아니면 다 import 붙어야 쓸 수 있음
public class I_제어문_반복문9 {

	// 메소드는 끝날때 return을 써줘야되지만, 자동으로 불러옴
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수 발생
		// 종료 => break. system.exit(0)
		int a=(int)((Math.random()*100)+1);
		Scanner scan=new Scanner(System.in);
		int count=0;
		
		for(;;)
		{
			System.out.print("1~100사이의 값을 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100) {
				System.out.println("잘못된 입력입니다.");
				continue; // => 다시 처음으로 돌아가기, 다음 if문 문장 수행X
			}
			count++;
			//힌트
			if(a>user)
			{
				System.out.println(user+"보다 큰 숫자 입니다.");
			}
			else if(a<user)
			{
				System.out.println(user+"보다 작은 숫자 입니다.");
			}
			else { // 정답
				System.out.println("game over");
				System.out.println("입력횟수:"+count);
				System.exit(0); // 프로그램 종료
			}
		}
		
	}

}

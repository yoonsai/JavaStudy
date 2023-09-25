/*
 * 응용
 * => 정수를 1개 입력 받아서 => 이진법 출력
 * 32비트 => 0,1 => 16비트(0~32767) => 양수
 * 0,15...
 * 
 * 10
 * 0000 0000 0000 1010 => 0번부터 채우는게 아니라 뒤에서 부터 채워야함
 */
import java.util.Scanner;
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary=new int[16];
		int index=binary.length-1; // 마지막 인덱스 번호
		
		//역순으로 값을 배치
		Scanner scan=new Scanner(System.in);
		System.out.print("0~32767사이의 정수입력:");
		int num=scan.nextInt();
		
		System.out.println("=======Lib========");
		System.out.println(Integer.toBinaryString(num));
		while(true)
		{
			binary[index]=num%2;
			num=num/2; //  1/2=0
			if(num==0) break;
			index--;
		}
		for(int i=0;i<binary.length;i++)
		{
			if(i%4==0 && i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
		
	}

}

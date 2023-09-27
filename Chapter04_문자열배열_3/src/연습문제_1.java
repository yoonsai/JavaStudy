//5명의 학생의 국어점수를 받아서 등수를 출력하는 프로그램 작성

import java.util.Scanner;
public class 연습문제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] rank=new int[5];
		int[] kor=new int[5];
		for(int i=0;i<kor.length;i++)
		{
			System.out.print((i+1)+"번째 학생의 국어 점수:");
			kor[i]=scan.nextInt();
		}
		//등수구하기
		for(int i=0;i<rank.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<kor.length;j++)
			{
				if(kor[i]<kor[j])
				{
					rank[i]++;
				}
			}
		}
		for(int i=0;i<rank.length;i++)
		{
			System.out.println(kor[i]+" "+rank[i]);
		}
	}

}

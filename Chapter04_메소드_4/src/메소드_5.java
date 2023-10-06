/*
 *  1. 반복이 많은 경우
 *  예) 
 *     데이터 추가
 *      = 오라클 연결
 *      = 데이터 추가 처리
 *      = 오라클 닫기
 *     데이터 수정
 *      = 오라클 연결
 *      = 데이터 추가 처리
 *      = 오라클 닫기
 *     데이터 삭제 
 *      = 오라클 연결
 *      = 데이터 추가 처리
 *      = 오라클 닫기
 *     데이터 검색
 *      = 오라클 연결
 *      = 데이터 추가 처리
 *      = 오라클 닫기
 *  2. 다른 클래스와 연결
 *    --------------- 웹
 *  3. 재사용 => 미리 제작하고 필요시마다 호출
 *  ------- 기능을 한가지만 수행하게 만든다
 *  
 *  3명의 학생의 국어, 영어, 수학 => 총점,평균,학점,등수
 *     
 */
import java.util.Scanner;
public class 메소드_5 {
	static int[] userInput(String msg)
	{
		Scanner scan=new Scanner(System.in);
		int[] st=new int[3];
		for(int i=0;i<st.length;i++)
		{
			System.out.print((i+1)+"번째 학생의 "+msg+"점수 입력:");
			st[i]=scan.nextInt();
		}
		return st;
		
	}
	static int[] total(int[] kor,int[] eng,int[] math)
	{
		int[] sum=new int[3];
		for(int i=0;i<sum.length;i++)
		{
			sum[i]=kor[i]+eng[i]+math[i];
		}
		return sum;
	}
	static double[] avg(int[] total)
	{
		double[] avg=new double[3];
		for(int i=0;i<avg.length;i++)
		{
			avg[i]=total[i]/3.0;
		}
		return avg;
	}
	static char[] score(double[] avg)
	{
		char[] score=new char[3];
		for(int i=0;i<score.length;i++)
		{
			if(avg[i]>=90)
				score[i]='A';
			else if(avg[i]>=80)
				score[i]='B';
			else if(avg[i]>=70)
				score[i]='C';
			else if(avg[i]>=60)
				score[i]='D';
			else
				score[i]='F';
		}
		return score;
	}
	static int[] rank(double[] avg)
	{
		int[] rank=new int[3];
		for(int i=0;i<rank.length;i++)
		{
			rank[i]=1;
			for(int j=0;j<avg.length;j++)
			{
				if(avg[i]<avg[j])
					rank[i]++;
			}
		}
		return rank;
	}
	static void print(int[] kor, int[] eng, int[] math, int[] total,double[] avg,char[] score,int[] rank)
	{
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%-5d%-5d%-5d%-5d%-7.2f%-5c%-5d\n",kor[i],eng[i],math[i],total[i],avg[i],score[i],rank[i]);
		}
	}
	static void process()
	{
		int[] kor=userInput("국어");
		int[] eng=userInput("영어");
		int[] math=userInput("수학");
		int[] total=total(kor,eng,math);
		double[] avg=avg(total);
		char[] score=score(avg);
		int[] rank=rank(avg);
		print(kor,eng,math,total,avg,score,rank);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();

	}

}

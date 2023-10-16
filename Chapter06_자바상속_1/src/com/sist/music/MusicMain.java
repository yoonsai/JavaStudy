package com.sist.music;
import java.util.Scanner;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("선택(genie(1)Melon(2):");
		int select=scan.nextInt();
		GenieMusicSystem ms=null;
		if(select==1)
		{
			ms=new GenieMusicSystem();
		}
		else
			ms=new MelonMusicSystem();
		
		//전체 목록 읽기
		Music[] m=ms.musicAllData();
		for(Music mm:m)
		{
			System.out.println(mm.getMno()+"."+mm.getTitle());
		}
		
		//2.검색
		System.out.println("=======================================================");
		System.out.print("가수명 입력:");
		String s=scan.next();
		Music[] findData=ms.musicSingerFindData(s);
		for(Music mm:findData)
		{
			
		}
			
		
		
	}

}

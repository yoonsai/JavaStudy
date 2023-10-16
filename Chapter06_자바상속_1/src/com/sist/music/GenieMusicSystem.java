package com.sist.music;
/*
 * GenieMusicSystem
 *       |
 * MelonMusicSystem 상속을 받으려고 함 (패키지가 동일해서 상속가능)
 * 패키지가 다를 경우는?
 * 
 * 
 * => 접근지정어
 *    -------
 *    default => 패키지가 동일 해야함
 *    private => getter/setter => 접근이 가능  (은닉화와 관련)
 *    protected => 패키지가 동일 해야함 / 상속을 받는 경우에는 패키지가 달라도 됨 
 *    public => 공개
 *    기본 => 모든 데이터는 은닉화해야함
 *  
 */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.select.*;
import org.jsoup.nodes.*;
//import java.util.Date;
import java.sql.*;
public class GenieMusicSystem {
	 protected Music[] musics=new Music[50]; //=> private을 쓰고싶지만 상속이 안되서 사용
	 protected String title="지니뮤직 Top";
	 
	 
	 
	 // 생성자, 초기화 블록
	 // 생성자 사용 x => 왜?
	 {
		 //외부에서 데이터를 가지고 들어올때 => 값을 초기화 => 명시적 초기화 안됨(클래스 영역에서 제어문 사용이 불가능해서) => 생성자나 초기화 블록을 사용해야함
		 // ---------- 크롤링, 파일, 오라클 .. => 구현
		 /*
		  *  초기화 블록
		  *  => 인스턴스 블록 {} => 인스턴스 변수, static 변수 사용
		  *  => static 블록 (정적블록) static{} : static변수만 초기화 가능
		  *  => --------------------------- 자동 인식(호출하는 것이 아니다)
		  *  => 상속의 예외조건임(상속이 안됨)
		  *  try~catch => 프로그램의 비정상 종료 방지
		  *            => 에러를 사전에 방지
		  *            
		  *   try {
		  *        //정상적으로 수행하는 문장
		  *        // 지금까지 코딩했던 모든 문장
		  *       }catch(Exception ex) {에러시 처리}    
		          => {} 공백 => 에러를 무시하고 다음 문장을 수행한다    
		          network, 파일, 오라클 연동 ==> 에외처리를 반드시 한다
		          => 수정이 가능한 에러만 가능하다
		             메모리 부족 (X)
		             
		             에러 / 예외처리
		             10/0
		                          
		  *            
		  */
		 
     try {
    	 //java.util.Date date=new java.util.Date(); //라이브러리를 import통해서 불러오지 않고 생성지 명시할 수 있음
    	 Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
    	 //HTML을 저장하는 공간, HTML을 읽어서 데이터 추출
    	 //데이터 저장 => HTML, JSON, XML => 데이터 추출 방식이 틀리다
    	 /*
    	  *  HTML => tag와 attribute로 이루어져있음
    	  *          <a class="aaa"></a>   (<>,</>,<a/> => Markup langage
    	  *          ---            -----
    	  *  태그를 읽는 방법
    	  *  Element => Tag
    	  *  같은 태그 여러개를 읽는 경우
    	  *  Elements
    	  *  
    	  *  ==> 구분자
    	  *      id ==> 태그명#ID명 => 중복이 없는 경우(유일)
    	  *      class => 태그명.클래스명 => 중복이 있는 경우
    	  *  <table id="aaa"> => table#aaa 
    	  *  <table class="bbb"> table.bbb
    	  *  
    	  *  String[] arr={"aaa","bbb","ccc","ddd"}
    	  *  arr[i]
    	  *    
    	  *    
    	  */
    	 //노래 제목
    	 Elements title=doc.select("table.list-wrap td.info a.title");
    	 //가수명
    	 Elements singer=doc.select("table.list-wrap td.info a.artist");
    	 //앨범
    	 Elements album=doc.select("table.list-wrap td.info a.albumtitle");
    	 
    	 for(int i=0;i<50;i++)
    	 {
    		 musics[i]=new Music();
    		 musics[i].setMno(i+1);
    		 musics[i].setTitle(title.get(i).text());
    		 musics[i].setSinger(singer.get(i).text());
    		 musics[i].setAlbum(album.get(i).text());
    		 
    	 }
	 }catch(Exception ex) {}
		  
     
	 }
	 public Music[] musicAllData()
     {
    	 return musics;
     }
	 //제목으로 찾기
	 public Music[] musicTitleFindData(String title)
	 {
		 int count=0;
		 for(Music mm:musics)
		 {
			 if(mm.getTitle().contains(title))
			 {
				 count++;
			 }
		 }
		 Music[] music=new Music[count];
		 int i=0;
		 for(Music m:musics)
		 {
			 if(m.getTitle().contains(title))
			 {
				 music[i]=m;
				 i++;
			 }
		 }
		 
		 return music;
	 }
	 // 가수명 찾기
	 public Music[] musicSingerFindData(String singer)
	 {
		 int count=0;
		 for(Music mm:musics)
		 {
			 if(mm.getSinger().contains(singer))
			 {
				 count++;
			 }
		 }
		 Music[] music=new Music[count]; // 배열의 단점 => 고정(갯수지정)
		 // 배열(고정) => 가변형[컬렉션]
		 int i=0;
		 for(Music m:musics)
		 {
			 if(m.getSinger().contains(singer))
			 {
				 music[i]=m;
				 i++;
			 }
		 }
		 
		 return music;
	 }
	 //상세보기
	 public Music musicDetailData(int mno)
	 {
		 return musics[mno-1];
	 }
	 
	 public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("가수명 입력:");
		String singer=scan.next();
		GenieMusicSystem genie=new GenieMusicSystem();
		Music[] music=genie.musicSingerFindData(singer);
		System.out.println("검색결과:"+music.length+"건");
		for(Music m:music)
		{
			System.out.println(m.getMno()+"."+m.getSinger());
		}
		
	}
	
}

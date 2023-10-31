package com.sist.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * FileInputStream / FileOutputStream의 주 역할
 * 파일에 복사하는 것 (웹 => 업로드, 다운로드)
 * 파일 이용 => 메모리(데이터=>프로그램 종료시에 자동으로 해제)
 * ------- 영구적으로 저장
 * 보완 => 파일의 단점 보안 취약 =>  파일 종속적이다 (여러개의 파일을 연걸해서 사용하기 어렵다)
 * 
 * 
 * 
 * read(byte[] b, int off, int len)
   : 입력 스트림으로부터 len개의 바이트만큼 읽고, 매개값으로 주어진 바이트 배열 b[off] 부터 len까지 저장. 
     그리고 읽은 바이트 수인 len개 리턴. 
 * 
 * 
 * 	
 */
public class MainClass_FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//파일 읽기 ==> 서버
			FileInputStream fis=new FileInputStream("c:\\javaDev\\back.jpg");
			
			//파일 쓰기 ==> 클라이언트
			FileOutputStream fos=new FileOutputStream("c:\\\\javaDev\\back.jpg");
			// 파일 복사 => 읽은 바이트수
			int i=0;
			byte[] buffer=new byte[1024];
			//한번에 1024바이트씩 읽어서 복사
			
			//read() => 한글자, read(byte[])
			while((i=fis.read(buffer,0,1024))!=-1)
			{
				fos.write(buffer,0,i);
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료!");
		}catch(Exception e)
		{
			
		}
	}

}

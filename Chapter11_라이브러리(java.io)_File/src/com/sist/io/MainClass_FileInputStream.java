package com.sist.io;
/*
 *  한글 파일 읽기 => (X) => 다운로드 / 업로드
 *  read() / write() / ==> append
 *  => new FileInputStream / new FileOutStream("경로명")
 *  => create => new FileOutputStream("경로명",true)
 *  파일은 반드시 닫는다
 */
import java.io.*;
public class MainClass_FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fos=new FileInputStream("c:\\java_data\\category.txt");
			//FileReader fos=new FileReader("c:\\java_data\\category.txt");
			// 한글파일을 읽을때는 FileReader를 사용해야함
			
			int i=0; // 한글자씩 읽어온다 => ASC(문자번호)
			// A => 65
			// 파일 끝날때까지 읽어온다 => -1(EOF)
			// 바이트 스트림은 => 한글파일 읽기 => 업로드 / 다운로드
			String msg="";
			while((i=fos.read())!=-1)
			{
				msg+=(char)i;
				
			}
			fos.close();
			System.out.println(msg);
			
		}catch(Exception e)
		{
			
		}
	}

}

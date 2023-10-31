package com.sist.io;
import java.io.*;
// 파일 읽기 => 송수신 => 2byte씩 읽어온다 => 문자 스트림
// 파일 
public class MainClass_FileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr=null;
		try
		{
			fr=new FileReader("c:\\java_data\\sawon.txt");
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.println((char)i);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			}catch(Exception e)
			{
				
			}
		}
	}

}

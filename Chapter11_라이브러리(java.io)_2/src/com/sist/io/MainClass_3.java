package com.sist.io;
import java.io.*;
//BufferedInputStream => 파일 데이터 읽기

public class MainClass_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fis=new FileInputStream("c:\\javaDev\\genie.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			int i=0;
			while((i=bis.read())!=-1)
			{
				System.out.print((char)i);
				
			}
			bis.close();
		}catch(Exception e)
		{
			
		}
	}

}

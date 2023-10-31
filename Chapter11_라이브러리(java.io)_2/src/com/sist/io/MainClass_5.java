package com.sist.io;
import java.io.*;
// 업로드 다운로드
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis=new FileInputStream("c:\\javaDev\\genie.txt");
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\genie.txt");
			
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			int i=0; // read() => 한글자 읽기
			// read(byte[]) => 읽은 바이트수
			byte[] buffer=new byte[1024];
			while((i=bis.read(buffer,0,1024))!=-1) //read() 매개변수가 없을때 1글자씩 읽어오기
			{
				bos.write(buffer,0,i);
			}
			bis.close();
			bos.close();
			System.out.println("파일 복사 완료");
		}catch(Exception e)
		{
			
		}
	}

}

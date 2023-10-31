package com.sist.io;
/*
 *  존재여부 확인 ==> exists()
 *  폴더 / 파일 mkdir() / createNewFile
 */
import java.io.*;
public class MainClass_File_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File dir=new File("c:\\java_data");
			if(dir.exists())
			{
				System.out.println("이미 존재하는 폴더입니다.");
				
			}
			else
			{
				dir.mkdir();
				System.out.println("폴더 생성이 완료되었습니다.");
			}
			
			File file=new File("c:\\java_data\\category.txt");
			if(file.exists())
			{
				System.out.println("이미 존재하는 파일입니다.");
				
			}
			else
			{
				file.createNewFile();
				System.out.println("파일 생성이 완료되었습니다.");
			}
		}catch(Exception e) {}
	}

}

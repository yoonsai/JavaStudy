package com.sist.io;

import java.io.File;
import java.util.*;
import java.text.*;
import java.io.*;
//파일 정보 출력
public class MainClass_File_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file=new File("c:\\javaDev\\movie.txt");
			System.out.println("최종 수정일:"+new SimpleDateFormat("yyyy.mm.dd hh:mm:ss").format(new Date(file.lastModified())));
			
			System.out.println("========기타정보========");
			System.out.println("**파일명:"+file.getName());
			System.out.println("**경로명+파일명:"+file.getPath());
			System.out.println("경로명:"+file.getParent());
			System.out.println("읽기가능:"+file.canRead());
			System.out.println("쓰기가능:"+file.canWrite());
			System.out.println("숨김파일:"+file.isHidden());
			System.out.println("절대경로:"+file.getAbsolutePath());
			System.out.println("정규경로:"+file.getCanonicalPath());
			System.out.println("파일크기:"+file.length());
			System.out.println("File.pathSeparator"+file.pathSeparator);
			// windouw \ mac /
	         long size=file.length();
	         String s="";
	         if(size/1024>0)
	            s=(size/1024)+"KB";
	         else
	            s=size+"Bytes";
	         System.out.println("파일 크기:"+s);
			
			
		}catch(Exception e)
		{
			
		}
	}

}

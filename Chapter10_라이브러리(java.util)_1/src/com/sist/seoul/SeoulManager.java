package com.sist.seoul;
//272|동대문디자인플라자 (DDP)|2006년 서울특별시청이 계획한 동대문디자인플라자(DDP)는 2014년 3월 21일 문을 열었다.|04566 서울 중구 을지로 281 (을지로7가, 디자인장터)
import java.io.*;
import java.util.*;
public class SeoulManager {
	private static Seoul[] seoul=new Seoul[273];
	
	public SeoulManager()
	{
		FileReader fr=null;
		try
		{
			fr=new FileReader("c://javaDev//seoul_location.txt");
			
			
			int i=0;
			String data="";
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
			}
			
			String[] se=data.split("\n");
			i=0;
			for(String s:se)
			{
				StringTokenizer st=new StringTokenizer(s,"|");
				seoul[i]=new Seoul();
				seoul[i].setRank(Integer.parseInt(st.nextToken()));
				seoul[i].setLocation(st.nextToken());
				seoul[i].setInfo(st.nextToken());
				seoul[i].setAddress(st.nextToken());
				i++;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
		finally
		{
			try
			{
				fr.close();
			}catch(Exception e)
			{
				
			}
		}

	}
	public Seoul[] seoulString() {
		return seoul;
	}
	
	
	
	
}

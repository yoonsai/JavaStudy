package com.sist.seoul;
import java.io.*;
import java.util.*;
public class SeoulManager2 {
	public Seoul[] SeoulAllData(int i)
	{
		Seoul[] seoul=null;
		FileReader fr=null;
		String path="c://javaDev//";
		if(i==1)
		{
			path+="seoul_location.txt";
			
		}
		else
		{
			path+="seoul_nature.txt";
		}
		try
		{
			fr=new FileReader(path);
			int j=0;
			String data="";
			while((j=fr.read())!=-1)
			{
				data+=(char)j;
			}
			StringTokenizer st=new StringTokenizer(data,"\n");
			seoul=new Seoul[st.countTokens()];
			
			String[] seouls=data.split("\n");
			j=0;
			for(String s:seouls)
			{
				st=new StringTokenizer(s,"|");
				seoul[j]=new Seoul();
				seoul[j].setRank(Integer.parseInt(st.nextToken()));
				seoul[j].setLocation(st.nextToken());
				seoul[j].setInfo(st.nextToken());
				seoul[j].setAddress(st.nextToken());
				j++;
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
		return seoul;
	}
}

package com.sist.lib;
//멜론 : 곡명 , 지니뮤직 : 곡명 => 중복이 안된 노래만 추출 
//공통 / 차집합 / 교집합 / 합집합
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class MainClass_6 {
	public static Set genieMusic()
	{
		Set set=new HashSet();
		try
		{
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title=doc.select("table.list-wrap a.title");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
			
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		return set;
	}
	public static Set<String> MelonMusic()
	{
		Set<String> set=new HashSet<String>();
		
		try {
			Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title=doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text());
			}
		}catch(Exception e)
		{
			e.getStackTrace();
		}
		return set;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> genie=genieMusic();
		System.out.println("===============GenieMusic==============");
		System.out.println("곡수:"+genie.size());
		for(String title:genie)
		{
			System.out.println(title);
		}
		System.out.println("===============MelonMusic==============");
		Set<String> melon=MelonMusic();
		System.out.println("곡수:"+melon.size());
		for(String title:melon)
		{
			System.out.println(title);
		}
		
////	//차집합 => removeAll() => 오라클에서는 MINUS
//		System.out.println("============지니 뮤직에만 있는 노래===========");
////    //[1,2,3,4,5] - [1,2,3,6,7] = 4,5
//		genie.removeAll(melon);
//		for(String title:genie)
//		{
//			System.out.println(title);
//		}
		
		
		//교집합 => retainAll()
//		System.out.println("============지니뮤직과 멜론의 동일노래===========");
//		genie.retainAll(melon); 
//		System.out.println("곡수:"+genie.size());
//		for(String title:genie)
//	    {
//			System.out.println(title);
//	    }
		
		
		//장바구니 => 동일상품 관계없이 처리
		//오라클 => UNIONALL
		System.out.println("============지니뮤직+멜론(중복제거x)===========");
		List<String> list=new ArrayList<String>();
		
		list.addAll(genie);
		list.addAll(melon);
		System.out.println("곡수:"+list.size());
		for(String title:list)
		{
			System.out.println(title);
		}
		
		//오라클 => UNION
		System.out.println("============지니뮤직+멜론(중복제거)===========");
		Set<String> hap=new HashSet<String>();
		
		hap.addAll(genie);
		hap.addAll(melon);
		System.out.println("곡수:"+hap.size());
		for(String title:hap)
		{
			System.out.println(title);
		}

	}

}

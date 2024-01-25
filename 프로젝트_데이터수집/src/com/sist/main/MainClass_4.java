package com.sist.main;
import java.io.FileWriter;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.*;
public class MainClass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int s=1;
		    for (int i = 1; i < 10; i++) {
	        	String url="https://egnmall.kr/kwa-ABS_goods_l-1009003?PB_1410486717="+i;
		        Document doc = Jsoup.connect(url).get();
		        Elements link = doc.select("div.-fdGoodsName a");
		        //Elements link2 = doc.select("div.-fdThumb div div div a");
		        //System.out.println(link2.size());
		        //Elements images=doc.select("div.hot_item_list2 div.hot-item2 div.box a img");
		        //System.out.println(link.size());
		        //System.out.println(link2.size());
		        for (int j = 0; j < link.size(); j++) {
		            String subLink = "https://egnmall.kr/" + link.get(j).attr("href");
//		            String subLink2 = "https://egnmall.kr/" + link2.get(j).attr("href");
		            //System.out.println(subLink);
//		            System.out.println(subLink2);
		            
		            Document doc2=Jsoup.connect(subLink).get();
		            Elements titles=doc2.select("div.-bdTitleWrap table tr td div h4");
		            String title=titles.text();
		            System.out.println(title);
		            
		            
		            Elements images=doc2.select("div.swiper-wrapper div.swiper-slide img#big_img");
		            String image="";
		            if(images.attr("src").contains("jpg") || images.attr("src").contains("png") || images.attr("src").contains("gif"))
		            {
		            	image="https://egnmall.kr"+images.attr("src").replace("./", "/");
			            //System.out.println(image);
		            }
//		            
//		            Elements contents=doc2.select("div.tab_con div.tripvideo div.cont");
//		            String content=contents.text();
//		           /d/ System.out.println(content);
//		            

		            Elements orgins=doc2.select("div.-bdGoodsInfo table tbody tr td span");
		            String ss=orgins.text();
		            String orgin="국내산(부산)";
		            if(ss.contains("국내산(경남") || ss.contains("국내산(경상"))
		            {
		            	String ss2=orgins.text().substring(orgins.text().indexOf("국내산"));
		            	orgin=ss2.substring(0,ss2.indexOf(")")+1);
		            	if(orgin.contains("x 개"))
		            	{
		            		orgin=orgin.substring(0,orgin.indexOf("산")+1);
		            	}
			            
		            }
		            //System.out.println(orgin);
	            		
//		            String orgin=orgins.text();
		            
		            
		            Elements prices=doc2.select("div.-bdGoodsInfo td.-bdPriceGoods span.price_unit");  
		            String price=prices.text().substring(0,prices.text().indexOf("원")+1);
		            //System.out.println(price);
		            
		            Elements facs=doc2.select("div.-bdGoodsInfo table tbody tr td a");  
		            String fac=facs.text();
		            //System.out.println(fac);
		            
		            Elements detailimages=doc2.select("div.-fdDescription div p img");  
		            String detailimage="";
		            String de=detailimages.attr("src");
		            if(de.contains("gif") || de.contains("jpg") || de.contains("png"))
		            {
		            	detailimage="https://egnmall.kr"+detailimages.attr("src");
		            }
		            else {
		            	detailimage="https://egnmall.kr"+images.attr("src").replace("./", "/");
		            }
		            //System.out.println(detailimage);
		            
		            
		            
		            
		            
//		            String origin="정보없음";
//		            String fac="정보없음";
//		            String price="정보없음";
//		            String rest="정보없음";
//		            String home="정보없음";
//	            	String time="정보없음";
//	            	String price="정보없음";
//	            	for(int a=0;a<infotitles.size();a++)
//	            	{
//	            		String ss=infotitles.get(a).text();
//	            		if(ss.contains("대표"))
//	            		{
//	            			Element infodetails=doc2.select("div.tab_con div.tripvideo div.cntInfoDetails ul.InfoD-List li span").get(a);
//	            			menu=infodetails.text();
//	            		}
//	            		if(ss.contains("주소"))
//	            		{
//	            			Element infodetails=doc2.select("div.tab_con div.tripvideo div.cntInfoDetails ul.InfoD-List li span").get(a);
//	            			address=infodetails.text();
//	            		}
//	            		if(ss.contains("전화번호"))
//	            		{
//	            			Element infodetails=doc2.select("div.tab_con div.tripvideo div.cntInfoDetails ul.InfoD-List li span").get(a);
//	            			call=infodetails.text();
//	            		}
//	            		if(ss.contains("휴무일"))
//	            		{
//	            			Element infodetails=doc2.select("div.tab_con div.tripvideo div.cntInfoDetails ul.InfoD-List li span").get(a);
//	            			rest=infodetails.text();
//	            		}
//	            		if(ss.contains("홈페이지"))
//	            		{
//	            			Element infodetails=doc2.select("div.tab_con div.tripvideo div.cntInfoDetails ul.InfoD-List li span").get(a);
//	            			home=infodetails.text();
//	            		}
//	            		if(ss.contains("시간"))
//	            		{
//	            			Element infodetails=doc2.select("div.tab_con div.tripvideo div.cntInfoDetails ul.InfoD-List li span").get(a);
//	            			time=infodetails.text();
//	            		}
	            		
	            		
//	            	}

		            
		            
//		            if(infodetails.size()==4)
//		            {
//		            	menu=infodetails.get(0).text();
//			            address=infodetails.get(1).text();
//			            phone=infodetails.get(2).text();
//		            	time=infodetails.get(3).text();
//		            }
//		            else
//		            {
//			            menu=infodetails.get(0).text();
//			            address=infodetails.get(1).text();
//			            phone=infodetails.get(2).text();   
//			            rest=infodetails.get(3).text();
//			            time=infodetails.get(4).text();
//		            }
		            
		            
		            
		            
		            String msg=title+"|"+image+"|"+price+"|"+orgin+"|"+
		            		fac+"|"+detailimage+"\r\n";
//		            String image1=image+"\r\n";
//		            
//
//		            System.out.println(image1);
//		            
		            FileWriter fw=new FileWriter("c:\\java_data\\shopping.txt", true);
		            fw.write(msg);
		            fw.close();
		        }


	        // 차단을 피하기 위해 지연 추가
			        //Thread.sleep(1000); // 1000밀리초 (1초)의 지연
		    }
		} catch (Exception e) {
		    e.printStackTrace();
		}
	}

}

package com.sist.main;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String html="<html>"
					+"<body>"
					+"<div id=aaa>"
					+"<div class=bbb>Hello java1</div>"
					+"<a href=daum.net>"
					+"</a>"
					+"</div>"
					+"<div id=ccc>"
					+"<div class=ddd>Hello java2</div>"
					+"<img src=aaa.png>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>Java</div>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>Oracle</div>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>HTML</div>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>JSP</div>"
					+"</div>"
					+"<div class=kkk>"
					+"<div>Spring</div>"
					+"</div>"
					+"</body>"
					+"</html>";
			Document doc=Jsoup.parse(html,"UTF-8"); // 문자열 =parse , 외부에서 가져올떈 connect
			//System.out.println(doc);
			Element elem=doc.selectFirst("div#aaa div.bbb"); //id는 #, class는 .
			System.out.println(elem.text());
			Element elem2=doc.selectFirst("div#ccc div.ddd");
			System.out.println(elem2.text());	
			Element elem3=doc.selectFirst("div#ccc img");	
			System.out.println(elem3.attr("src"));
					
			Element elem4=doc.selectFirst("div#aaa a"); 
			System.out.println(elem4.attr("href"));
			
			Elements div=doc.select("div.kkk div");	
			System.out.println(div);
			
			for(int i=0;i<div.size();i++)
			{
				System.out.println(div.get(i).text());
			}
					
		}
		catch(Exception e)
		{
			
		}
	}

}

package com.sist.main;
import java.io.FileWriter;

/*
 * https://www.melon.com/musicstory/index.htm?mstoryCateSeq=#params%5BmstoryCateSeq%5D=&po=pageObj&startIndex=1
 * https://www.melon.com/musicstory/index.htm?mstoryCateSeq=#params%5BmstoryCateSeq%5D=&po=pageObj&startIndex=11
 */
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
public class MainClass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//int page=1;
			//String link="https://www.melon.com/musicstory/index.htm?mstoryCateSeq=#params%5BmstoryCateSeq%5D=&po=pageObj&startIndex="+page;
			
			Document doc=Jsoup.connect("https://www.melon.com/musicstory/index.htm?mstoryCateSeq=#params%5BmstoryCateSeq%5D=&po=pageObj&startIndex=1").get();
			Elements title=doc.select("div.wrap_musicspecl p.image a");
			Elements sumry=doc.select("div.wrap_musicspecl dd.sumry a");
			Elements image=doc.select("div.wrap_musicspecl p.image img");

			for(int i=0;i<title.size();i++)
			{
				
				//Document doc2=Jsoup.connect(link).get();
				System.out.println(title.get(i).attr("title").substring(0,title.get(i).attr("title").lastIndexOf(" - 페이지 이동")));
				System.out.println(sumry.get(i).text());
				System.out.println(image.get(i).attr("src"));
				
				
				String msg=(i+1)+"|"
						+title.get(i).attr("title").substring(0,title.get(i).attr("title").lastIndexOf(" - 페이지 이동"))
						+"|"+sumry.get(i).text()+"|"
						+image.get(i).attr("src")+"\r\n";
				
				
				
				FileWriter fw=new FileWriter("c:\\java_data\\magazine.txt",true);
				fw.write(msg);
				fw.close();
				
				
			}
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

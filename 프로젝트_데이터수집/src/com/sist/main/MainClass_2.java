package com.sist.main;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document doc=Jsoup.connect("https://www.visitbusan.net/index.do?menuCd=DOM_000000201002002001&uc_seq=1635&lang_cd=ko&pagingParms=4ca15f3a76a21f554a6e515f5344f50c4f734814d27260977c0eb574b1e0019a33f5a8e2dd587a9efb82cc91cf112987488312a3bc08c3054da8c190c930f6592e7894a7ed3cf424cb7c66a05d6b7adf0aa608ee54ad79feb8b43e0becf2aedf306446a26175f37928b2e64d297ab48f8acfae3743ce2794ef15d99eb793341329c53a76d24a81ef72a11ca917970aac34400ec0365d93e364d7a859d58178e212648c28901350cb20330ec09b4e8c7ee5e2b8287a2a6536a889e832bf7d31f811c87cdb08416c849549c03d819d80910260c2b78673663eac8b626a1b97303c7b760b3ab7fed91b4167fa9a69a41d6fefe24999cfdc85bb85247989a7b565c188b966678b37848e0d88865602a9ecd47a7ddf1406d80269895b9386fc9d120b54685de106a97902903443d95c862c942229fcd269f25ecae09cba47d7fa5b4ca79471889a1020e6226a199377b97ead69d777bcce27c101be7225c1ffeb0036367494277c22e6ec9cff0114e7cadf3a2d867367262d1b5f6a717ace24b4cae0734d3410c3de7cbbe8e8e2de4a08c9f7f2d71419b760deedc85bfd092d20cf83296e62049d974032c50fee7f8aa0e20719104acb04653baae653f6241ef307d9e996ca01c0f8bd82276525403ef8fbcf31d4983f32b1f9177a3efeb477fea6497dae5a33a304e09aaa71e04f0eb3f5d4c28002d6d0e6f2e344b096c13571485e713162dc5a9af3b561377692e22316b61b1ee1170df4e01c4f1d1a0495e864cc323e5570524f4f388deac0573d370a31e245c82131817bfc280919ef34d987bc76bc5524758342f66ad0806eaf0d7ef56640d59a044de449fb7b5435323a73b6d18a05069ba9c39946fff7103292e562fd41744eb3ebfbd8").get();
			Elements title=doc.select("div.store_info tr.m_only table_row tr th h3");
			Elements poster=doc.select("div.PolicyList_PolicyList__YWI1Z section.PolicyList_PolicyList__policyText__NjQzZ p.PolicyContent_PolicyContent__noticeContent__ODA0Z");
			Elements rr=doc.select("div.PolicyList_PolicyList__YWI1Z section.PolicyList_PolicyList__policyText__NjQzZ");
//			Elements grade=doc.select("div.section_ranking span.txt_tag span");
//			Elements score=doc.select("div.section_ranking span.txt_grade");
//			Elements rev=doc.select("div.section_ranking span.info_txt span.txt_num");
			for(int i=0;i<title.size();i++)
			{
				System.out.println(title.get(i).text());
//				System.out.println(rr.get(i).text());
//				System.out.println(grade.get(i).text());
//				System.out.println(score.get(i).text());
//				System.out.println(rev.get(i).text());
//				System.out.println(title.get(i).attr("href"));
			}
//			for(int i=0;i<poster.size();i++)
//			{
//				System.out.println(poster.get(i).text());
//			}
			
			
			
			
		}catch(Exception e)
		{
			
		}
	}

}

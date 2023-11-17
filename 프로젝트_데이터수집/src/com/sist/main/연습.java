package com.sist.main;

import java.io.FileWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 연습 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	      try
	      {
	            for(int i=1;i<35;i++)
	            {
	        	   String url="https://www.visitbusan.net/index.do?uc_seqs=&ucMtmUcSeq=&ucMtmItemUcSeq=&file_name=&gugun_nm=&cate2_nm=&ucc1_seq=17&cate1_nm=&ucdpp_seqs=&uct_seqs=&ucum_seqs=&ucl_seq=7&ucl_use_yn=Y&exclude_uc_seq=&place=&title=&subtitl=&hash_tag=&middle_size_rm2=&menuCd=DOM_000000201002000000&list_type=TYPE_SMALL_CARD&order_type=NEW&listCntPerPage2=8&ucum_seq=&ub_seq=&distance=0.0&cate2_month=&favoriteThis=N&myFavoriteUserId=&sel_visit_place=N&user_id=&search_keyword=&num_room=&ulg_seq=&ucc1_use_yn=&ucc2_seq=&ucg_seq=&ucogl_seq=&main_img_ucmf_seq=&main_title=&charger_positn=&charger_nm=&charger_tel=&tripadvisor_id=&lat=&lng=&bundle_cntnts_yn=&use_yn=Y&sort_num=&page_no="+i;
	               Document doc=
	        			Jsoup.connect(url).get();
	        	   //Elements link=doc.select("div.hot_item_list2 div.hot-item2 div.info p.tit a");
	               Elements link=doc.select("div.hot_item_list2 div.hot-item2 div.box a"); //상세보기 페이지 링크 (한페이지당 8개)
	        	   System.out.println(link.size());
	               for(int j=0;j<link.size();j++)
	        	   {
	        	     try
	        	     {
	        		   //System.out.println(link.get(i).attr("href"));
	        		   String subLink="https://www.visitbusan.net"+link.get(j).attr("href");
	        		   System.out.println(subLink);
	        		   Document doc2=
	        			Jsoup.connect(subLink).get();
	        		   Elements title=doc2.select("section#title div.innerwrap h4.tit");
	        		   Elements image=doc.select("div.hot_item_list2 div.hot-item2 div.box a img");
	        		   String titleString=title.get(j).text();
	        		   String imagesString="https://www.visitbusan.net"+image.get(j).attr("src").substring(0, image.get(j).attr("src").lastIndexOf("thumbL"))+"ttiel";
	        		   System.out.println(titleString);
	        		   System.out.println(imagesString);

	        		
	        	     }catch (Exception e) {}

				    }
	               System.out.println();
	               Thread.sleep(1000);
	             }
	        }catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
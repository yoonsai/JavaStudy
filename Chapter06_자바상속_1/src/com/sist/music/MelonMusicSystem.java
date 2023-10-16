package com.sist.music;

import org.jsoup.select.Elements;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;

public class MelonMusicSystem extends GenieMusicSystem {
	
	protected String title="멜론 Top50";
	{
		try {
			
			
			 Document doc=Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			 Elements title=doc.select("div.wrap_song_info div.rank01");
		   	 //가수명
		   	 Elements singer=doc.select("div.wrap_song_info div.rank02");
		   	 //앨범
		   	 Elements album=doc.select("div.wrap_song_info div.rank03");
		   	 
		   	 for(int i=0;i<50;i++)
		   	 {
		   		 musics[i]=new Music();
		   		 musics[i].setMno(i+1);
		   		 musics[i].setTitle(title.get(i).text());
		   		 musics[i].setSinger(singer.get(i).text());
		   		 musics[i].setAlbum(album.get(i).text());
		   		 
		   	 }
			}catch(Exception ex) {
				
			}
	}
	
}

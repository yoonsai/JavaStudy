import java.text.DecimalFormat;

class movie{
	int movie_no;
	String poster;
	String nameKr, nameEn;
	String genre;
	String nation;
	String grade;
	String time;
	String title;
	String story;
	double score;
	int boxoffice;
	int startDay;
}
class movieNews{
	int movieNews_no;
	String image;
	String title;
	String contents;
	String day;
	String news;
}
class category{
	int category_no;
	String image;
	String title;
	String subject;
}
class foodDetail{
	int foodDetail_no;
	String title;
	double grade;
	String address;
	String call;
	String type;
	String price;
	String time;
	String menu;
}
class food{
	int music_no;
	String video;
	String title;
	String chef;
	int grade;
	int user;
	int hit;
}
class music{
	int music_no;
	int rank;
	String state; // 유지(-), 상승(▲), 하강(▼)
	int increment;
	String image;
	String title;
	String singer;
	String album;
	int like;
}
class sale{
	int goods_no;
	String discount;
	String goods_image;
	String goods_name;
	int goods_price;
}
class drama{
	int drama_no;
	String drama_poster;
	String drama_title ;
	String drama_genre;
	String drama_date;
	String drama_place;
	String drama_artist;
	String drama_grade;
	String drama_time;
}
public class MainClass5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int like=323457;
		DecimalFormat df=new DecimalFormat("###,###");
		System.out.println("♡ "+df.format(like));
	}

}

import java.util.*;
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		String actor="하정우,임시완,배성우,김상호";
		String[] movie=actor.split(",");
		System.out.println(movie[0]);
		System.out.println(movie[1]);
		System.out.println(movie[2]);
		System.out.println(movie[3]);*/
		
		
		/*String actor="하정우|임시완|배성우|김상호";
		String[] movie=actor.split("\\|");
		System.out.println(Arrays.toString(movie));
		System.out.println(movie[0]);*/
		
		String name="         Hello Java ";
		System.out.println(name.trim()); // 좌우 공백제거 , 입력시 사용
		
		//replace => 원하는 문자를 변경
		String s="Hello Java";
		System.out.println(s.replace('a', 'b'));
		System.out.println(s.replace("Java", "Oracle"));
		System.out.println(s);
		
		String msg="나라가 독립을 했으면 당연히 우리 기록도 독립이 되어야지!";
		if(msg.length()>20)
		{
			msg=msg.substring(0,20)+"...";
			//msg=msg.substring(0,20).concat("...");
			
		}
		System.out.println(msg);
		
	}

}

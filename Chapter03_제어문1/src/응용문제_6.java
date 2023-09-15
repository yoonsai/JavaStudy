
public class 응용문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		char c=' ';
		int a=(int)(Math.random()*2);
		if(a==0) {
			c=(char)((Math.random()*26)+65);
		    System.out.println(c+"는 대문자입니다.");
		}
		if(a!=0) {
			c=(char)((Math.random()*26)+97);
		    System.out.println(c+"는 소문자입니다.");
		}
		
	}

}

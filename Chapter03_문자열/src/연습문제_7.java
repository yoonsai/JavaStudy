
public class 연습문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		while(true)
		{
			int a=(int)(Math.random()*6)+1;
			int b=(int)(Math.random()*6)+1;
			System.out.println("["+a+","+b+"]");
			count++;
			if(a==b)
				break;
		}
		System.out.println("반복횟수:"+count);
	}

}

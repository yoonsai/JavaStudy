// 100개의 알파벳 난수 발생 ==> 'A
public class H_제어문_반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		
		for(int i=1;i<=100;i++)
		{
			char d=(char)((Math.random()*26)+65);
			System.out.print(d+" ");
			if(d=='A')
				a++;
			else if(d=='B')
				b++;
			else if(d=='C')
				c++;
		}
		System.out.println("\n=============결과값===============");
		System.out.println("A의 갯수:"+a);
		System.out.println("B의 갯수:"+b);
		System.out.println("C의 갯수:"+c);
	}

}

// 5개의 난수발생 => 최대값
public class 제어문_반복문사용이유 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(Math.random()*100)+1;
		int b=(int)(Math.random()*100)+1;
		int c=(int)(Math.random()*100)+1;
		int d=(int)(Math.random()*100)+1;
		int e=(int)(Math.random()*100)+1;
		int max=1;
		if(max<a)
			max=a;
		if(max<b)
			max=b;
		if(max<c)
			max=c;
		if(max<d)
			max=d;
		if(max<e)
			max=e;
		System.out.print(a+" ");
		System.out.print(b+" ");
		System.out.print(c+" ");
		System.out.print(d+" ");
		System.out.print(e+" ");
		System.out.println("\n최대값:"+max);
		
	}

}

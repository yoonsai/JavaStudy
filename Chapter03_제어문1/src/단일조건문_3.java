/*
 * 1~100사이의 난수를 3개 발생
 */
public class 단일조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=(int)(Math.random()*100+1);
        int b=(int)(Math.random()*100+1);
        int c=(int)(Math.random()*100+1);
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        int max=a;
        if(max<b)
        	max=b;
        if(max<c)
        	max=c;
        System.out.println("최대값:"+max);
        
        int min=b;
        if(min>a)
        	min=a;
        if(min>c)
        	min=c;
        System.out.println("최소값:"+min);
	}

}

/*
 * 형변환연산자
 * (int)값
 */


public class C_단항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		double d=(double)a; // 생략이 가능
		char c=(char)a;
		// 특수한 경우 생략이 가능 => 실제 값 대입
		//=> 연산처리가 되면 생략할 수 없다
		int i=10;
		int j=55;
		//char c1=i; 변수는 그냥 대입할 수 업슴
		char c1=10; // 실제값은 가능
		System.out.println("a:"+a);
		System.out.println("d:"+d);
		System.out.println("c:"+c);
		c=10000;
		System.out.println("변경된 c1:"+c);
		c=40000;
		System.out.println("변경된 c2:"+c);
		c='0';
		System.out.println("변경된 c3:"+(int)c); //'0'=48, 'a'=97, 'A'=65

		
	}

}

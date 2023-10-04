/*
 *  매개변수 사용법
 */
public class 메소드_2 {
    static void plus(int a,int b)
    {
    	System.out.println("plus() start");
    	System.out.println("사용자 요청값(a):"+a);
    	System.out.println("사용자 요청값(b):"+b);
    	System.out.println("처리 결과값:"+(a+b));
    	System.out.println("plus() end");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plus(10,20);
	}

}

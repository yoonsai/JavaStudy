/*
 * finalize() => 객체가 메모리 해제시에 자동 호출
 * = 소멸자
 *  c언어
 *   = A() / ~A() => 메모리해제
 *    
 */
class A
{
	public A(){
		System.out.println("A객체 생성"+this);
	}
	public void action(){
		System.out.println("A객체 활용");
	}
	//gc는 바로 회수하지 않는다 => 메모리가 크기 때문에
	//메모리 회수시 자동호출
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제..."); //finalize() => 메모리해제시 호출
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.action();
		a=null;
		System.gc(); // 메모리 해제

	}

}

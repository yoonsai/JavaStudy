class Member implements Cloneable
{
	String id;
	String pwd;
	String name;

	public Member() {
		id="admin";
		pwd="1234";
		name="홍길동";
	}
	public void print()
	{
		System.out.println("ID:"+id);
		System.out.println("PWD:"+pwd);
		System.out.println("Name:"+name);
	}
	// clone => 재정의 (오버라이딩)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
/*
 *   Web관련 자바
 *   ----------
 *      J2SE / J2EE
 *      ----   ----
 *       |      | 자바 웹
 *      자바 기본
 *   toString : 객체를 문자열로 변경
 *   clone() : 메모리 복제 => 새로운 메모리 생성
 *   finalize() : 호출이 되면 메모리 해제
 *   ---------- 자동 호출 (확인)
 */
public class MainClass6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Member m=new Member();
		m.print();
		System.out.println(m);
		System.out.println("=================");
		
		
		Member m1=(Member)m.clone();
		m1.id="hong";
		m1.pwd="5678";
		m1.name="심청이";
		m1.print();
		System.out.println(m1);
		System.out.println("=================");
		
		Member m2=(Member)m1.clone();
		// m1에 있는 메모리를 그대로 복사 => 샐운 메모리를 생성
		// ex) 아바타 => 디자인 패턴 (prototype)
		// 스프링에서 prototype을 사용하면 => 새로운 메모리를 생성해달라는 뜻
		m2.id="shim";
		//m2.pwd="5678";
		//m2.name="심청이";
		m2.print();
		System.out.println(m2);
		System.out.println("=================");
	}

}

class Member{ 
	// 우선순위는 명시적 초기화
	int mno;
	String id;
	String pwd;
	String name;
	
//	{
//		mno=3;
//		id="park";
//		pwd="9012";
//		name="심청이";
//		
//		// 파일 읽어서 값 대입
//		// 특별한 경우 아니고선 생성자나 초기화 블록이 안나옴
//	}
//	
	Member() {
		mno=2;
		id="hong";
		pwd="5678";
		name="박문수";
	}
	Member(int mno,String id,String pwd,String name)
	{
		this.mno=mno;
		this.id=id;
		this.pwd=pwd;
		this.name=name;
	}
}
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1=new Member();
		System.out.println("번호:"+m1.mno);
		System.out.println("ID:"+m1.id);
		System.out.println("PWD:"+m1.pwd);
		System.out.println("이름:"+m1.name);
		System.out.println("=======================");
		
		Member m2=new Member();
		System.out.println("번호:"+m2.mno);
		System.out.println("ID:"+m2.id);
		System.out.println("PWD:"+m2.pwd);
		System.out.println("이름:"+m2.name);
	}

}

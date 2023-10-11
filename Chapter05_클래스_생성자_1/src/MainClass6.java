class B
{
    int a=10;
    // 생성자x, 일반 메소드
	void B() {
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	// 생성자는 리턴형이 없어야함
	B() {
		System.out.println("B클래스의 디폴트 생성자 호출");
	}
	/*
	 * 생성자 => 초기화가 필요하다 (명시적 초기화가 불가능할때)
	 *         제어문 / 파일읽기
	 *      => 시작과 동시에 처리를 해야될때 => 가장 먼저 호출
	 *         --------------
	 *               |
	 *            자동 로그인
	 *            윈도우 화면 설정
	 *            서버 연결
	 *            데이터베이스 연결
	 */
}
public class MainClass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B();
		//new B();
		//new B().a=100; //new가 붙으면 다른 메모리
		B b=new B();
		b.B();
		//b.a=100;
		//new B().a=1000; // 출력할 필요가 없으면 이렇게 코딩하기도함
		//System.out.println(new B().a);
		//System.out.println(b.a);
	}

}


// 52개 저장 => new => 메모리 공간이 다르다 ( 다른 값을 저장할 수 있다)
/*
 *  new Card()
 *  ------------------------
 *    ------type----------
 *    ------Number--------
 *    ------Width---------
 *    -----height---------
 *  ------------------------
 *  * 클래스는 여러개의 데이터를 한개로 묶어서 메모리에 저장후 사용
 *          ------------ 클래스 설계
 *                       --------
 *                       => new를 이용해서 메모리에 저장
 *  * 주소에 대한 개념이 거의 없다
 *    --- & --- * (자바에는 없다)
 *    클래스 / 배열 (주소를 가지고 있다)
 *  * 상속 => super/this
 *  * 한개, 한명에 대한 정보를 설계
 *    사원 10명 => 1개만 제작 => 메모리 공간을 10개
 *  -----------------------------------------
 *     사용자 정의 데이터형
 *     --------------
 *     메소드를 묶음 (액션 클래스)
 *     --------------------
 *      데이터형 + 메소드 혼합
 *      ---------------- 거의 없다
 *  -----------------------------------------
 *                  |
 *               재사용이 가능, 데이터를 보호, 수정, 추가
 *  ** 클래스는 단순화 작업 => 시물레이션
 *           -------- 추상화 => 공통적으로 가지고 있는 특성
 *     예) 
 *         시계
 *         = 시침
 *         = 분침
 *         = 초침
 *         컴퓨터
 *         = 모니터
 *         = 본체
 *         = 키보드
 *         = 마우스
 *         사원
 *         = 사번
 *         = 이름
 *         = 부서명
 *         = 직위
 *         = 근무지
 *         = 입사일 
 *         = 연봉
 *     *** 클래스는 일반(기본형) 동일하게 사용
 *         -----  .  ,배열(index)
 *         |
 *         형변환 => 상속(is-a),포함(has-a)
 *         
 *               
 *                         
 */
class Card
{
	String type;
	int Number;
	static int Width,height;
	
	/*Card()
	{
		System.out.println("메모리 생성 완료");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("메모리 해제");
	}*/
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1=new Card();
		card1.type="♥";
		card1.Number=1;
		card1.Width=150;
		card1.height=200;
		
		Card card2=new Card();
		card2.type="♠";
		card2.Number=2;
		card2.Width=450;
		card2.height=200;
		
	    System.out.println("card1.type="+card1.type);
	    System.out.println("card1.Number="+card1.Number);
	    System.out.println("card1.Width="+card1.Width);
	    System.out.println("card1.height="+card1.height);
	    System.out.println("===============================");
	    System.out.println("card2.type="+card2.type);
	    System.out.println("card2.Number="+card2.Number);
	    System.out.println("card2.Width="+card2.Width);
	    System.out.println("card2.height="+card2.height);
	    //변경
	    card1.Width=250;
	    card1.height=300;
	    /*card2.Width=250;
	    card2.height=300;*/
	    System.out.println("===============================");
	    System.out.println("card1.type="+card1.type);
	    System.out.println("card1.Number="+card1.Number);
	    System.out.println("card1.Width="+card1.Width);
	    System.out.println("card1.height="+card1.height);
	    System.out.println("===============================");
	    System.out.println("card2.type="+card2.type);
	    System.out.println("card2.Number="+card2.Number);
	    System.out.println("card2.Width="+card2.Width);
	    System.out.println("card2.height="+card2.height);
	    
	    /*card1=null;
	    card2=null;
	    
	    System.gc();*/
	    
	}

}

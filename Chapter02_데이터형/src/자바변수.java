/*  25page 관리할 데이터를 저장하는 공간을 변수
 * ------------------------------------- 한개만 저장가능
 *  변수 : 변수명 => 소문자로 시작한다
 *        식별자 ( 명명규칙 )
 *        1. 알파벳이나 한글로 시작한다
 *           ----- 대소문자 구분
 *           Abc abc ABC 다 다른거임
 *        2. 명칭의 개수는 제한하지 않는다
 *           => 3~7글자로 압축
 *           a,b,c / kor, math, eng (의미를 알아볼 수 있도록)  
 *           
 *        3. 숫자는 가능하지만 맨앞은 사용 불가능
 *        4. 특수문자 -> $,_ 2개만 가능
 *        _는 많이 사용
 *        _name, _count => 임시변수
 *        5. 변수명에는 공백을 줄 수 없음
 *        6. 키워드 사용할 수 없음 => 자바에서 사용하는 단어(보라색글씨)
 *        
 *  변수 사용
 *  1) 선언
 *     데이터형 변수명;
 *     -------------
 *     int a;  => 4byte 메모리 공간을 만들고 이름을 a로 부여한다
 *  2) 초기값 부여
 *     a = 100; => a라는 공간에 100을 저장
 *  --------------------------------------------------------int a=100; 동시에 하는게 사용빈도가 더 많음
 *  3) 값 읽기 / 값 변경
 *  ------------------- 읽기(값을 가지고 온다)/쓰기(저장)-----삭제는 불가능
 *  
 *  
 *  데이터타입 변수명 = 리터럴;
 *  리터럴 = 실제 값
 *  프로그램 개발 = 가독성 -> 리팩토링을 해줌, 퍼포먼트(속도)
 *  
 *  데이터타입이 리터럴보다 크거나 같아야함
 *  
 *   byte < char < int < long < float <double
 *          short
 *          =======> 메모리 크기(x) => 수표현 개수
 *          
 *  double이 제일 크니까 모든 값을 받을 수 있음 (불린뺴고)
 *  
 */
public class 자바변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("dddddf");
        byte _byte=127;
        int _int=20000;
        long _long=20000; // 20000L로 저장됨
        float _float=10.5f;
        double _double=100; //100.0 int형으로 입력했지만 앞의 데이터형으로 변경해서 저장 => 자동 형변환
        char _char=65; // 실제저장 A
        boolean _boolean=true;
        
        System.out.println("_byte : " + _byte);
        System.out.println("_int : " + _int);
        System.out.println("_long : " + _long);
        System.out.println("_float : " + _float);
        System.out.println("_double : " + _double);
        System.out.println("_char : " + _char);
        System.out.println("_boolean : " + _boolean);
        
        
	}

}

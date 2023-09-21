/*
 * 문자열 
 * ----- string 기능이 많다
 * 1. 문자의 갯수 확인
 * 2. 검색
 *    ----
 *    startWith : 시작하는 문자열이 같은 경우
 *    endWith : 끝나는 문자열이 동일 => cookie
 *    ****contains : 포함된 문자가 있는지
 *    ------------- 추천
 *    ****equals : 같은 값==> id,password
 *       -------- 대소문자 구분
 * 3. 문자열 제어
 *    = 변경 : replace(), replaceAll()
 *            replace('a','b')
 *            replaceAll("[가-힣]","") => 한글전체를 공백으로 바꿔라
 *            replaceAll("[0-9a-Za-z]","")
 *            String s="Hello Java"
 *                      0123456789
  *   = 문자 자르기 : substring(1) => ello Java
  *                substring(4,7) => o J
  *                          ---- 4~6번까지 문자를 가져와라 (7번짼 제외 => 4번부터 7번전까지)
  *   = 대문자 : toUpperCase
  *   = 소문자 : toLowerCase
  * 
  * 4. 모든 데이터형을 문자열로 변경
  *   = valueOf(1) => "1" ==> 윈도우, 웹 => 
  * 5. 분리 : split() => string[]
  *    charAt(index)
  *    "Hello Java" => CharAt(0) => 'H'
  *    **index번호가 자바는 무조건 0부터 시작(오라클은 1번)
  *    
  *   String => 일반형 => 
  *   --------------------Call By Value / Call By Reference
  *                             |          => 배열/클래스
  *                           string
  *   형식)  String s="";
  *        String s=new String("")
  *        
  *                
 */
public class 문자열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello java!!";
		System.out.println(s.length()); // 문자 갯수 => 공백 포함
		if(s.startsWith("hello")) //"hello"로 시작하는 문자냐 => 서제스트만들때 많이 쓰임(자동완성)
			System.out.println("포함됨"); 
	}

}

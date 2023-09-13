/*
 * &&(직렬연산자) ||(병렬연산자)
 * AND         OR
 * 
 * 사용처
 * --------------
 * && => 기간이나 범위안에 포함
 * || => 기간이나 범위가 아닌거
 * ---------------------
 * 사용법
 * ---------------------
 * ==> 조건에 사용할 수 있는 연산자는 부정연산자, 비교연산자
 * (조건) && (조건)  (조건) || (조건)
 * -----   ----   ----     -----
 *   |      |        
 *   --------
 *      | 
 *    결과값
 *    
 * 결과값(&&and)
 * true true  ===> true
 * true false ===> false
 * false false ===> false
 * false true ===> false
 * 
 * 결과값(||or)
 * true true  ===> true
 * true false ===> true
 * false false ===> false
 * false true ===> true
 * 
 * &&와 ||는 효율적인 연산을 수행한다
 * --------------------------
 * && => 앞에가 false면 뒤에는 연산하지 않음
 * || => 앞에가 true면 뒤에는 연산하지 않음
 * 
 */
public class I_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

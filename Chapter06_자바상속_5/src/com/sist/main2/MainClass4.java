package com.sist.main2;
class Super
{
	
}
class Sub extends Super
{
	
}
// NullPontException
// => 실제 값이 아닌 null(아무것도 아닌 값)을 가진 객체/변수 등을 호출할 경우 발생
// ClassCastException
// => 하위 유형이 아닌 유형에 대한 참조를 캐스팅하려고 시도했음을 알리는 확인되지 않은 예외
public class MainClass4 {
	static String str; //null
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super ssss;
		Super s=new Sub();
		//Super s1=(Sub)new Super(); => 오류남 메모리할당하면서 데이터형변환을 동시에 할 수 없음 => ClassCastException
		Sub ss=(Sub)s;
		//str.charAt(0); // => 오류남 => NullPontException
		//char c=str.charAt(0); => 오류
		Super sss=new Super();
		//Sub ssss=(Sub)sss; =>오류남
	}

}

// % => 배수찾을때 자주 사용 => 화폐매수 구하기 등
public class B_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=3;
		
		System.out.println(a+"%"+b+"="+(a%b));
		System.out.println(-a+"%"+b+"="+(-a%b));
		System.out.println(a+"%"+-b+"="+(a%-b));
		System.out.println(-a+"%"+-b+"="+(-a%-b));
		
		System.out.println("==========================");
		
		int c=369;
		// 백단위 : 3, 십단위 : 6, 일단위 :9
		System.out.println("백단위:"+(c/100));
		System.out.println("십단위:"+(c%100)/10);
		System.out.println("일단위:"+(c%10));
		
		//"합계:"+90+90+90 => "합계:90"+90+90 => "합계:909090"
		//"합계:"+(90+90+90)=> 합계:270
	}

}


public class 자바데이터형변경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // int _int=100.0; -> 오류남
		int _int=(int)100.0; // 작은 데이터형에 넣을려면 (int)이런식으로 강제 형변환을 해줘야함
		System.out.println(_int);
		
		byte _byte=(byte)300;
		System.out.println(_byte); // 44출력  8비트는 뒤에서 8자리 / 300을 2진법으로 100101100 -> 뒤에서 8자리 00101100 = 44
		System.out.println(0b00101100); // 앞에 0b 붙이면 10진법으로 바꿔서 보여줌
	}

}

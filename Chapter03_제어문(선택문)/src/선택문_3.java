/*
 * 12,1,2=> 겨울 / 3,4,5 => 봄 / 6,7,8 => 여름 / 9,10,11  => 가을
 */
public class 선택문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)((Math.random()*12)+1);
		
		System.out.println(a+"월");
		
		
		switch(a)
		{
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
		case 3: case 4: case 5:
			System.out.println("봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
		default:
			System.out.println("가을입니다.");
			break;
		}
		
		
	}

}

/*
 * charAt
 * 대문자 소문자로 변경
 */
public class 문자열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
//		for(int i=0;i<s.length();i++)
//		{
//			char c=s.charAt(i);
//			System.out.println((char)(c-32));
//		}
		
		System.out.println(s.toUpperCase());
		
		s="ABCDEF";
//		for(int i=0;i<s.length();i++)
//			{
//				char c=s.charAt(i);
//				System.out.println((char)(c+32));
//			}
		System.out.println(s.toLowerCase());
	}

}

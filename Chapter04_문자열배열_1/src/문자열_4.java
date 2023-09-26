/*
 * subString() => 문자를 자른다
 * 
 * "Hello Java"
 *  0123456789
 *  
 *  subString(6) => 6번부터 잘라와라 => Java
 *  subString(0,5) => 0번부터 4번까지 => Hello
 */
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address="서울특별시 강남구 도산대로51길 36 지번 서울시 강남구 신사동 655";
		String a2=address.substring(0,20);
		System.out.println(a2);
//		String s1=s.substring(0,5);
//		String s2=s.substring(6);
//		System.out.println(s1);
//		System.out.println(s2);

		String addr=address.substring(0,address.indexOf("지번"));
		System.out.println(addr);
		String addr2=address.substring(address.indexOf("지번")+3);
		System.out.println(addr2);
		int a=address.lastIndexOf(" ");
		String addr3=address.substring(a-3,a);
		System.out.println(addr3);
		String ext="Hello Java.java";
		String s=ext.substring(ext.lastIndexOf(".")+1);
		System.out.println(s);
		
	}

}

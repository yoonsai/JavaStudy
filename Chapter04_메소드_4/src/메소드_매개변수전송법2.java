
public class 메소드_매개변수전송법2 {
	static void swap(int a) // 복사본
	{
		a=100;
	}
	static void swap2(int[] arr)
	{
		System.out.println("arr="+arr);
		arr[0]=100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10; //원본 => call by value (값만 전달)
		swap(b);
		System.out.println("b="+b);
		/*
		 * int b=10;
		 * int a=b;
		 * a=100;
		 */
		int[] kkk= {1,2,3};
		System.out.println("kkk="+kkk); // => call by reference (주소값) => 배열이나 클래스만 가능
		swap2(kkk);
		System.out.println("kkk[0]="+kkk[0]);
	}

}

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50};
		//int[] arr2=arr.clone(); // arr 메모리에 있는 모든 내용을 copy해서 새로운 메모리에 저장
		//깊은 복사(메모리 통째로 복사)
		
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr2));
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		int[] arr2=arr.clone();
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2)); // 새로운 메모리를 만들어서 영향받지 않음
		System.out.println(arr);
		System.out.println(arr2);
		// clone => prototype
		
		
	}

}

/*
 * 중복없는 난수 발생
 * => 예약일, 예약시간....
 * 
 */

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10];
		// 1~10번까지 난수 => 중복이 없어야함
		int su=0; //난수저장
		boolean bcheck=false; // 중복여부 확인
		
		for(int i=0;i<arr.length;i++)
		{
			bcheck=true;
			//---------- 난수 발생
			// bcheck가 true일 경우 난수 중복, 다르면 false-> 종료
			// -> arr에 저장
			while(bcheck) {
				
				//난수 발생
				su=(int)(Math.random()*10)+1;
				bcheck=false; // 종료 조건을 만들어 놓고 
				//비교 => arr에 저장된 값과 난수가 같은지 확인
				for(int j=0;j<i;j++)
				{
					// i => 저장된 갯수
					if(arr[j]==su) // 같은 수가 있는지 확인
					{
						bcheck=true;
						break; // ?
					}
				}
			}
			//----------
			arr[i]=su;
			
		}
		//출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		

	}

}

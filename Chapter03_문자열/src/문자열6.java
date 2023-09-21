import java.util.Scanner;
public class 문자열6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"Java와 Jsp",
				"Java와 Oracle",
				"Java programming",
				"Jquery And AJAX",
				"Spring And Java"
		};
		Scanner scan=new Scanner(System.in);
		System.out.print("검색어 입력:");
		String findData=scan.nextLine();
		//String findData=scan.next(); => 공백앞에서 끊김, 전체 문자를 가져오려면 nextLine()를 써야함
		System.out.println(findData);
		for(int i=0;i<data.length;i++)
		{
			
			if(data[i].contains(findData)) //  글자를 포함하는 것
			//if(data[i].endsWith(findData))
			//if(data[i].startsWith(findData)) //startsWith 앞에 문자가 같은거 가져오기
			{
				try 
				{
					Thread.sleep(100); // 잠깐 멈췄다 출력하기
					
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
		}
	}

}

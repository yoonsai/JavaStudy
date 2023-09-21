// break ==> while,for => system.exit(0)
/*
 * break는 해당하는 while, for문만 종료시킴
 * system.exit(0) => 프로그램 자체를 종료시킴
 * 
 */


public class 제어문_반복제어문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==============break============");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break;
				System.out.println("i="+i+" ,j="+j);
			}
		}
		System.out.println("==============continue============");
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					continue;
				System.out.println("i="+i+" ,j="+j);
			}
		}
		System.out.println("==============이름있는 break============");
		aaa:for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==2)
					break aaa;
				System.out.println("i="+i+" ,j="+j);
			}
		}
	}

}

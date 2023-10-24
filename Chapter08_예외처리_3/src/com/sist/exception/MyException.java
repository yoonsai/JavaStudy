package com.sist.exception;

public class MyException extends Exception{
	public MyException(String msg)
	{
		super(msg);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=21;
			// catch안에서 인식하는 예외클래스는 라이브러리로 만들어진 예외만 인식 => 직접호출해야 사용이 가능
			// ==> 호출 : throw new 생성자("관련메시지")
			if(a%3==0)
			{
				throw new MyException(a+"는(은) 3의 배수를 사용할 수 없습니다.");
			}
		}catch(MyException m)
		{
			System.out.println(m.getMessage());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

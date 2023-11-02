package com.sist.exam;
/*
 *  Thread : 한개의 프로그램에서 여러개의 기능을 동시에 수행
 *  -------- 실시간 변경(증권,은행) => Ajax
 *  1) 생성
 *     new Thread()
 *     => 이름부여(Thread-0)
 *     => 이름을 읽기 => getName()
 *       => 이름 변경 => setName()
 *     => 우선순위 (1~10) => 10번이 가장 높은 순위
 *       => 작업이 가장 빠르다
 *       1. MIN-PRIORITY : GC ===> 1
 *       2. NORM-PRIORITY : 사용자 정의 ==> 5
 *       3. MAX-PRIORITY : main() ==> 10
 *  2) start() => 대기
 *  3) run() => Running
 *  4) sleep() => wait
 *  5) interrupt() => dead
 */
class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		  System.out.println(Thread.currentThread()+":"+i);
		  try {
			  Thread.sleep(1000);
		  }catch(Exception e)
		  {
			  
		  }
		}
	}
}
public class MainClass_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread());
		MyThread1 t1=new MyThread1();
		MyThread1 t2=new MyThread1();
		MyThread1 t3=new MyThread1();
		MyThread1 t4=new MyThread1();
		MyThread1 t5=new MyThread1();
		
		t1.setName("홍길동");
		t2.setName("박문수");
		t3.setName("이순신");
		t4.setName("강감찬");
		t5.setName("심청이");
		
		t1.setPriority(10);
		t2.setPriority(2);
		t3.setPriority(3);
		t4.setPriority(4);
		t5.setPriority(5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	}

}

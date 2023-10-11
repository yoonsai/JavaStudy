/*
 *  => 자바 기본 문법
 *     ----------
 *     데이터형 (메모리 크기)
 *       기본형
 *       참조형 => 클래스 / 배열
 *     클래스
 *       = 데이터만 모아서 관리 => 변수
 *         --------------
 *         => 초기화
 *            = 명시적 초기화
 *            = 초기화 블록
 *            = 새성자 =====> 가장 많이 사용
 *       = 메소드만 모아서 관리
 *       1) 클래스의 구성
 *          class ClassName
 *          {   
 *              --------------
 *              데이터 저장 공간 : 멤버변수 => 프로그램 종료시까지 유지
 *                             => 다른 클래스에서도 사용이 가능
 *              인스턴스변수 => new를 이용해서 
 *                 데이터형 변수명;
 *              공유변수 => 컴파일러에 의해 자동 생성
 *                          => 메모리 공간을 1개만 사용
 *                 static 데이터형 변수명;
 *              -----------   
 *               생성자 =>  변수에 대한 초기화
 *                        *** 클래스 영역에서는 선언만 가능
 *                       = 특징
 *                         클래스명과 동일
 *                         리턴형이 없다
 *                         여러개를 사용할 수 있다
 *                         -----------------
 *                         같은 이름으로 여러개 사용 => 오버로딩
 *                         ** 오버로딩 : 중복 함수 정의
 *                            => 기술 면접 단골
 *                            => 면접 (자바에 대한 질문)
 *                            => new, add
 *                            => 메소드명이 동일하다
 *                            => 매개변수의 갯수나 데이터형이 다르다
 *                            => 리턴형은 관계없다
 *                         A()
 *                         A(int a,int b) => A(int,int)
 *                         A(String s,double d) => A(String,double)
 *                         ***A(int c,int d) => A(int,int) // 오버로딩이 안된다
 *                         => 실제 메소드에도 적용
 *                         plus(int,int) plus(double,double) ....
 *                         *** void도 리턴형이다
 *               기타
 *                 생성자를 사용하지 않고 초기화하는 방법
 *                 => 인스턴스 블록
 *                    {
 *                      구현 => 변수의 초기화
 *                    }
 *                    ==> 생성자를 더 많이 쓰임
 *                 => 정적 블록
 *                    static ****많이 쓰임 
 *                    { 
 *                      구현 => static에 대한 초기화
 *                    }
 *                예)
 *                   class A
 *                   {
 *                       int[] arr=new int[5];
 *                       
 *                       A() {
 *                        
 *                       }
 *                   }
 *                   A a=new A(); => arr저장
 *                   
 *                   class A
 *                   {
 *                       int[] arr=new int[5];
 *                       
 *                       static 
 *                       {
 *                           초기화 => 자동
 *                       }
 *                   }
 *                   
 *                   A.arr
 *              --------------
 *              멤버메소드
 *                = static 메소드 => 메모리가 한개만 생성
 *                  static 리턴형 메소드(매개변수 목록)
 *                  {
 *                  
 *                  }
 *                = 인스턴스 메소드 => 따로 생성
 *                  리턴형 메소드(매개변수 목록)
 *                  {
 *                  
 *                  }
 *              --------------
 *              class A
 *              {
 *                 int a;
 *                 int b;
 *                 void display(){
 *                 }
 *              }
 *              
 *              A aa=new A();
 *              
 *              --- aa ---
 *                ------
 *                a
 *                ------
 *                b
 *                ------
 *                display()
 *                ------
 *              ----------
 *              
 *              A bb=new A();
  *              --- bb ---
 *                ------
 *                a
 *                ------
 *                b
 *                ------
 *                display()
 *                ------
 *              ----------
 *              
 *              --------------
 */
// 생성자 => 오라클 연동 (데이터가 저장된 장소)
// 윈도우 초기화 => 시작과 레이아웃 처리
// 서버연결, 서버구동
/*
 *   메소드 : 인스턴스 메소드 => new를 이용해 메모리에 저장할떄마다 생성
 *          ----------- 객체 생성마다 => 따로 작동
 *          호출 => 객체명.메소드()
 *                -------------
 *   형식)
 *        리턴형 메소드명(매개변수목록) => 선언부
 *        {
 *           구현부
 *        }
 *        
 *        리턴형 => 요청에 대한 결과값 (1개만 사용이 가능)
 *                => 여러개인 경우 : 클래스/배열
 *                => 리턴형이 없는 경우 : void
 *         | 기본형, 배열, 클래스
 *        메소드명 => 알파벳이나 한글로 시작한다
 *                 숫자를 사용할 수 있다 (단 앞에 사용 금지)
 *                 키워드는 사용할 수 없다
 *                 ---- 클래스명, 메소드명은 키워드가 아니다
 *                 공백이 있으면 안된다
 *                 특수문자 사용 => (_,$)
 *                 약속) 소문자로 시작한다, 두번쨰 단어의 첫자는 대문자
 *                 *** 소프트웨어 이행
 *                     ----------- 한글에 문제가 생긴다
 *                                 가급적 영문사용 권장
 *                     윈도우 개발 => 서버 리눅스 사용
 *                     Full stack   AWS
 *                     => STS : 11
 *                     => tomcat => 9 => 11
 *                        Spring-boot => 2.7.4 => 3
 *                        javax => 
 *                     -------------------------------
 *        매개변수 : 사용자가 보내준 값
 *                -------------- 여러개 있을 수 있다 (가급적이면 
 *                3개 이상일때는 클래스 / 배열을 이용한다
 *        void 메소드명()
 *        {
 *           --- 구현
 *           return; => 생략이 가능 => 컴파일러가 자동 추가
 *           ----- 메소드 종료 : 원하는 위치에 설정할 수 있다
 *        }
 *        
 *        void 메소드명()
 *        {
 *           if()
 *            return;
 *            // return은 종료점이라 이후에 코드 사용이 불가능
 *            else
 *            return;
 *        }
 *        
 *        ---- 데이터형이 클수도 있다
 *        int 메소드명()
 *        {
 *            return 정수값;
 *                   ------- 일치
 *        }  
 *        
 *                                        
 *        int 메소드명()
 *        {
 *            int[] arr=new int[10];
 *            return arr;
 *        }
 *        
 *        A 메소드명()
 *        {
 *           A a=new A();
 *             -
 *           return a;
 *                  -
 *        }
 *          A a=메소드명()
 *     **** 메소드는 호출시마다 => 처음부터 return이 있는 곳까지 실행 => 호출된 위치로 다시 돌아간다
 *     
 *     예) 
 *        void aaa() 
 *        {
 *           1
 *           2
 *           3 
 *           return;
 *        }
 *     
 *     
 *        void main()
 *        {  
 *           4
 *           5
 *           aaa();
 *           6
 *           7
 *           aaa();
 *           8
 *           9
 *           return;
 *         }
 *         
 *         => 순서 =>  4 5 (1 2 3) 6 7 (1 2 3) 8 9 
 *         반복제거, 재사용, 유지보수가 용이 (소스가 간결)
 *                      ----------------------
 *                          | 구조적인 프로그램
 *         객체지향 프로그램 => 메소드
 *     
 *    프로그램 기획
 *      벤치마킹 / 요구사항 분석
 *      -------------------- 변수/메소드
 *          
 *                                     
 */
import java.util.Arrays;
class User{
	//5개 난수를 받아서 => 정렬하는 프로그램 제작
    int[] arr=new int[5];
	User()
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100);
			
			
		}
		System.out.println("정렬전");
		System.out.println(Arrays.toString(arr));
	}
	void sort() {
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	void print() {
		System.out.println("정렬후");
		System.out.println(Arrays.toString(arr));
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u=new User();
		u.sort();
		u.print();
	}

}

package com.sist.manager;
import java.util.*;
import java.io.*;
import com.sist.vo.*;
public class FoodManager {
	private static ArrayList<FoodCategoryVO> cList=new ArrayList<FoodCategoryVO>();
	private static ArrayList<FoodHouseVO> fList=new ArrayList<FoodHouseVO>();
	/*
	 *                 Throwable
	 *                 ----------
	 *                      |
	 *       --------------------------------
	 *       |                              |
	 *       Error                        Exception 
	 *                                      |
	 *                      ------------------------------------
	 *                      |                                  |
	 *                   CheckedException                UnCheckedException
	 *                   -----------------                -----------------
	 *                컴파일시에 예외처리 했는지 확인              컴파일시에 예외처리 확인 X
	 *                ----------------------             ---------------------
	 *                java.io                             java.lang
	 *                java.net                            java.util
	 *                java.sql                 
	 *     
	 *       목적 : 에러를 사전에 방지
	 *             에러시 정상 수행을 할 수 있게 만든다
	 *                   
	 *
	 * 
	 */
	//초기화 블록 => static 변수가 있는 경우에 주로 사용
	static
	{
//		FileReader fr=null;
//		ObjectOutputStream ois=null;
//		FileOutputStream fis=null;
//		
//		try {
//			//정상수행 문장
//			fr=new FileReader("c:\\java_data\\food_category.txt");
//			String data="";
//			int i=0;
//			while((i=fr.read())!=-1)
//			{
//				data+=(char)i;
//				
//			}
//			fr.close();
//			
//			String[] cates=data.split("\n");
//			for(String s:cates)
//			{
//				//String[] ss=s.split("\\|");
//				StringTokenizer st=new StringTokenizer(s,"|");
//				FoodCategoryVO vo=new FoodCategoryVO();
//				vo.setCno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
//				vo.setTitle(st.nextToken());
//				vo.setSubject(st.nextToken());
//				vo.setPoster(st.nextToken());
//				cList.add(vo);
//				
//			}
//			fis=new FileOutputStream("c:\\java_data\\fc.txt");
//			ois=new ObjectOutputStream(fis);
//			ois.writeObject(cList);
//			
//		}catch(Exception ex)
//		{
//			//에러 확인 후 복구
//			ex.printStackTrace();
//		}
//		finally
//		{
//			//무조건 수행하는 문장 => 파일 닫기, 서버 닫기
//            try {
//				fr.close();
//			}
//			catch(Exception e)
//            {
//				
//            }
//		}
		

		ObjectInputStream ois=null;
		FileInputStream fis=null;
		try {
			
			fis=new FileInputStream("c:\\java_data\\fc.txt");
			ois=new ObjectInputStream(fis);
			cList=(ArrayList<FoodCategoryVO>)ois.readObject();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				fis.close();
				ois.close();
				
			}catch(Exception e)
			{
				
			}
		}
		
		/*FileReader fr=null;
		BufferedReader br=null;
		ObjectInputStream ois=null;
		FileInputStream fis=null;
		StringBuffer sb=new StringBuffer();
        try {
//			fis=new FileInputStream("c:\\java_data\\food_house.txt");
//			br=new BufferedReader(new InputStreamReader(fis));
//			while(true)
//			{
//				String data=br.readLine();
//				data=data.substring(0,data.indexOf("?"));
//				if(data==null) //전체 데이터 읽기 ?
//				{
//					break;
//				}
//				sb.append(data);
//			}
			
			
			fr=new FileReader("c:\\java_data\\food_house.txt");
			String data="";
			int i=0;
			while((i=fr.read())!=-1)
			{
				data+=(char)i;
				
			}
			sb.append(data);
			fr.close();
			
			
//			fis.close();
//			br.close();
			
			String food_data=sb.toString();
			String[] fd=food_data.split("\n");
			for(String s:fd)
			{
				StringTokenizer st=new StringTokenizer(s,"|");
				FoodHouseVO vo=new FoodHouseVO();
				
				//s=s.substring(0,s.indexOf("?"));
				vo.setFno(Integer.parseInt(st.nextToken().replace("\ufeff", "")));
				vo.setCno(Integer.parseInt(st.nextToken()));
				vo.setName(st.nextToken());
				vo.setScore(Double.parseDouble(st.nextToken()));
				vo.setAddress(st.nextToken());
				vo.setPhone(st.nextToken());
				vo.setType(st.nextToken());
				vo.setPrice(st.nextToken());
				vo.setParking(st.nextToken());
				vo.setTime(st.nextToken());
				vo.setMenu(st.nextToken());
				vo.setPoster(st.nextToken());
				fList.add(vo);
			}
			
			//System.out.print(sb.toString());
			FileOutputStream fos=new FileOutputStream("c:\\java_data\\fh.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(fList);
			fos.close();
			oos.close();
		}catch(Exception e)
        {
			e.printStackTrace();
        }finally {
        	try {
        		fr.close();
        	}catch(Exception e)
        	{
        		
        	}
        }*/
		
		
		//FileInputStream fis=null;
		//ObjectInputStream ois=null;
		try {
			fis=new FileInputStream("c:\\java_data\\fh.txt");
			ois=new ObjectInputStream(fis);
			fList=(ArrayList<FoodHouseVO>)ois.readObject();
		}catch(Exception e){
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				ois.close();
			}catch(Exception e)
			{
				
			}
		}
	}
		
		
		
	public static void main(String[] args) {
		FoodManager fm=new FoodManager();
		//System.out.println("저장완료");
		for(FoodHouseVO vo:fList) 
		{
			System.out.println("번호:"+vo.getFno());
			System.out.println("참조번호:"+vo.getCno());
			System.out.println("업체명:"+vo.getName());
			System.out.println("주소:"+vo.getAddress());
			System.out.println("전화:"+vo.getPhone());
			System.out.println("메뉴:"+vo.getMenu());
			System.out.println("===========================");
		}
		
	}
	public ArrayList<FoodCategoryVO> foodCategorydata(int no){
		
		ArrayList<FoodCategoryVO> list=new ArrayList<FoodCategoryVO>();
		
		int start=0;
		int end=0;
		if(no==1)
		{
			start=0;
			end=11;
		}
		else if(no==2)
		{
			start=12;
			end=17;
		}
		else if(no==3)
		{
			start=18;
			end=29;
		}
		for(int i=start;i<=end;i++)
		{
			list.add(cList.get(i));
		}
		
		return list;
		
	}
	public FoodCategoryVO categoryInfodData(String title)
	{
		FoodCategoryVO vo=new FoodCategoryVO();
		for(FoodCategoryVO fvo:cList)
		{
			if(fvo.getTitle().equals(title))
			{
				vo=fvo;
				break;
			}
			
		}
		return vo;
	}
	public ArrayList<FoodHouseVO> foodHouseListData(int cno){
		
		ArrayList<FoodHouseVO> list=new ArrayList<FoodHouseVO>();
		for(FoodHouseVO fvo:fList)
		{
			if(fvo.getCno()==cno)
			{
				list.add(fvo);
			}
		}
		return list;
	}
	public FoodHouseVO foodInfoData(int fno)
	{
		FoodHouseVO vo=new FoodHouseVO();
		for(FoodHouseVO fvo:fList)
		{
			if(fvo.getFno()==fno)
			{
				vo=fvo;
				break;
				
			}
		}
		return vo;
	}
	public ArrayList<FoodHouseVO> foodfindData(String title)
	{
		ArrayList<FoodHouseVO> list=new ArrayList<FoodHouseVO>();
		for(FoodHouseVO fvo:fList)
		{
			if(fvo.getName().contains(title))
			{
				list.add(fvo);
			}
		}
		return list;
	}
	
}

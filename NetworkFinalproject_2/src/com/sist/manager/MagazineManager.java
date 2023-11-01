package com.sist.manager;
import java.util.*;
import java.io.*;
import com.sist.vo.*;
public class MagazineManager {
	private static ArrayList<MagazineVO> mList=new ArrayList<MagazineVO>();
	private static ArrayList<MagazineDetailVO> dList=new ArrayList<MagazineDetailVO>();
	
	static
	{
//		FileReader fr=null;
//		FileOutputStream fos=null;
//		ObjectOutputStream oos=null;
//		
//		
//		try {
//			fr=new FileReader("c:\\java_data\\magazineDetail.txt");
//			int i=0;
//			String data="";
//			while((i=fr.read())!=-1)
//			{
//				data+=(char)i;
//			}
//			fr.close();
//			
//			String[] mag=data.split("\n");
//			for(String s:mag)
//			{
//				StringTokenizer st=new StringTokenizer(s,"|");
//				//MagazineVO mz=new MagazineVO();
//				MagazineDetailVO md=new MagazineDetailVO();
//				md.setNo(Integer.parseInt(st.nextToken()));
//				md.setTitle(st.nextToken());
//				md.setPoster(st.nextToken());
//				md.setSubject(st.nextToken());
//				//mList.add(mz);
//				dList.add(md);
//			}
//			fos=new FileOutputStream("c:\\music_data\\magdet.txt");
//			oos=new ObjectOutputStream(fos);
//			oos.writeObject(dList);
//			
//		}catch(Exception e)
//		{
//			e.printStackTrace();
//			
//		}finally {
//			try {
//				fr.close();
//			}catch(Exception e)
//			{
//			}
//		}
		
		
		
		
		ObjectInputStream ois=null;
		FileInputStream fis=null;
		try {
			
			fis=new FileInputStream("c:\\music_data\\mag.txt");
			ois=new ObjectInputStream(fis);
			mList=(ArrayList<MagazineVO>)ois.readObject();
			
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
		
		try {
			
			fis=new FileInputStream("c:\\music_data\\magdet.txt");
			ois=new ObjectInputStream(fis);
			dList=(ArrayList<MagazineDetailVO>)ois.readObject();
			
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
	}
	public static void main(String[] args) {
		MagazineManager mm=new MagazineManager();
		System.out.println("저장완료");
		for(MagazineDetailVO vo:dList)
		{
				System.out.println(vo.getNo());
				System.out.println(vo.getTitle());
				System.out.println(vo.getPoster());
				System.out.println(vo.getSubject());
				//System.out.println(vo.getSubject());
				System.out.println("================================");
		}
	}
	public int MagazineTotalPage() {
		int total = (int)(Math.ceil(mList.size()/20.0));
		
		return total;
	}
	
	public ArrayList<MagazineVO> MagazineCategoryData(int no){
		ArrayList<MagazineVO> list = new ArrayList<MagazineVO>();
		int end = no*20;
		int start = end-20;
		if(no!=(int)(Math.ceil(mList.size()/20.0))) {
			for(int i =start;i<end;i++) {
				list.add(mList.get(i));
			}
		}
		else {
			start = (no-1)*20;
			end = mList.size();
			for(int i = start;i<end;i++) {
				list.add(mList.get(i));
			}
		}
		return list;
	}
}
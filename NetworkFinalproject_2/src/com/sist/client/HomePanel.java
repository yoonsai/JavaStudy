package com.sist.client;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

import com.sist.manager.FoodManager;
import com.sist.manager.MusicManager;
import com.sist.vo.*;
public class HomePanel extends JPanel implements ActionListener{
   JButton b1,b2,b3,b4,b5;
   JLabel pageLa;
   PosterCard[] pcs=new PosterCard[9];
   MusicManager fm=new MusicManager();
   JPanel pan=new JPanel();
   public HomePanel()
   {
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(1,3,20,20));
	   add(p);
//	   b1=new JButton("믿고 보는 맛집 리스트");
//	   b1.setPreferredSize(new Dimension(300,35));
//	   b2=new JButton("지역별 인기 맛집");
//	   b2.setPreferredSize(new Dimension(300,35));
//	   b3=new JButton("메뉴별 인기 맛집");
//	   b3.setPreferredSize(new Dimension(300,35));
//	   p.add(b1);p.add(b2);p.add(b3);
	   pan.setLayout(new GridLayout(4,3,5,5)); // 한줄에 3개씩 = 4개 , 간격 5
	   //pan.setBackground(Color.black);
	   b4=new JButton("이전");
   	   b5=new JButton("다음");
   	   pageLa=new JLabel("1 page / 1 pages");
   	
   	   JPanel p1=new JPanel();
   	   p1.add(b4);
       p1.add(pageLa);
   	   p1.add(b5);
   	
   	   p1.setBounds(400, 770, 710, 35);
   	   add(p1);
   	   
   	   
   	
   	
	   // 배치
	   setLayout(new BorderLayout());
	   add("North",p);
	   add("South",p1);
	   add("Center",pan);
	   
	   //b1.addActionListener(this);
	   b4.addActionListener(this);
	   b5.addActionListener(this);
	   
   }
   public void cardPrint(ArrayList<MagazineVO> list)
   {
//	   int i=0;
//	   for(FoodCategoryVO vo:list)
//	   {
//		   pcs[i]=new PosterCard(vo);
//		   if(list.size()==6)
//		   {
//			   FoodCategoryVO fvo=new FoodCategoryVO();
//			   fvo.setPoster("c:\\javaDev\\def.png");
//			   for(int j=6;j<12;j++)
//			   {
//				   pcs[j]=new PosterCard(fvo);
//			   }
//		   }
//		   pan.add(pcs[i]);
//		   i++;
//	   }
	   
	   int i=0;
	   for(MagazineVO vo:list)
	   {
		   pcs[i]=new PosterCard(vo);
		   pan.add(pcs[i]);
		   System.out.println(vo.getTitle());
		   i++;
	   }
   }
   public void cardInit(ArrayList<MagazineVO> list)
   {
	   for(int i=0;i<list.size();i++)
	   {
		   pcs[i].poLa.setIcon(null);
		   pcs[i].tLa.setText("");
		   
	   }
	   
	   pan.removeAll(); // pan에있는 데이터 제거
	   pan.validate(); // panel 재배치ㅣ
   }
   @Override
   public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	   if(e.getSource()==b1)
	   {
		   ArrayList<MagazineVO> list=fm.MagazineCategoryData(1);
		   cardInit(list);
		   cardPrint(list);
	   }else if(e.getSource()==b2)
	   {
		   ArrayList<MagazineVO> list=fm.MagazineCategoryData(2);
		   
		   MagazineVO fvo=new MagazineVO();
		   fvo.setImage(null);
		   fvo.setTitle("");
		   for(int j=0;j<6;j++)
		   {
			   list.add(fvo);
		   }
		   
		   
		   cardInit(list);
		   cardPrint(list);
	   }
	   else if(e.getSource()==b3)
	   {
		   ArrayList<MagazineVO> list=fm.MagazineCategoryData(3);
		   cardInit(list);
		   cardPrint(list);
	   }
	
   }
}
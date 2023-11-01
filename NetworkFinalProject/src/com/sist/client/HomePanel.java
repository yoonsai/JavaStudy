package com.sist.client;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

import com.sist.manager.FoodManager;
import com.sist.vo.FoodCategoryVO;
import com.sist.vo.FoodHouseVO;
public class HomePanel extends JPanel implements ActionListener,MouseListener{
   JButton b1,b2,b3;
   PosterCard[] pcs=new PosterCard[12];
   FoodManager fm=new FoodManager();
   JPanel pan=new JPanel();
   ControlPanel cp;
   public HomePanel(ControlPanel cp)
   {
	   this.cp=cp;
	   JPanel p=new JPanel();
	   p.setLayout(new GridLayout(1,3,20,20));
	   b1=new JButton("믿고 보는 맛집 리스트");
	   b1.setPreferredSize(new Dimension(300,35));
	   b2=new JButton("지역별 인기 맛집");
	   b2.setPreferredSize(new Dimension(300,35));
	   b3=new JButton("메뉴별 인기 맛집");
	   b3.setPreferredSize(new Dimension(300,35));
	   p.add(b1);p.add(b2);p.add(b3);
	   pan.setLayout(new GridLayout(4,3,5,5)); // 한줄에 3개씩 = 4개 , 간격 5
	   //pan.setBackground(Color.black);
	    
	   
	   // 배치
	   setLayout(new BorderLayout());
	   add("North",p);
	   add("Center",pan);
	   
	   b1.addActionListener(this);
	   b2.addActionListener(this);
	   b3.addActionListener(this);
	   
//	   for(int i=0;i<pcs.length;i++)
//	   {
//		   if(pcs[i]!=null)
//		   {
//			   pcs[i].addMouseListener(this);
//		   }
//	   }
   }
   public void cardPrint(ArrayList<FoodCategoryVO> list)
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
	   for(FoodCategoryVO vo:list)
	   {
		   pcs[i]=new PosterCard(vo);
		   pan.add(pcs[i]);
		   pcs[i].addMouseListener(this);
		   i++;
	   }
   }
   public void cardInit(ArrayList<FoodCategoryVO> list)
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
		   ArrayList<FoodCategoryVO> list=fm.foodCategorydata(1);
		   cardInit(list);
		   cardPrint(list);
	   }else if(e.getSource()==b2)
	   {
		   ArrayList<FoodCategoryVO> list=fm.foodCategorydata(2);
		   
		   FoodCategoryVO fvo=new FoodCategoryVO();
		   fvo.setPoster(null);
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
		   ArrayList<FoodCategoryVO> list=fm.foodCategorydata(3);
		   cardInit(list);
		   cardPrint(list);
	   }
	
   }
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	for(int i=0;i<pcs.length;i++)
	{
		if(e.getSource()==pcs[i])
		{
			if(e.getClickCount()==2)
			{
				String title=pcs[i].tLa.getText();
				FoodCategoryVO vo=fm.categoryInfodData(title);
				cp.fcp.la1.setText(vo.getTitle());
				cp.fcp.la2.setText(vo.getSubject());
				ArrayList<FoodHouseVO> list=fm.foodHouseListData(vo.getCno());
				cp.fcp.foodPrint(list);
				cp.card.show(cp, "catefood");
				
			}
		}
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
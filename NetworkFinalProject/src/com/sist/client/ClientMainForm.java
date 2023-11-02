package com.sist.client;
import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.FoodManager;
import com.sist.vo.FoodCategoryVO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.*;
import java.util.*;
import java.io.*;
import java.net.*;
/*
 * FlowLayout : JPanel
 *    -----------
 *      버튼   버튼
 *    ----------- 버튼을 일자로
 *    
 * GridLayout
 *    -----------
 *    버튼 버튼 버튼
 *    ----------- 일자로 출력, 일정한 간격
 *
 * BoardLayout
 *    -----------
 *       North
 *    -----------
 *      |     |
 * East |     |  West
 *      |     |
 *      Center
 *    -----------
 *      South
 *    -----------
 *    CardLayout: 감춘다 =>
 * 
 * HArdLayout
 */
public class ClientMainForm extends JFrame implements ActionListener,Runnable{
	MenuPanel mp=new MenuPanel();
	JLabel logo=new JLabel();
	ControlPanel cp=new ControlPanel();
	Login login=new Login();
	FoodManager fm=new FoodManager();
	
	// 네트워크 관련
	Socket s; // 전화기
	OutputStream out;
	BufferedReader in;
	public ClientMainForm()
	{
		setLayout(null); // 직접배치
		logo.setBounds(15,20,100,150);
		add(logo);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\Logo.png"), 100, 100)));
		mp.setBounds(15,175,100,250);
		add(mp);
		
		cp.setBounds(135,15,1500,830);
		add(cp);
		
		setSize(1650,880);
		//setSize(1920,1080);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setResizable(false);
		
		mp.b1.addActionListener(this);
    	mp.b2.addActionListener(this);
    	mp.b3.addActionListener(this);
    	mp.b4.addActionListener(this);
    	mp.b5.addActionListener(this);
    	mp.b6.addActionListener(this);
    	
    	login.b1.addActionListener(this);
		
    	ArrayList<FoodCategoryVO> list=fm.foodCategorydata(1);
    	//cp.hp.cardInit();
    	cp.hp.cardPrint(list);
    	
    	//채팅등록
    	cp.cp.tf.addActionListener(this);
    	cp.cp.b6.addActionListener(this); // 프로그램 종료
    	
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1)
		{
			cp.card.show(cp, "Home");
		}
		else if(e.getSource()==mp.b2)
		{
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==mp.b3)
		{
			cp.card.show(cp, "Chat");
		}
		else if(e.getSource()==mp.b4)
		{
			cp.card.show(cp, "Board");
		}
		else if(e.getSource()==mp.b5)
		{
			cp.card.show(cp, "News");
		}
		else if(e.getSource()==mp.b6)
		{
			//System.exit(0);
			try{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex)
			{
				
			}
		}
		else if(e.getSource()==login.b1)
		{
			// 서버연결 
			String id=login.tf1.getText();
			if(id.trim().length()<1)
			{
				login.tf1.requestFocus();
				return;
			}
			
			String name=login.tf2.getText();
			if(name.trim().length()<1)
			{
				login.tf2.requestFocus();
				return;
			}
			
			String sex="";
			if(login.rb1.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			
			// 서버 연결
			connect(id, name, sex);
		}
		else if(e.getSource()==cp.cp.tf)
		{
			String msg=cp.cp.tf.getText();
			if(msg.trim().length()<1)
				return;
			// 채팅 메세지 전송 
			try
			{
				out.write((Function.WAITCHAT+"|"+msg+"\n").getBytes());
			}catch(Exception ex) {}
			cp.cp.tf.setText("");
		}
		else if(e.getSource()==cp.cp.b6)
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
			}catch(Exception ex) {}
		}
	}

	// 서버와 연결 
		public void connect(String id,String name,String sex)
		{
			try
			{
				// 192.168.0.101
				s=new Socket("192.168.0.109",7777);// 서버연결 
				out=s.getOutputStream(); // 서버전송
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				out.write((Function.LOGIN+"|"
						+id+"|"+name+"|"+sex+"\n").getBytes());
				
			}catch(Exception ex) {}
			// 서버로부터 들어오는 데이터를 받아서 처리 
			new Thread(this).start();
		}
		
		// 쓰레드 => 프로그램을 별도로 동작 => 서버에서 들어오는 값만 처리 
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try
			{
				while(true)
				{
					String msg=in.readLine();
					StringTokenizer st=
							new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					// Function.LOGIN+"|"+id+"|"
					//+name+"|"+sex+"|"+pos
					switch(protocol)
					{
					  case Function.LOGIN:
					  {
						String[] data= {
							st.nextToken(),
							st.nextToken(),
							st.nextToken(),
							st.nextToken()
						};
						cp.cp.model2.addRow(data);
					  }
					  break;
					  case Function.MYLOG:
					  {
						  login.setVisible(false);
						  setVisible(true);
					  }
					  break;
					  case Function.WAITCHAT:
					  {
						  cp.cp.bar.setValue(cp.cp.bar.getMaximum());
						  cp.cp.pane.append(st.nextToken()+"\n");
					  }
					  break;
					  case Function.MYEXIT:
					  {
						  System.exit(0);
					  }
					  break;
					  case Function.EXIT:
					  {
						  String id=st.nextToken();
						  for(int i=0;i<cp.cp.model2.getRowCount();i++)
						  {
							  String temp=cp.cp.model2.getValueAt(i, 0).toString();
							  if(id.equals(temp))
							  {
								  cp.cp.model2.removeRow(i);
								  break;
							  }
						  }
					  }
					  break;
					}
				}
			}catch(Exception ex) {}
		}

	}
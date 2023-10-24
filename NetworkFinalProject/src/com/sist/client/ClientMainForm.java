package com.sist.client;
import javax.swing.*;

import com.sist.common.ImageChange;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
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
public class ClientMainForm extends JFrame implements ActionListener{
	MenuPanel mp=new MenuPanel();
	JLabel logo=new JLabel();
	ControlPanel cp=new ControlPanel();
	Login login=new Login();
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
		
		//setSize(1650,880);
		setSize(1920,1080);
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
			System.exit(0);
		}
		else if(e.getSource()==login.b1)
		{
			//서버연결
			login.setVisible(false);
			setVisible(true);
		}
	}
	

}

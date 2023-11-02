package com.sist.client;

import javax.swing.*;

public class ChatDetailPanel extends JFrame{
	JLabel img;
	JLabel la1,la2,la3;
	JTextArea ta1,ta2,ta3;
	public ChatDetailPanel()
	{
		img=new JLabel();
		add(img);
		la1=new JLabel();
		add(la1);
		ta1=new JTextArea();
		add(ta1);
		la2=new JLabel();
		add(la1);
		ta2=new JTextArea();
		add(ta1);
		la3=new JLabel();
		add(la1);
		ta3=new JTextArea();
		add(ta1);
		
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ChatDetailPanel();
	}
}

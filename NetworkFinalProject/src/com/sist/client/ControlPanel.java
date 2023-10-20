package com.sist.client;
import javax.swing.*;
import java.awt.*;
public class ControlPanel extends JPanel{
	public HomePanel hp=new HomePanel();
	public ChatPanel cp=new ChatPanel();
	public BoardListPanel blp=new BoardListPanel();
	public NewsPanel np=new NewsPanel();
	
	public CardLayout card=new CardLayout();
	public ControlPanel()
	{
		setLayout(card);
		add("Home",hp);
		add("Chat",cp);
		add("Board",blp);
		add("News",np);
	}
}

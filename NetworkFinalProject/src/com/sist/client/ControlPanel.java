package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControlPanel extends JPanel{
    public HomePanel hp=new HomePanel();
    public ChatPanel cp=new ChatPanel();
    public BoardListPanel blp;
    public NewsPanel np=new NewsPanel();
    public BoardInsertPanel bip;
    public BoardDetailPanel bdp;
    public BoardDeletePanel bdel;
    public BoardUpdatePanel bup;
    public CardLayout card=new CardLayout();
    public ControlPanel()
    {
    	blp=new BoardListPanel(this);//화면 이동 
    	bip=new BoardInsertPanel(this);
    	bdp=new BoardDetailPanel(this);
    	bdel=new BoardDeletePanel(this);
    	bup=new BoardUpdatePanel(this);
    	setLayout(card);
    	add("Home",hp);
    	add("Chat",cp);
    	add("Board",blp);
    	add("News",np);
    	add("insert",bip);
    	add("detail",bdp);
    	add("delete",bdel);
    	add("update",bup);
    	// @RequestMapping("update.jsp") => Spring/Spring-Boot
    	// app.get("update") => NodeJS
    }
}

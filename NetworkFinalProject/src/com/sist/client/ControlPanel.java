package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControlPanel extends JPanel{
    public HomePanel hp;
    public ChatPanel cp=new ChatPanel();
    public BoardListPanel blp;
    public NewsPanel np=new NewsPanel();
    public BoardInsertPanel bip;
    public BoardDetailPanel bdp;
    public BoardDeletePanel bdel;
    public BoardUpdatePanel bup;
    public FoodCategoryListPanel fcp;
    public FoodDetailPanel fdp;
    public FoodFindPanel ffp;
    public CardLayout card=new CardLayout();
    
    //MVC
    //C => 해당 클래스를 찾아서 => 처리 => 화면이동 (Controller)
    //V => View (화면 UI) => ~Panel
    //M => Manager
    public ControlPanel()
    {
    	hp=new HomePanel(this);
    	blp=new BoardListPanel(this);//화면 이동 
    	bip=new BoardInsertPanel(this);
    	bdp=new BoardDetailPanel(this);
    	bdel=new BoardDeletePanel(this);
    	bup=new BoardUpdatePanel(this);
    	fcp=new FoodCategoryListPanel(this);
    	fdp=new FoodDetailPanel(this);
    	ffp=new FoodFindPanel(this);
    	setLayout(card);
    	add("Home",hp);
    	add("Chat",cp);
    	add("Board",blp);
    	add("News",np);
    	add("insert",bip);
    	add("detail",bdp);
    	add("delete",bdel);
    	add("update",bup);
    	add("catefood",fcp);
    	add("fdetail",fdp);
    	add("find",ffp);
    	// @RequestMapping("update.jsp") => Spring/Spring-Boot
    	// app.get("update") => NodeJS
    }
}

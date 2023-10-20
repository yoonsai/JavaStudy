package com.sist.client;
import javax.swing.*;
import java.awt.*;
/*
 *  Container : 윈도우창
 *  ***  => JFrame : 닫기, 확대, 축소
 *    => JDialog
 *       = Modal // 창 실행시 다른 작업 불가능
 *       = Modaless // 창 실행시 다른 작업 가능
 *    => JWindow : title바가 없다
 *  ***  => JPanel : 단독으로 실행이 안된다
 *       -------> Button,TextField 묶어서 사용
 *    => *** Jtable, JTree, 
 *  Component : 단독으로 실핼할 수 없다
 *    버튼
 *     = 일반버튼 : JButton
 *     = 토글버튼 : JRadioButton, JCheckBox
 *     = 메뉴 : JMenuItem
 *    입력 
 *     = 한줄 입력 : JTextField
 *     = 여러줄 입력 : JTextArea
 *     = 비밀번호 입력 : JPasswordField
 *    기타 
 *     = 문자출력, 이미지 출력 : JLabel
 *     = JTabel : 목록 출력, (JList)
 *     = JTabbedPane, JEditPane, JTextPane
 *  
 *  
 *  
 *  
 */
public class ClientMain {
	// 생성자 => 오버로딩
	private JFrame fr=new JFrame("네트워크 미니 프로젝트");
	Login lo=new Login();
	/*private JButton b1=new JButton("홈");
	private JButton b2=new JButton("맛집");
	private JButton b3=new JButton("레시피");
	private JButton b4=new JButton("서울여행");*/
	
	JMenuItem home=new JMenuItem("홈");
	JMenuItem house=new JMenuItem("맛집");
	JMenuItem recipe=new JMenuItem("레시피");
	JMenuItem seoul=new JMenuItem("서울여행");
	
//	JTabbedPane pan=new JTabbedPane();
	public ClientMain()
	{
		//pan.setTabPlacement(JTabbedPane.LEFT);
//		pan.addTab("홈", new JPanel());
//		pan.addTab("맛집", new JPanel());
//		pan.addTab("레시피dddddddd", new JPanel());
//		pan.addTab("서울여행", new JPanel());
//		fr.add("Center",pan);
		
		
		JMenuItem menu=new JMenuItem("메뉴");
		menu.add(home);
		menu.add(house);
		menu.add(recipe);
		menu.add(seoul);
		JMenuBar bar=new JMenuBar();
		bar.add(menu);
		fr.setJMenuBar(bar);
		
		
		/*JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		fr.add("North",p);*/
		fr.setSize(1024, 768);
		//fr.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
		}catch(Exception ex) {}
		new ClientMain();
	}

}

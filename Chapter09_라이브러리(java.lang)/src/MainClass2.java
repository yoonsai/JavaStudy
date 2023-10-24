import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MainClass2 extends JFrame implements ItemListener{
	JComboBox box=new JComboBox();
	public MainClass2()
	{
		box.addItem("홍길동");
		box.addItem("심청이");
		box.addItem("박문수");
		add("North",box);
		setSize(300,150);
		setVisible(true);
		box.addItemListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass2();
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String name=box.getSelectedItem().toString(); // getSelectedItem의 데이터형이 object라서 형변환또는 toString으로 문자열 변환
			//String name=(String)box.getSelectedItem();
			System.out.println(name);
		}
	}

}

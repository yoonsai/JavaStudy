/*
 * 
 */

import javax.swing.*;
import java.awt.*;
public class GameView extends JPanel{

	Image back,heart;
	int x=20, y=560;
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\JavaDev\\back.jpg");
		heart=Toolkit.getDefaultToolkit().getImage("C:\\JavaDev\\heart.gif");
	}
	
	
	public void paint(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(heart,x,y,150,100,this);
	}

}

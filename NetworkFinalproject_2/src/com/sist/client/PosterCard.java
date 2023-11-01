package com.sist.client;
import java.awt.*;
import javax.swing.*;
import java.net.*;

import com.sist.common.ImageChange;
import com.sist.vo.*;
public class PosterCard extends JPanel{
	JLabel poLa=new JLabel();
	JLabel tLa=new JLabel();
	public PosterCard(MagazineVO vo)
	{
		setLayout(null);
		poLa.setBounds(5,5,500,170);
		tLa.setBounds(5, 172, 300, 30);
		
		add(poLa);
		add(tLa);
		
		try {
			
			    URL url=new URL("http:"+vo.getImage());
				Image image=ImageChange.getImage(new ImageIcon(url), 500, 170);
				poLa.setIcon(new ImageIcon(image));
			tLa.setText(vo.getTitle());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

package chtting;
import javax.swing.*;
import java.awt.*;

public class Serv extends JFrame {
	Serv(){
		
		setLayout(null);
		//setSize(450,700);
		JPanel p= new JPanel();
		p.setBackground(new Color(7,94,84));
		p.setBounds(0,0,450,70);
		p.setLayout(null);
		add(p);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/3.png"));
		Image i2=i1.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
		Image i3=new InageIcon(i2);
	
       JLabel back=new JLabel(i3); 
		back.setBounds(5, 20,25, 25);
        p.add(back);
		
				setLocation(200,50);	
		setSize(450,700);
		getContentPane().setBackground(Color.WHITE);

		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new Serv();
	}

}

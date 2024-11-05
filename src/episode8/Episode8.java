package episode8;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import main.Main;

public class Episode8 {
	
	public Episode8() {
		Main.backgroundMusic.close();
		Main.backgroundMusic.bgPlay("sound/episode8bgm.wav");
		
		Frame f = new Frame("Episode8");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);
		
		ImageIcon img = new ImageIcon("images/glass_coffin.jpg");//배경
		JLabel jb = new JLabel(img);
		jb.setBounds(0, 0, 900, 700);
		
		JButton b = new JButton(img);//버튼 
		b.setBounds(0, 0, 900, 700);
		
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode8_1();
				f.dispose();
			}
		};
		b.addActionListener(act);//버튼클릭
		
		
		f.add(jb);
		f.add(b);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
				
			}
		});
		
	}
}

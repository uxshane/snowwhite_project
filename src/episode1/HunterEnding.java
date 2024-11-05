package episode1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.Loader;
import main.Main;
import main.Music;
import main.LoadGame;

public class HunterEnding {
	
	public HunterEnding() {
		Music badmusic = new Music();
		badmusic.bgPlay("sound/badendingbgm.wav");
		
		JFrame f = new JFrame("HunterEnding");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);
		ImageIcon imgBack = new ImageIcon("images/Hunter_Ending_real.jpg");
		JLabel j1 = new JLabel(imgBack);
		j1.setBounds(0, 0, 900, 700);
		
		JButton btn1 = new JButton();
		btn1.setBounds(0, 0, 900, 700);
		btn1.setContentAreaFilled(false);
		btn1.setBorderPainted(false);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//다시 시작 버튼을 눌렀으므로 이전으로 돌아감.
				new Episode1();
				badmusic.close();
				Main.backgroundMusic.start();
				f.dispose();
			}
		});
		
		f.add(btn1);
		f.add(j1);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		f.setVisible(true);
		
		Loader load = new Loader(LoadGame.ID);
		load.user.badEnding[0] = true;
		load.save();
	}
}















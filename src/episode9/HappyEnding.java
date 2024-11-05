package episode9;

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
import main.StartPage;

public class HappyEnding {
	
	JFrame f;
	
	public HappyEnding() {
		Music happymusic = new Music();
		happymusic.bgPlay("sound/happyendingbgm.wav");
		
		//TODO : 프레임 셋업
		f = new JFrame("Happy Ending");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);

		ImageIcon imgBack = new ImageIcon("images/happy_ending.jpg");
		JLabel background = new JLabel(imgBack);
		background.setBounds(0, 0, 900, 700);
		
		JButton btn = new JButton(imgBack);
		btn.setBounds(0, 0, 900, 700);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				happymusic.close();
				Main.backgroundMusic.close();
				Main.backgroundMusic.bgPlay("sound/soundtrack1.wav");
				new StartPage();
				f.dispose();
			}
		});
		
		f.add(btn);
		f.add(background);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setVisible(true);
		
		Loader load = new Loader(LoadGame.ID);
		load.user.badEnding[7] = true;
		load.save();
	}
	
}

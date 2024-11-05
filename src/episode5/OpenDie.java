package episode5;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import episode3.AED;
import main.Loader;
import main.Main;
import main.Music;
import main.LoadGame;

public class OpenDie {

	public OpenDie() {
		Music badmusic = new Music();
		badmusic.bgPlay("sound/badendingbgm.wav");
		//프레임 설계
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(550, 150, 900, 700);
		f.setResizable(false);
		
		//배경이미지
		ImageIcon img = new ImageIcon("images/comb_bad_ending_real.jpg");
		JLabel j1 = new JLabel(img);
		j1.setBounds(0, 0, 900, 700);
		
		JButton b1 = new JButton();
		b1.setBounds(0, 0, 900, 700);
		
		f.add(j1);
		f.add(b1);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}

		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Episode5();
				badmusic.close();
				Main.backgroundMusic.start();
				f.dispose();
			}
		});
		
		Loader load = new Loader(LoadGame.ID);
		load.user.badEnding[4] = true;
		load.save();

	}
}

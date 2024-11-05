package episode6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.Loader;
import main.Main;
import main.Music;
import main.LoadGame;

public class CorsetEnding {
	public CorsetEnding() {
		Music badmusic = new Music();
		badmusic.bgPlay("sound/badendingbgm.wav");
		
		JFrame f = new JFrame("CorsetEnding");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);

		ImageIcon imgBack = new ImageIcon("images/corset_ending_real.jpg");
		JLabel j1 = new JLabel(imgBack);
		j1.setBounds(0, 0, 900, 700);
		
		
		JButton btn1 = new JButton(imgBack);
		btn1.setBounds(0, 0, 900, 700);
		

		f.add(btn1);
		f.add(j1);
		
		f.setVisible(true);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Episode6();
				badmusic.close();
				Main.backgroundMusic.start();
				f.dispose();
			}
		});
		
		Loader load = new Loader(LoadGame.ID);
		load.user.badEnding[5] = true;
		load.save();
		
	}
}

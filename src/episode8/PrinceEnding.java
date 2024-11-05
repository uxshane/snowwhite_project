package episode8;

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

public class PrinceEnding {
	public PrinceEnding() {
		Music badmusic = new Music();
		badmusic.bgPlay("sound/badendingbgm.wav");
		
		JFrame f = new JFrame("PrinceEnding");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);
		ImageIcon img = new ImageIcon("images/prince_bad_ending_real.jpg");//배경
		JLabel jb = new JLabel(img);
		jb.setBounds(0, 0, 900, 700);
		
		JButton btn1 = new JButton(img);
		btn1.setBounds(0,0,900,700);
		
		f.add(jb);
		f.add(btn1);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Episode8_1();
				badmusic.close();
				Main.backgroundMusic.close();
				Main.backgroundMusic.bgPlay("sound/soundtrack1.wav");
				f.dispose();
			}
		});
		
		Loader load = new Loader(LoadGame.ID);
		load.user.badEnding[6] = true;
		load.save();
	}

}

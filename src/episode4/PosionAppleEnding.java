package episode4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import episode3.Episode3_2;
import main.Loader;
import main.Main;
import main.Music;
import main.LoadGame;

public class PosionAppleEnding {


	public PosionAppleEnding() {
		Music badmusic = new Music();
		badmusic.bgPlay("sound/badendingbgm.wav");

		JFrame f = new JFrame("PosionAppleEnding");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);
		ImageIcon img = new ImageIcon("images/poison_apple_ending_real.jpg");//배경
		JLabel jb = new JLabel(img);
		jb.setBounds(0, 0, 900, 700);

		JButton nextBtn = new JButton();
		nextBtn.setBounds(0, 0, 900, 700);
		nextBtn.setContentAreaFilled(false);
		nextBtn.setBorderPainted(false);

		f.add(jb);
		f.add(nextBtn);

		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//여기에 바로 클릭하면 나가기가 아니라 클릭하면 이전으로 가기 만들까?
				new Episode4();
				badmusic.close();
				Main.backgroundMusic.start();
				f.dispose();
			}
		});

		Loader load = new Loader(LoadGame.ID);
		load.user.badEnding[3] = true;
		load.save();

	}



}
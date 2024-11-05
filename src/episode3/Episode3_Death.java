package episode3;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import main.Loader;
import main.Main;
import main.Music;
import main.LoadGame;

public class Episode3_Death {

	JLabel j1;

	public Episode3_Death(String killer) {
		Music badmusic = new Music();
		badmusic.bgPlay("sound/badendingbgm.wav");

		//TODO : 메인 프레임 셋팅
		Frame f = new Frame("Episode3_Death");
		f.setLayout(null);
		f.setBounds(550, 150, 900, 700);
		/////////////////////
		if(killer.equals("book")) {
			j1 = new JLabel(new ImageIcon("images/blood_ending_real.jpg"));
		} else if(killer.equals("flower")) {
			j1 = new JLabel(new ImageIcon("images/blood_ending_real.jpg"));
		} else {
			j1 = new JLabel(new ImageIcon("images/blood_ending_real2.jpg"));
		}
		j1.setBounds(0, 0, 900, 700);

		JButton nextBtn = new JButton();
		nextBtn.setBounds(0, 0, 900, 700);
		nextBtn.setContentAreaFilled(false);
		nextBtn.setBorderPainted(false);

		//TODO : 필요한 리스너들
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//여기에 바로 클릭하면 나가기가 아니라 클릭하면 이전으로 가기 만들까?
				new Episode3_2();
				badmusic.close();
				Main.backgroundMusic.start();
				f.dispose();
			}
		});
		////////////////////

		f.add(j1);
		f.add(nextBtn);

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		Loader load = new Loader(LoadGame.ID);
		load.user.badEnding[2] = true;
		load.save();

	}//생성자

}
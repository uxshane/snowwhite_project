package episode2;

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

import main.Loader;
import main.Main;
import main.Music;
import main.LoadGame;

public class Episode2_2 {

	public Episode2_2() {
		Music badmusic = new Music();
		badmusic.bgPlay("sound/badendingbgm.wav");

		// 프레임설계
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(550, 150, 900, 700);
		f.setResizable(false);

		// 배경이미지
		ImageIcon img = new ImageIcon("images/streetdead.jpg");
		JLabel j1 = new JLabel(img);
		j1.setBounds(0, 0, 900, 700);
		
		JButton nextBtn = new JButton();
		nextBtn.setBounds(0, 0, 900, 700);
		nextBtn.setContentAreaFilled(false);
		nextBtn.setBorderPainted(false);

		// 폰트
		Font font = new Font("맑은 고딕", Font.BOLD, 60);

		// 글자 레이블
		JLabel j2 = new JLabel();
		j2.setText("사  망");
		j2.setFont(font);
		j2.setBounds(220, 200, 500, 70);

		// 폰트 색상
		j2.setForeground(Color.RED);
		
		f.add(nextBtn);
		f.add(j2);
		f.add(j1);

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
				new Episode2_1();
				badmusic.close();
				Main.backgroundMusic.start();
				f.dispose();
			}
		});
		
		Loader load = new Loader(LoadGame.ID);
		load.user.badEnding[1] = true;
		load.save();

	}
}

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

import main.Main;

public class Episode2 {
	
	public Episode2() {
		// 프레임설계
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(550, 150, 900, 700);
		f.setResizable(false);

		// 배경이미지
		ImageIcon img = new ImageIcon("images/forest_run.jpg");
		JLabel j1 = new JLabel(img);
		j1.setBounds(0, 0, 900, 700);

		// 다음 버튼
		JButton btnNext = new JButton();
		btnNext.setContentAreaFilled(false);
		btnNext.setBorderPainted(false);
		btnNext.setBounds(0, 0, 900, 700);

		f.add(btnNext);
		f.add(j1);

		// 버튼 이벤트
		btnNext.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode2_1();
				f.dispose();
			}
		});

		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}

		});

	}

}

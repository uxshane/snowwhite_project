package episode9;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.Main;

public class Episode9_2 {

	JFrame f;

	public Episode9_2() {

		//TODO : 프레임 셋업
		f = new JFrame("Episode 9");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);

		ImageIcon imgBack = new ImageIcon("images/open_kit.jpg");
		JLabel background = new JLabel(imgBack);
		background.setBounds(0, 0, 900, 700);

		// 글 라벨
		JLabel j1 = new JLabel("<html>마침내 구급상자를 연 백설공주가"
				+ "쓰러진 왕자를 치료하였다!</html>");
		j1.setBounds(70, 70, 440, 260);

		// 폰트설정
		Font font = new Font("맑은 고딕", Font.BOLD, 40);
		j1.setForeground(Color.WHITE);
		j1.setFont(font);
		
		JButton btn = new JButton();
		btn.setContentAreaFilled(false);
		btn.setBorderPainted(false);
		btn.setBounds(0, 0, 900, 700);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new HappyEnding();
				Main.backgroundMusic.stop();
				f.dispose();
			}
		});
		
		f.add(j1);
		f.add(btn);
		f.add(background);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setVisible(true);

	}

}

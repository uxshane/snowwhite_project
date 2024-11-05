package episode7;

import java.awt.Button;
import java.awt.Color;
//import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.Main;

public class Episode7 {

	public Episode7() {
		Main.backgroundMusic.close();
		Main.backgroundMusic.bgPlay("sound/episode7_4bgm.wav");
		// 프레임
		JFrame f = new JFrame("Episode7");
		f.setLayout(null);
		f.setResizable(false);
		f.setBounds(550, 150, 900, 700);

		// 버튼
		Button btn = new Button("다음");
		btn.setBounds(680, 600, 200, 80);
		

		ImageIcon imgBack = new ImageIcon("images/window.jpg");
		//사진을 넣어야 합니다.
		JLabel j2 = new JLabel(imgBack);
		j2.setBounds(0, 0, 900, 700);
		
		ImageIcon imgBack2 = new ImageIcon("images/windowapple.png");
		JButton btn2 = new JButton(imgBack2);
		btn2.setBorderPainted(false);// 클릭칸 없애고
		btn2.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		btn2.setBounds(160, 470, 150, 120);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBounds(160, 475, 150, 120);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setBounds(160, 470, 150, 120);
			}
		});
		
		// 글 라벨
		JLabel j1 = new JLabel("<html>계속된 공주의 거절에 화가난 마녀는 공주 몰래 독사과를 창문에 놔두고 간다.</html>");
		j1.setBounds(100, 100, 440, 260);

		// 폰트설정
		Font font = new Font("맑은 고딕", Font.BOLD, 40);
		j1.setForeground(Color.WHITE);
		j1.setFont(font);
		
		
		f.add(j1);
		f.add(btn2);
		f.add(j2);

		// 버튼 이벤트
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode7_1();
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

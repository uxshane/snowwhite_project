package episode2;

import java.awt.Color;
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

import episode3.Episode3;
import main.Main;

public class Episode2_1 {

	public Episode2_1() {
		// 프레임 설계
		JFrame f = new JFrame("Episode2_1");
		f.setLayout(null);
		f.setBounds(550, 150, 900, 700);
		f.setResizable(false);

		// 배경이미지
		ImageIcon img = new ImageIcon("images/dwarfs_house.jpg");
		JLabel j1 = new JLabel(img);
		j1.setBounds(0, 0, 900, 700);

		// 폰트
		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 20);
		Font font3 = new Font("맑은 고딕", Font.BOLD, 20);

		// 글자 레이블
		JLabel j2 = new JLabel();
		j2.setText("- 그러다 우연히 한 집을 발견했는데...");
		j2.setFont(font);
		j2.setBounds(250, 480, 450, 100);

		// 자막 배경 이미지
		JLabel j3 = new JLabel(new ImageIcon("images/content.png"));
		j3.setBounds(200, 450, 529, 173);

		// 폰트 색상
		j2.setForeground(Color.BLACK);

		// 버튼작업
		JButton btn1 = new JButton(new ImageIcon("images/page.png"));
		btn1.setBounds(80, 270, 200, 100);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		JLabel j4 = new JLabel("<html>들어간다</html>");
		j4.setFont(font2);
		j4.setBounds(140, 270, 200, 100);
		
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBounds(80, 275, 200, 100);
				j4.setBounds(140, 275, 200, 100);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBounds(80, 270, 200, 100);
				j4.setBounds(140, 270, 200, 100);
			}
		});

		JButton btn2 = new JButton(new ImageIcon("images/page.png"));
		btn2.setBounds(620, 270, 200, 100);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);
		JLabel j5 = new JLabel("<html>들어가지<br>않는다</html>");
		j5.setFont(font3);
		j5.setBounds(680, 270, 200, 100);
		
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBounds(620, 275, 200, 100);
				j5.setBounds(680, 275, 200, 100);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setBounds(620, 270, 200, 100);
				j5.setBounds(680, 270, 200, 100);
			}
		});

		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode3();
				f.dispose();
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Episode2_2();
				Main.backgroundMusic.stop();
				f.dispose();
			}
		});

		f.add(j4);
		f.add(j5);
		f.add(btn2);
		f.add(btn1);
		f.add(j2);
		f.add(j3);
		f.add(j1);

		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}

		});

	}
	// }

}

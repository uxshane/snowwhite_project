package episode5;

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
import javax.swing.JLabel;

import main.Main;

public class Episode5 {

	public Episode5() {
		//프레임 설계
		Frame f = new Frame("Episode5");
		f.setLayout(null);
		f.setResizable(false);
		f.setBounds(550, 150, 900, 700);

		//배경 이미지
		ImageIcon img = new ImageIcon("images/comb.jpg");
		JLabel img1 = new JLabel(img);
		img1.setBounds(0, 0, 900, 700);

		//스토리 레이블
		JLabel story = new JLabel("<html>이번에는<br>머리빗을 파는 방물장수가 찾아왔다.<br>"
				+ "고운 머릿결을 만들어 준다는<br>"
				+ "특별한 머리빗이라고 하는데...<br>"
				+ "문을 열어줄까?</html>");

		story.setBounds(210, 370, 500, 330);

		//스토리 바 레이블
		JLabel storyBg = new JLabel(new ImageIcon("images/content.png"));
		storyBg.setBounds(140, 430, 600, 200);

		//폰트 설정
		Font font = new Font("맑은 고딕", Font.BOLD, 20);
		story.setFont(font);
		story.setForeground(Color.BLACK);

		//버튼 설정
		JButton btn1 = new JButton(new ImageIcon("images/page.png"));
		JLabel story1 = new JLabel("<html>열어준다<html/>");
		story1.setBounds(160, 305, 200, 30);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		btn1.setBounds(100, 270, 200, 100);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBounds(100, 275, 200, 100);
				story1.setBounds(160, 310, 200, 30);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBounds(100, 270, 200, 100);
				story1.setBounds(160, 305, 200, 30);
			}
		});

		JButton btn2 = new JButton(new ImageIcon("images/page.png"));
		JLabel story2 = new JLabel("<html>열어주지 않는다<html/>");
		story2.setBounds(625, 305, 200, 30);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		btn2.setBounds(600, 270, 200, 100);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBounds(600, 275, 200, 100);
				story2.setBounds(625, 310, 200, 30);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setBounds(600, 270, 200, 100);
				story2.setBounds(625, 305, 200, 30);
			}
		});

		story1.setFont(font);
		story2.setFont(font);

		//버튼 이벤트
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new OpenDie();
				Main.backgroundMusic.stop();
				f.dispose();
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode5_5();
				f.dispose();
			}
		});

		f.add(story1);
		f.add(story2);
		f.add(btn1);
		f.add(btn2);
		f.add(story);
		f.add(storyBg);
		f.add(img1);

		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

	}

}

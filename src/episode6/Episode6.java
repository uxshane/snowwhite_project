package episode6;

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

import episode7.Episode7;
import main.Main;

public class Episode6 { //허리띠
	
	public Episode6() {
		Frame f = new Frame("Episode6");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);
		
		//수락 버튼
		JButton btn1 = new JButton(new ImageIcon("images/page.png"));
		JLabel story1 = new JLabel("<html>수락한다<html/>");
		story1.setBounds(150, 305, 200, 30);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		btn1.setBounds(100, 270, 200, 100);
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBounds(100, 275, 200, 100);
				story1.setBounds(150, 310, 200, 30);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBounds(100, 270, 200, 100);
				story1.setBounds(150, 305, 200, 30);
			}
		});
		
		//거절 버튼
		JButton btn2 = new JButton(new ImageIcon("images/page.png"));
		JLabel story2 = new JLabel("<html>거절한다.<html/>");
		story2.setBounds(650, 305, 200, 30);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		btn2.setBounds(600, 270, 200, 100);
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBounds(600, 275, 200, 100);
				story2.setBounds(650, 310, 200, 30);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setBounds(600, 270, 200, 100);
				story2.setBounds(650, 305, 200, 30);
			}
		});
		
		
		//스토리 레이블
		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		JLabel story = new JLabel("<html>허리띠를 파는 옷 장수가 찾아왔다.<br>성에서 사는 사람들도 사지 못할 정도로 인기있는 허리띠라는데…<br>한 번 묶어달라고 해볼까?<html/>");
		story.setBounds(210, 370, 500, 330);
		story.setFont(font);
		story1.setFont(font);
		story2.setFont(font);
		story.setForeground(Color.BLACK);
		
		//스토리 바 레이블
		JLabel storyBg = new JLabel(new ImageIcon("images/content.png"));
		storyBg.setBounds(150, 430, 600, 200);
		
		//배경 이미지
		ImageIcon imgHunter = new ImageIcon("images/corset_stroy.jpg");
		JLabel j1 = new JLabel(imgHunter);
		j1.setBounds(0, 0, 900, 700);
		
		story.setHorizontalAlignment(JLabel.CENTER);
		
		f.add(story2);
		f.add(story1);
		f.add(btn1);
		f.add(btn2);
		f.add(story);
		f.add(storyBg);
		f.add(j1);
		
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new CorsetEnding(); //허리띠로 인해 사망하는 엔딩으로 이어짐.
				Main.backgroundMusic.stop();
				f.dispose();
			}
		});
		
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode7(); //part7이 나오면 여기로 연결!
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

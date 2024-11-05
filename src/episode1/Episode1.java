package episode1;

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

import main.Main;

public class Episode1 {

	public Episode1() {
		JFrame f = new JFrame("Episode1");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);

		//버튼 작업
		JButton btn1 = new JButton(new ImageIcon("images/page.png"));
		JLabel story2 = new JLabel("<html>예<html/>");
		story2.setBounds(180, 305, 200, 30);
		btn1.setBorderPainted(false);
		btn1.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		btn1.setBounds(100, 270, 200, 100);

		JButton btn2 = new JButton(new ImageIcon("images/page.png"));
		JLabel story3 = new JLabel("<html>아니오<html/>");
		story3.setBounds(645, 305, 250, 30);
		btn2.setBorderPainted(false);
		btn2.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		btn2.setBounds(600, 270, 200, 100);

		ImageIcon imgHunter = new ImageIcon("images/dkdkdkddk.jpg");
		JLabel j1 = new JLabel(imgHunter);
		j1.setBounds(0, 0, 900, 700);

		//스토리 레이블
		JLabel story1 = new JLabel("<html>사냥꾼을 만났다. <br>- 공주님, 새 왕비님의 명으로 공주님을 죽여야 합니다."
				+ " 하지만 제게서 가위바위보를 세 번 이기면 "
				+ " 해치지 않고 보내드리겠습니다.<br>"
				+ "- 가위 바위 보를 할까?<html/>");
		story1.setBounds(210, 370, 500, 330);

		//폰트 설정
		Font font = new Font("맑은 고딕", Font.BOLD, 20);
		Font font1 = new Font("맑은 고딕", Font.BOLD, 35);
		story1.setFont(font);
		story2.setFont(font1);
		story3.setFont(font1);
		story1.setForeground(Color.BLACK);

		//스토리 바 이미지
		JLabel story1Bg = new JLabel(new ImageIcon("images/content.png"));
		story1Bg.setBounds(150, 430, 600, 200);

		f.add(story3);
		f.add(story2);
		f.add(btn1);
		f.add(btn2);
		f.add(story1);
		f.add(story1Bg);
		//여기 위치에 스토리 + 대사
		f.add(j1);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Rsp_main(); //가위바위보를 하러간다. 수락
				f.dispose();
			}
		});
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBounds(100, 275, 200, 100);
				story2.setBounds(180, 310, 200, 30);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn1.setBounds(100, 270, 200, 100);
				story2.setBounds(180, 305, 200, 30);
			}
		});

		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new HunterEnding(); //거절하면 그냥 사냥꾼이 죽이는 엔딩으로 감
				Main.backgroundMusic.stop();
				f.dispose();
			}
		});
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBounds(600, 275, 200, 100);
				story3.setBounds(645, 310, 250, 30);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn2.setBounds(600, 270, 200, 100);
				story3.setBounds(645, 305, 250, 30);
			}
		});



		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});

		f.setVisible(true);

	}//part1()

}

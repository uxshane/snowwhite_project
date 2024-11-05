package episode3;

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

public class Episode3_2 {
	Frame f;

	public Episode3_2() {
		//TODO : 메인 프레임 셋팅
		f = new Frame("Episode 3_2");
		f.setLayout(null);
		f.setBounds(550, 150, 900, 700);
		ImageIcon houseImg = new ImageIcon("images/ep3houseinside.jpg");
		JLabel background = new JLabel(houseImg);
		background.setBounds(0, 0, 900, 700);
		/////////////////////

		//TODO : 레이블
		JLabel story = new JLabel("<html>가만히 있는게 도와주는 것이라고 하기에 편히 지냈지만"
				+ " 난쟁이들이 일을 나갔을 때 몰래 집안일을 도우기로 결심했다.<br>"
				+ " 무엇을 도와줄까?</html>");
		story.setBounds(210, 370, 500, 330);
		Font font1 = new Font("맑은 고딕", Font.BOLD, 25);
		story.setFont(font1);
		story.setForeground(Color.BLACK);

		JLabel bookLabel = new JLabel("책정리");
		bookLabel.setBounds(140, 120, 100, 45);
		bookLabel.setFont(font1);
		bookLabel.setForeground(Color.YELLOW);

		JLabel flowerLabel = new JLabel("물주기");
		flowerLabel.setBounds(390, 120, 100, 45);
		flowerLabel.setFont(font1);
		flowerLabel.setForeground(Color.YELLOW);

		JLabel pickLabel = new JLabel("노동");
		pickLabel.setBounds(660, 120, 100, 45);
		pickLabel.setFont(font1);
		pickLabel.setForeground(Color.YELLOW);

		JLabel storyBg = new JLabel(new ImageIcon("images/content.png"));
		storyBg.setBounds(150, 440, 600, 180);

		//////////////


		//TODO : 컴포넌트들
		ImageIcon bookImg = new ImageIcon("images/book.png");
		JButton bookBtn = new JButton(bookImg);
		bookBtn.setBorderPainted(false);// 클릭칸 없애고
		bookBtn.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		bookBtn.setBounds(80, 170, 172, 172);
		bookBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				bookBtn.setBounds(80, 175, 172, 172);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				bookBtn.setBounds(80, 170, 172, 172);
			}
		});


		ImageIcon flowerImg = new ImageIcon("images/flower.png");
		JButton flowerBtn = new JButton(flowerImg);
		flowerBtn.setBorderPainted(false);// 클릭칸 없애고
		flowerBtn.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		flowerBtn.setBounds(350, 170, 164, 244);
		flowerBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				flowerBtn.setBounds(350, 175, 164, 244);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				flowerBtn.setBounds(350, 170, 164, 244);
			}
		});

		ImageIcon pickImg = new ImageIcon("images/pick.png");
		JButton pickBtn = new JButton(pickImg);
		pickBtn.setBorderPainted(false);// 클릭칸 없애고
		pickBtn.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		pickBtn.setBounds(600, 170, 177, 177);
		pickBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				pickBtn.setBounds(600, 175, 177, 177);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				pickBtn.setBounds(600, 170, 177, 177);
			}
		});
		////////////////

		//TODO : 필요한 리스너들
		bookBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new AED("book");
				f.dispose();
			}
		});
		flowerBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new AED("flower");
				f.dispose();
			}
		});
		pickBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new AED("pick");
				f.dispose();
			}
		});
		////////////////////

		//TODO :모두 합치기
		f.add(story);
		f.add(storyBg);
		f.add(bookLabel);
		f.add(flowerLabel);
		f.add(pickLabel);
		f.add(bookBtn);
		f.add(flowerBtn);
		f.add(pickBtn);
		f.add(background);
		////////////////

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}

}

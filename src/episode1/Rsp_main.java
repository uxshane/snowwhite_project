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
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import episode2.Episode2;
import main.Main;

public class Rsp_main {

	Frame f;

	JLabel user;
	JLabel result;
	JLabel hunter;
	JLabel winCount;
	JLabel j3 = new JLabel("NEXT");
	int winCnt;

	ImageIcon scissorImg;
	ImageIcon rockImg;
	ImageIcon paperImg;
	ImageIcon img6 = new ImageIcon("images/page2.png");

	JButton nextBtn;

	public Rsp_main() {
		nextBtn = new JButton(img6);
		//TODO : background 셋업
		f = new Frame("Rsp_main");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);

		ImageIcon imgHunter = new ImageIcon("images/dkdkdkddk.jpg");
		JLabel j1 = new JLabel(imgHunter);
		j1.setBounds(0, 0, 900, 700);
		Font font = new Font("맑은 고딕", Font.BOLD, 20);

		ImageIcon img2 = new ImageIcon("images/content2.png");//글
		JLabel j2 = new JLabel(img2);
		j2.setBounds(120, 50, 600, 130);

		JLabel say1 = new JLabel("사냥꾼 : 가위바위보를 3번 이기면 살려드리죠!");

		say1.setBounds(220, 60, 500, 70);
		say1.setFont(font);
		say1.setForeground(Color.magenta);
		///////////////////////

		// TODO : 버튼 셋업
		scissorImg = new ImageIcon("images/paper (3).png");
		JButton scissor = new JButton(scissorImg);
		scissor.setContentAreaFilled(false);
		scissor.setBorderPainted(false);
		scissor.setBounds(80, 500, 170, 170);
		scissor.addActionListener(new EventHandler());
		scissor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				scissor.setBounds(80, 505, 170, 170);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				scissor.setBounds(80, 500, 170, 170);
			}
		});

		rockImg = new ImageIcon("images/rock.png");
		JButton rock = new JButton(rockImg);
		rock.setContentAreaFilled(false);
		rock.setBorderPainted(false);
		rock.setBounds(350, 500, 170, 170);
		rock.addActionListener(new EventHandler());
		rock.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rock.setBounds(350, 505, 170, 170);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rock.setBounds(350, 500, 170, 170);
			}
		});

		paperImg = new ImageIcon("images/paper.png");
		JButton paper = new JButton(paperImg);
		paper.setContentAreaFilled(false);
		paper.setBorderPainted(false);
		paper.setBounds(620, 500, 170, 170);
		paper.addActionListener(new EventHandler());
		paper.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				paper.setBounds(620, 505, 170, 170);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				paper.setBounds(620, 500, 170, 170);
			}
		});
		////////////////

		//TODO : 결과 레이블 셋업
		user = new JLabel();
		user.setBounds(100, 250, 170, 170);

		ImageIcon img3 = new ImageIcon("images/page2.png");
		JLabel userimg = new JLabel(img3);
		userimg.setBounds(85, 120, 170, 170);
		JLabel usertext = new JLabel("나");
		usertext.setBounds(160, 120, 170, 170);
		usertext.setForeground(Color.BLACK);
		usertext.setFont(font);

		result = new JLabel("결과는?");
		result.setBounds(365, 240, 300, 100);
		result.setForeground(Color.magenta);
		result.setFont(font);

		hunter = new JLabel();
		hunter.setBounds(600, 250, 170, 170);

		ImageIcon img4 = new ImageIcon("images/page2.png");
		JLabel hunterimg = new JLabel(img4);
		hunterimg.setBounds(600, 120, 170, 170);
		JLabel huntertext = new JLabel("사냥꾼");
		huntertext.setBounds(655, 120, 170, 170);
		huntertext.setForeground(Color.BLACK);
		huntertext.setFont(font);

		JLabel win = new JLabel("이긴 횟수:");
		win.setBounds(330, 110, 170, 50);
		win.setForeground(Color.WHITE);
		win.setFont(font);

		ImageIcon img5 = new ImageIcon("images/page2.png");
		JLabel next = new JLabel(img5);
		next.setBounds(450, 150, 170, 50);

		winCount = new JLabel("0");
		winCount.setBounds(450, 110, 170, 50);
		winCount.setFont(font);
		winCount.setForeground(Color.WHITE);
		////////////////////

		//TODO : add로 합치기
		f.add(user);
		f.add(result);
		f.add(hunter);
		f.add(j3);
		f.add(nextBtn);
		f.add(win);
		f.add(winCount);
		f.add(usertext);
		f.add(huntertext);
		f.add(scissor);
		f.add(rock);
		f.add(paper);
		f.add(say1);
		f.add(userimg);
		f.add(hunterimg);
		f.add(j2);
		f.add(j1);
		//////////////////

		//TODO : 액션 리스너 셋업
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode2();
				f.dispose();
			}
		});
		nextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextBtn.setBounds(340, 315, 150, 50);
				j3.setBounds(390, 315, 100, 50);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextBtn.setBounds(340, 310, 150, 50);
				j3.setBounds(390, 310, 100, 50);
			}
		});
		////////////////////

		//TODO : Window Frame 셋업
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setVisible(true);
		/////////////////////////
	}

	class EventHandler implements ActionListener {
		private int userNum;
		private int comNum;
		Random rnd = new Random();
		JButton btnSrc;

		public void setUserNum(String rsp) {
			if(rsp.equals("images/paper (3).png")) {
				userNum = 0;
			} else if(rsp.equals("images/rock.png")) {
				userNum = 1;
			} else {
				userNum = 2;
			}
		}

		public void countWin() {
			if(winCnt >= 3) {
				nextBtn.setBorderPainted(false);
				nextBtn.setContentAreaFilled(false);
				nextBtn.setBounds(340, 310, 150, 50);
				nextBtn.setIcon(img6);
				Font font = new Font("맑은 고딕", Font.BOLD, 18);
				j3.setFont(font);
				j3.setForeground(Color.BLACK);
				j3.setBounds(390, 310, 100, 50);
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			btnSrc = (JButton) e.getSource();
			String rsp = btnSrc.getIcon().toString();
			setUserNum(rsp);

			comNum = rnd.nextInt(3);
			if(comNum == 0) {
				hunter.setIcon(scissorImg);
			} else if(comNum == 1) {
				hunter.setIcon(rockImg);
			} else {
				hunter.setIcon(paperImg);
			}

			if (userNum - comNum == -2 || userNum - comNum == 1) {
				user.setIcon(btnSrc.getIcon());
				result.setText("이겼습니다!");
				winCnt++;
				winCount.setText(String.format("%d", winCnt));
				countWin();

			} else if (userNum - comNum == 0) {
				user.setIcon(btnSrc.getIcon());
				result.setText("비겼습니다.");

			} else {
				user.setIcon(btnSrc.getIcon());
				result.setText("졌습니다..");
			}

		}
	}
}





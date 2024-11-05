package episode4;

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

import episode5.Episode5;
import main.Main;

public class AppleChoice {

	// Frame ep4_frame;

	public AppleChoice(Frame ep4_frame) {

		JFrame f1 = new JFrame();
		f1.setBounds(800, 330, 400, 400);
		f1.setLayout(null);

		ImageIcon img0 = new ImageIcon("images/open.jpg");
		JLabel b = new JLabel(img0);// 배경
		b.setBounds(0, 0, 400, 400);

		JLabel jb1 = new JLabel("<html>골라보자</html>");
		Font font = new Font("맑은 고딕", Font.BOLD, 20);// 폰트
		jb1.setForeground(Color.black);
		jb1.setFont(font);
		jb1.setBounds(30, 300, 800, 50);

		ImageIcon img1 = new ImageIcon("images/redApple2.png");
		JButton b1 = new JButton(img1);
		b1.setBorderPainted(false);// 클릭칸 없애고
		b1.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		b1.setBounds(70, 120, 70, 75);
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b1.setBounds(70, 125, 70, 75);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b1.setBounds(70, 120, 70, 75);
			}
		});

		ImageIcon img2 = new ImageIcon("images/orangeapple.png");
		JButton b2 = new JButton(img2);
		b2.setBorderPainted(false);// 클릭칸 없애고
		b2.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		b2.setBounds(110, 70, 70, 75);
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b2.setBounds(110, 75, 70, 75);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b2.setBounds(110, 70, 70, 75);
			}
		});

		ImageIcon img3 = new ImageIcon("images/yellowapple.png");
		JButton b3 = new JButton(img3);
		b3.setBorderPainted(false);// 클릭칸 없애고
		b3.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		b3.setBounds(200, 70, 70, 75);
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b3.setBounds(200, 75, 70, 75);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b3.setBounds(200, 70, 70, 75);
			}
		});

		ImageIcon img4 = new ImageIcon("images/greenapple.png");
		JButton b4 = new JButton(img4);
		b4.setBorderPainted(false);// 클릭칸 없애고
		b4.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		b4.setBounds(250, 120, 70, 75);
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b4.setBounds(250, 125, 70, 75);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b4.setBounds(250, 120, 70, 75);
			}
		});

		ImageIcon img5 = new ImageIcon("images/purpleapple.png");
		JButton b5 = new JButton(img5);
		b5.setBorderPainted(false);// 클릭칸 없애고
		b5.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		b5.setBounds(200, 200, 70, 75);
		b5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b5.setBounds(200, 205, 70, 75);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b5.setBounds(200, 200, 70, 75);
			}
		});

		ImageIcon img6 = new ImageIcon("images/pinkapple.png");
		JButton b6 = new JButton(img6);
		b6.setBorderPainted(false);// 클릭칸 없애고
		b6.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		b6.setBounds(110, 200, 70, 75);
		b6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b6.setBounds(110, 205, 70, 75);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b6.setBounds(110, 200, 70, 75);
			}
		});

		ImageIcon img7 = new ImageIcon("images/blackapple.png");
		JButton b7 = new JButton(img7);
		b7.setBorderPainted(false);// 클릭칸 없애고
		b7.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		b7.setBounds(150, 130, 75, 75);
		b7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b7.setBounds(150, 135, 75, 75);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b7.setBounds(150, 130, 75, 75);
			}
		});

		// 모형
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jb1.setText("모형입니다. 다시 고르세요.");
			}
		};
		// 다음에피소드
		ActionListener act2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jb1.setText("맛있는 사과입니다. 다음으로 넘어가세요");
				jb1.setFont(font);
				try {
					Thread.sleep(500);// 시간차두기
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode5();
				ep4_frame.dispose();
				f1.dispose();
			}
		};
		// 독사과 죽음
		ActionListener act3 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jb1.setText("독사과입니다. 당신은 죽었습니다.");
				jb1.setFont(font);
				try {
					Thread.sleep(500);// 시간차두기
					Main.backgroundMusic.stop();
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}

				new PosionAppleEnding();
				ep4_frame.dispose();
				f1.dispose();
			}
		};

		b1.addActionListener(act);
		b2.addActionListener(act);
		b3.addActionListener(act);
		b4.addActionListener(act);
		b5.addActionListener(act3);
		b6.addActionListener(act);
		b6.addActionListener(act);
		b7.addActionListener(act2);

		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.add(b5);
		f1.add(b6);
		f1.add(b7);
		f1.add(jb1);
		f1.add(b);

		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f1.dispose();

			}
		});
	}
}

package episode8;

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

public class Episode8_1 {
	
	public Episode8_1() {
		Frame f1 = new Frame("Episode8_1");
		f1.setBounds(550, 150, 900, 700);
		f1.setLayout(null);
		
		//폰트
		Font font = new Font("맑은 고딕", Font.BOLD, 25);
		Font font1 = new Font("맑은 고딕", Font.BOLD, 25);
		
		//배경
		ImageIcon img = new ImageIcon("images/prince_is_here.jpg");
		JLabel jb = new JLabel(img);
		jb.setBounds(0, 0, 900, 700);
		
		//글 레이블
		JLabel kiss = new JLabel("<html>이때 왕자가 등장하는데 공주를 살리려면 키스를 해야한다. 할것인가?</html>");
		kiss.setBounds(250, 480, 450, 100);
		kiss.setForeground(Color.black);
		kiss.setFont(font);
		
		//글 바 레이블
		JLabel kissBg = new JLabel(new ImageIcon("images/content.png"));
		kissBg.setBounds(200, 450, 529, 173);
		
		JButton b1 = new JButton(new ImageIcon("images/page.png"));
		JLabel story1 = new JLabel("<html>예<html/>");
		story1.setBounds(165, 305, 200, 30);
		b1.setBorderPainted(false);
		b1.setContentAreaFilled(false);//버튼 클릭 표시 없애기
//		b1.setBounds(600, 270, 200, 100);
		b1.setBounds(80, 270, 200, 100);
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b1.setBounds(80, 275, 200, 100);
				story1.setBounds(165, 310, 200, 30);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				b1.setBounds(80, 270, 200, 100);
				story1.setBounds(165, 305, 200, 30);
			}
		});
		
		
		JButton b2 = new JButton(new ImageIcon("images/page.png"));
		JLabel story2 = new JLabel("<html>아니오<html/>");
		story2.setBounds(680, 305, 200, 30);
		b2.setBorderPainted(false);
		b2.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		b2.setBounds(620, 270, 200, 100);
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				b2.setBounds(620, 275, 200, 100);
				story2.setBounds(680, 310, 200, 30);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				b2.setBounds(620, 270, 200, 100);
				story2.setBounds(680, 305, 200, 30);
			}
		});
		
		story1.setFont(font1);
		story2.setFont(font1);
		
		ActionListener act1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new PrinceDie();
				f1.dispose();
			}
		};
		
		ActionListener act2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new PrinceEnding();
				Main.backgroundMusic.stop();
				f1.dispose();
			}
		};
		
		b1.addActionListener(act1);//버튼클릭
		b2.addActionListener(act2);//버튼클릭
		
		
		f1.add(story1);
		f1.add(story2);
		f1.add(kiss);
		f1.add(kissBg);
		f1.add(b1);
		f1.add(b2);
		f1.add(jb);
		
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f1.dispose();
			}
		});
		
	}
}

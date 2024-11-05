package episode9;

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

public class Episode9 {

	Frame f;
	JButton nextBtn;
	
	public Episode9() {
		//TODO : 프레임 셋업
		f = new Frame("Episode 9");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);
		
		ImageIcon img = new ImageIcon("images/episode9_1.jpg");
		JLabel background = new JLabel(img);
		background.setBounds(0, 0, 900, 700);
		////////////////
		
		//TODO : 기본 컴포넌트 셋업
		JLabel j1 = new JLabel("<html>깨어난 공주는 쓰러진 왕자를 치료하기 위해 난쟁이들이 가져온"
							 + " 구급상자를 열어보려 시도하는데...!</html>");
		j1.setBounds(50, 50, 420, 200);
		Font font1 = new Font("맑은 고딕", Font.BOLD, 30);
		j1.setFont(font1);
		j1.setForeground(Color.WHITE);
		
		ImageIcon aed = new ImageIcon("images/emergency_kit.png");
		nextBtn = new JButton(aed);
		nextBtn.setBounds(150, 590, 200, 120);
		nextBtn.setContentAreaFilled(false);
		nextBtn.setBorderPainted(false);
		///////////////
		
		//TODO : 액션 리스너 셋업
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode9_1();
				f.dispose();
			}
		});
		nextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextBtn.setBounds(150, 585, 200, 120);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextBtn.setBounds(150, 590, 200, 120);
			}
		});
		////////////////////
		
		f.add(j1);
		f.add(nextBtn);
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

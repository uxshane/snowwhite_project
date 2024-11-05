package episode8;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import episode9.Episode9;
import main.Loader;
import main.Main;
import main.LoadGame;

public class PrinceDie {
	public PrinceDie() {
		
		JFrame f = new JFrame("PrinceDie");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);
		
		Font font = new Font("맑은 고딕", Font.BOLD, 25);//폰트
		
		ImageIcon img = new ImageIcon("images/prince44.jpg");//배경
		JLabel jb = new JLabel(img);
		jb.setBounds(0, 0, 900, 700);
		
		ImageIcon img1 = new ImageIcon("images/content.png");
		JLabel jb2 = new JLabel(img1);
		jb2.setBounds(160, 440, 600, 200);
		
		JButton nextBtn1 = new JButton();
		nextBtn1.setBorderPainted(false);// 클릭칸 없애고
		nextBtn1.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		nextBtn1.setBounds(0, 0, 900, 700);
		
		
		JLabel die = new JLabel("<html>왕자가 사과알레르기때문에 쓰러졌다!</html>");
		die.setBounds(250, 480, 450, 100);
		die.setForeground(Color.BLACK);
		die.setFont(font);
		
		f.add(die); //글
		f.add(nextBtn1);//버튼
		f.add(jb2);
		f.add(jb);//배경
		
		nextBtn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode9();
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

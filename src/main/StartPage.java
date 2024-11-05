package main;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import episode0.Episode0;

public class StartPage extends Frame{
	
	JLabel title, bg;
	JButton start;
	JButton again;
	JButton credit;
	
	public StartPage() {
		setBounds(550, 150, 800, 800);
		setLayout(null);
		
		//배경이미지
		bg = new JLabel(new ImageIcon("images/mainbg.jpg"));
		bg.setBounds(0, 0, 800, 800);
				
		//타이틀
		title = new JLabel(new ImageIcon("images/mainname.png"));
		title.setBounds(145, 30, 500, 440);
				
		//시작버튼
		start = new JButton(new ImageIcon("images/startbar.png"));
		start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		start.setBounds(300, 400, 200, 70);
		start.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.buttonMusic.btnPlay("sound/buttoneffect.wav");
				new SignUp();
				dispose();
			}
		});
		
		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				start.setBounds(305, 405, 190, 65);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				start.setBounds(300, 400, 200, 70);
			}
		});
		
		//이어보기버튼
		again = new JButton(new ImageIcon("images/loadbar.png"));
		again.setBorderPainted(false);
		again.setContentAreaFilled(false);
		again.setBounds(300, 500, 200, 70);
		again.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.buttonMusic.btnPlay("sound/buttoneffect.wav");
				new LoadGame();
				dispose();
			}
		});
		
		again.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				again.setBounds(305, 505, 190, 65);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				again.setBounds(300, 500, 200, 70);
			}
		});
		
		//크레딧 버튼
		credit = new JButton(new ImageIcon("images/creditbar.png"));
		credit.setBorderPainted(false);
		credit.setContentAreaFilled(false);
		credit.setBounds(300, 600, 200, 70);
		credit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.buttonMusic.btnPlay("sound/buttoneffect.wav");
				new CreditPage();
				dispose();
			}
		});
		
		credit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				credit.setBounds(305, 605, 190, 65);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				credit.setBounds(300, 600, 200, 70);
			}
		});
		
		add(title);
		add(start);
		add(again);
		add(credit);
		add(bg);
		
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				 new Episode0();
				System.exit(0);
			}
		});
	}//생성자
	
}//class




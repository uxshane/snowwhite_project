package main;

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

public class CreditPage extends Frame{
	
	JLabel bg;
	JLabel title;
	JLabel leader;
	JLabel member1;
	JLabel member2;
	JLabel member3;
	JButton returnBtn;
	
	public CreditPage() {
		setBounds(550, 150, 800, 800);
		setLayout(null);
		Font font = new Font("", Font.BOLD, 50);
		
		//배경이미지
		bg = new JLabel(new ImageIcon("images/creditbg.jpg"));
		bg.setBounds(0, 0, 800, 800);
		
		//타이틀
		title = new JLabel(new ImageIcon("images/creditname.png"));
		title.setBounds(250, 70, 300, 130);
		
		
		//조장
		leader = new JLabel(new ImageIcon("images/mjy.png"));
		leader.setBounds(310, 210, 180, 100);
		leader.setFont(font);
		
		//팀원1
		member1 = new JLabel(new ImageIcon("images/ksy.png"));
		member1.setBounds(310, 320, 180, 100);
		member1.setFont(font);
		
		//팀원2
		member2 = new JLabel(new ImageIcon("images/pyb.png"));
		member2.setBounds(310, 430, 180, 100);
		
		//팀원3
		member3 = new JLabel(new ImageIcon("images/kmg.png"));
		member3.setBounds(310, 540, 180, 100);
		member3.setFont(font);
		
		//돌아가기버튼
		returnBtn = new JButton(new ImageIcon("images/rtmainbtn.png"));
		returnBtn.setBorderPainted(false);
		returnBtn.setContentAreaFilled(false);
		returnBtn.setBounds(560, 660, 220, 100);
				
		returnBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.buttonMusic.btnPlay("sound/buttoneffect.wav");
				new StartPage();
				dispose();
			}
		});
		
		returnBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				returnBtn.setBounds(560, 665, 220, 100);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				returnBtn.setBounds(560, 660, 220, 100);
			}
		});
		
		add(title);
		add(leader);
		add(member1);
		add(member2);
		add(member3);
		add(returnBtn);
		add(bg);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setVisible(true);
		
	}//생성자
	
}//class

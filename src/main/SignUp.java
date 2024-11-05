package main;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import episode0.Episode0;


public class SignUp extends Frame{
	public static String ID;
	JLabel loginCheck;
	Saver save;
	
	JLabel title, bg;
	JButton start;

	public SignUp() {

		setBounds(550, 150, 800, 800);
		setLayout(null);

		//배경이미지
		bg = new JLabel(new ImageIcon("images/mainbg.jpg"));
		bg.setBounds(0, 0, 800, 800);

		//타이틀
		title = new JLabel(new ImageIcon("images/mainname.png"));
		title.setBounds(145, 30, 500, 440);

		//아이디 적는 칸
		TextField idField = new TextField();
		idField.setBounds(305, 350, 120, 35);
		Font font = new Font("", Font.BOLD, 30);
		idField.setFont(font);

		//로그인 status
		loginCheck = new JLabel();
		loginCheck.setBounds(0, 0, 0, 0);
		Font font2 = new Font("", Font.BOLD, 20);
		loginCheck.setFont(font2);
		loginCheck.setForeground(Color.MAGENTA);
		
		//시작버튼
		start = new JButton(new ImageIcon("images/startbar.png"));
		start.setBorderPainted(false);
		start.setContentAreaFilled(false);
		start.setBounds(300, 450, 200, 70);
		
		start.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				start.setBounds(305, 455, 190, 65);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				start.setBounds(300, 450, 200, 70);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Main.buttonMusic.btnPlay("sound/buttoneffect.wav");
				//ID = idField.getText();
				//아이디가 파일에 존재하는지 확인필요
				if(loginCheck.getText().equals("회원가입 성공!")) {
						new Episode0();
						dispose();
				} else {
					loginCheck.setText("회원가입 먼저 하십쇼 휴먼");
					JOptionPane.showMessageDialog(null,"회원가입 먼저 하십쇼 휴먼");
				}
			}
		});

		//로그인 버튼
		JButton logBtn = new JButton(new ImageIcon("images/ga.png"));
		logBtn.setBounds(435, 350, 70, 35);
		logBtn.setBorderPainted(false);
		logBtn.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		logBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.buttonMusic.btnPlay("sound/buttoneffect.wav");
				ID = idField.getText();

				if(!ID.equals("")) {
					save = new Saver(ID);
					if(save.exist) {
						loginCheck.setText("아이디가 존재합니다! 로그인 화면을 이용하세요");
						JOptionPane.showMessageDialog(null,"아이디가 존재합니다! 로그인 화면을 이용하세요");
					} else {
						loginCheck.setText("회원가입 성공!");
						JOptionPane.showMessageDialog(null,"회원가입 성공!");
					}
				} else {
					loginCheck.setText("아이디를 입력하세요");
					JOptionPane.showMessageDialog(null,"아이디를 입력하세요");
				}
			}
		});
		logBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				logBtn.setBounds(435, 352, 70, 35);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				logBtn.setBounds(435, 350, 70, 35);
			}
		});

		//돌아가기버튼
		JButton returnBtn = new JButton(new ImageIcon("images/rtmainbtn.png"));
		returnBtn.setBounds(500, 680, 300, 100);
		returnBtn.setBorderPainted(false);
		returnBtn.setContentAreaFilled(false);

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
				returnBtn.setBounds(500, 685, 300, 100);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				returnBtn.setBounds(500, 680, 300, 100);
			}
		});

		add(returnBtn);
		add(idField);
		add(logBtn);
		add(loginCheck);
		add(title);
		add(start);
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








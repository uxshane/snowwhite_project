package episode7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import main.Main;


public class Episode7_1 {
	public Episode7_1() {
		JFrame f = new JFrame("Episode7_1");
		f.setLayout(null);
		f.setResizable(false);
		f.setBounds(550, 150, 900, 700);
		
		//배경이미지
		ImageIcon img = new ImageIcon("images/miss_apple.jpg");
		JLabel jImg = new JLabel(img);
		jImg.setBounds(0, 0, 900, 700);
		
		//버튼
		JButton btn = new JButton(img);
		btn.setBounds(0, 0, 900, 700);
		
		//다음장면으로 넘어가는 버튼 이벤트
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode7_2();
				f.dispose();
				
			}
		});
				
		
		f.add(jImg);
		f.add(btn);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
}

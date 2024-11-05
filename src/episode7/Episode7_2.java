package episode7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import episode8.Episode8;
import main.Main;

public class Episode7_2 {
	public Episode7_2() {
		
		JFrame f1 = new JFrame("Episode7_1");
		f1.setBounds(550, 150, 900, 700);
		f1.setLayout(null);
		
		ImageIcon imgBack = new ImageIcon("images/there_is_apple.jpg");//이미지
		
		JButton btn2 = new JButton(imgBack);//버튼페이지
		btn2.setBorderPainted(false);//버튼 클릭 표시 없애기
		btn2.setBounds(0, 0, 900, 700);// 이미지 셋팅
		
		f1.add(btn2);//버튼페이지 프레임 넣기
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode7_3();
				f1.dispose();
			}	
		});
		
		f1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new Episode7_3();
				f1.dispose(); //잠깐 오류나서 그럼
			}
		});
		
		f1.setVisible(true);
		
	}	
	
}

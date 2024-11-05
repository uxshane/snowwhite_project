package episode0;

//import java.awt.Button;
//import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import episode1.Episode1;
import main.Main;

public class Episode0 {
	public Episode0() {
		Main.backgroundMusic.close();
		Main.backgroundMusic.bgPlay("sound/episode1_2bgm.wav");
		
		JFrame f1 = new JFrame("Episode0");
		f1.setBounds(550, 150, 900, 700);
		f1.setLayout(null);
		
		ImageIcon imgBack = new ImageIcon("images/episode1.jpg");//이미지
		
		JButton btn2 = new JButton(imgBack);//버튼페이지
		btn2.setBorderPainted(false);//버튼 클릭 표시 없애기
		btn2.setBounds(0, 0, 900, 700);// 이미지 셋팅
		
		f1.add(btn2);//버튼페이지 프레임 넣기
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode1();
				f1.dispose();
			}	
		});
		
		f1.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f1.dispose(); //잠깐 오류나서 그럼
			}
		});
		
//		f.setVisible(true);
		f1.setVisible(true);
		
	}//Part0()
}

package episode3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import main.Main;

public class Episode3_1 {
	JFrame f;

	public Episode3_1() {
		//TODO : 메인 프레임 셋팅
				f = new JFrame("Episode 3_1");
				f.setLayout(null);
				f.setBounds(550, 150, 900, 700);
				ImageIcon img = new ImageIcon("images/snow_white_houseWork.jpg");
				/////////////////////

				//TODO : 컴포넌트들
				JButton nextBtn = new JButton(img);
				nextBtn.setBounds(0, 0, 900, 700);
				
				////////////////

				//TODO : 필요한 리스너들
				nextBtn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Main.booksound.btnPlay("sound/booksound.wav");
						new Episode3_2();
						f.dispose();
					}
				});
				////////////////////

				//TODO :모두 합치기
				f.add(nextBtn);
				////////////////

				f.setVisible(true);

				f.addWindowListener(new WindowAdapter() {
					@Override
					public void windowClosing(WindowEvent e) {
						f.dispose();
					}
				});

	}

}

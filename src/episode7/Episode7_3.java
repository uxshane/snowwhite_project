package episode7;

import java.awt.Button;
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

import episode8.Episode8;
import main.Main;

public class Episode7_3{

	public Episode7_3() {

		//프레임
		JFrame f = new JFrame("Episode7_2");
		f.setLayout(null);
		f.setResizable(false);
		f.setBounds(550, 150, 900, 700);
		
		//배경이미지
		ImageIcon img = new ImageIcon("images/bite_poisonapple.jpg");
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
				new Episode7_4();
				f.dispose();
				
			}
		});
				
		
		f.add(btn);
		f.add(jImg);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new Episode7_4();
				f.dispose();
			}
		});

	}
}

package episode5;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import episode6.Episode6;
import main.Main; 

public class Episode5_5 {

	public Episode5_5() {
		Frame f = new Frame("Episode5_5");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);

		ImageIcon imgBack = new ImageIcon("images/hair_story.jpg");
		JLabel j1 = new JLabel(imgBack);
		j1.setBounds(0, 0, 900, 700);
		
		JButton btn1 = new JButton(imgBack);
		btn1.setBounds(0, 0, 900, 700);


		f.add(j1);
		f.add(btn1);

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode6(); //스토리 뒤에 바로 허리띠를 팔러 온 상인 이야기로 이어진다.
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

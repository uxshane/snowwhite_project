package episode4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import main.Main;

public class Episode4 {
		
	public Episode4() {
		Main.backgroundMusic.close();
		Main.backgroundMusic.bgPlay("sound/episode4~6bgm.wav");
		//프레임 
		JFrame f = new JFrame("Episode4");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);
		
		//배경이미지
		
		//버튼
		ImageIcon imgBsk = new ImageIcon("images/applebackground.jpg");
		JButton btnBsk = new JButton(imgBsk);
		btnBsk.setBorderPainted(false);
		btnBsk.setContentAreaFilled(false);//버튼 클릭 표시 없애기
		btnBsk.setBounds(0, 0, 900, 700);
		
		
		//사과 고르는 프레임으로 이동
		ActionListener act = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new AppleChoice(f);
			}
		};
		
		btnBsk.addActionListener(act);
				

		f.add(btnBsk);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
				
			}
		});
	}

}
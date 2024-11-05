package episode3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import episode4.Episode4;
import main.Main;

public class AED implements Runnable{
	Frame f;
	JLabel j1;
	int cnt = 0;
	private JLabel timerLabel;
	private Thread timerThread;
	private boolean running = true;
	private String killer;
	
	public AED(String killer) {
		this.killer = killer;
		//TODO : 메인 프레임 셋팅
		f = new Frame ("Episode 3_3");
		f.setLayout(null);
		f.setBounds(550, 150, 900, 700);
		ImageIcon houseImg = new ImageIcon("images/ep3houseinside.jpg");
		JLabel background = new JLabel(houseImg);
		background.setBounds(0, 0, 900, 700);
		/////////////////////

		//TODO : 컴포넌트들
		Font font1 = new Font("궁서", Font.BOLD, 50);
		String book = "<html>헉! 책을 정리하다 손가락이 베여 출혈이 멈추지 않는다!</html>";
		String flower = "<html>헉! 꽃병을 떨어뜨려서 깨진 조각이 복부에 박혔다!</html>";
		String pick = "<html>헉! 녹슨 곡괭이를 휘두르다 긁혀서 파상풍에 걸렸다!</html>";

		if(killer.equals("book")) {
			j1 = new JLabel(book);
		} else if(killer.equals("flower")) {
			j1 = new JLabel(flower);
		} else {
			j1 = new JLabel(pick);
		}
		j1.setBounds(200, 200, 500, 300);
		j1.setFont(font1);
		j1.setForeground(Color.RED);

		//타이머 레이블
		timerLabel = new JLabel();
		timerLabel.setFont(font1);
		timerLabel.setBounds(600, 500, 200, 100);
		timerLabel.setForeground(Color.WHITE);

		ImageIcon aedImg = new ImageIcon("images/aed3.png");
		JButton aedBtn = new JButton(aedImg);
		aedBtn.setBounds(700, 100, 150, 99);

	
		////////////////

		//TODO :모두 합치기
		f.add(j1);
		f.add(timerLabel);
		f.add(background);
		f.add(aedBtn);
		////////////////

		//TODO : 리스너들
		aedBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode4();
				running = false;
				f.dispose();
			}
		});
		///////////////

		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {

				f.dispose();
			}
		});

		startTimer();
	}//생성자

	public void startTimer() {
		if (timerThread == null) {
			timerThread = new Thread(this);
			running = true;
			timerThread.start();
		}
	}

	public void stopTimer() {
		running = false;
		if (timerThread != null) {
			timerThread = null;
		}
	}

	@Override
	public void run() {
		int seconds = 6;
		while (running) {
			String time = String.format("%d", seconds-1);
			timerLabel.setText(time);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			seconds--;
			if(running == false) {
				stopTimer();
			}
			if(seconds == 0) {
				stopTimer();
				new Episode3_Death(killer);
				Main.backgroundMusic.stop();
				f.dispose();
			}
		}
	}

}





















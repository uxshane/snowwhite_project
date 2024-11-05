package episode9;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import main.Main;

public class Episode9_1 {

	Random rnd = new Random();
	String[] words = {"watermelon",
					  "strawberry", 
					  "blueberry", 
					  "grapefruit", 
					  "persimmon"};
	int count = 0;

	String answer = words[rnd.nextInt(words.length)];
	char[] cWord;
	String cString;
	String typedInput;

	JFrame f;
	JLabel wordPuzzle;
	JLabel statusCheck;
	JButton nextBtn;
	JLabel[] apples;
	JLabel nextLabel;

	public Episode9_1() {
		//TODO : 프레임 셋업
		f = new JFrame("Episode 9");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);

		ImageIcon img = new ImageIcon("images/kit_background.png");
		JLabel background = new JLabel(img);
		background.setBounds(0, 0, 900, 700);
		
		ImageIcon story1 = new ImageIcon("images/content2.png");
		JLabel storyback = new JLabel(story1);
		storyback.setBounds(130, 70, 600, 100);
		
		ImageIcon story2 = new ImageIcon("images/content3.png");
		JLabel storyback2 = new JLabel(story2);
		storyback2.setBounds(240, 505, 400, 80);
		////////////////

		//TODO : 기본 컴포넌트 셋업
		JLabel j1 = new JLabel("<html>헉! 단어를 맞춰야 열리는 상자다! "
				+ "맞춰보자!</html>");
		j1.setBounds(180, 100, 600, 30);
		Font font1 = new Font("맑은 고딕", Font.BOLD, 25);
		j1.setFont(font1);
		j1.setForeground(Color.BLACK);
		
		wordPuzzle = new JLabel();
		//wordPuzzle.setBounds(200, 300, 600, 100);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 50);
		wordPuzzle.setFont(font2);
		wordPuzzle.setForeground(Color.CYAN);

		JTextField input = new JTextField();
		input.setBounds(430, 400, 50, 80);
		input.setFont(font2);

		statusCheck = new JLabel("빈칸에 값을 입력하세요");
		statusCheck.setBounds(330, 520, 300, 50);
		Font font3 = new Font("맑은 고딕", Font.BOLD, 20);
		statusCheck.setFont(font3);
		statusCheck.setForeground(Color.RED);

		JLabel congrat = new JLabel();
		congrat.setBounds(300, 550, 100, 40);
		congrat.setFont(font1);
		congrat.setForeground(Color.ORANGE);
		
		///////////////

		//TODO : 키 리스너 셋업
		apples = new JLabel[answer.length()];
		cWord = new char[answer.length()];
//		wordPuzzle.setBounds((900 + cWord.length*90)/cWord.length, 300, 600, 100);
		for(int i = 0; i < apples.length; i++) {
			apples[i] = new JLabel(new ImageIcon("images/apple_word.png"));
			apples[i].setBounds((i*70 + 100), 250, 70, 100);
			f.add(apples[i]);
		}
		cString = String.valueOf(cWord);
		wordPuzzle.setText(cString);

		input.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
					typedInput = input.getText();
					wordGame();
					input.setText("");
					compare();
				}
			}

			public void compare() {
				if(answer.equals(cString)) {
					nextBtn.setBounds(650, 502, 200, 100);
					nextBtn.setContentAreaFilled(false);
					nextBtn.setBorderPainted(false);
					Font btnFont = new Font("맑은 고딕", Font.BOLD, 30);
					
					nextLabel.setBounds(715, 515, 150, 70);
					nextLabel.setFont(btnFont);
					nextLabel.setForeground(Color.BLACK);
				}
			}
		});
		
		nextLabel = new JLabel("다음");
		nextBtn = new JButton(new ImageIcon("images/page.png"));
		
		nextBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.booksound.btnPlay("sound/booksound.wav");
				new Episode9_2();
				f.dispose();
			}
		});
		
		nextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				nextBtn.setBounds(650, 507, 200, 100);
				nextLabel.setBounds(715, 520, 150, 70);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				nextBtn.setBounds(650, 500, 200, 100);
				nextLabel.setBounds(715, 510, 150, 70);
			}
		});

		////////////////////

		f.add(j1);
//		f.add(wordPuzzle);
		f.add(storyback);
		f.add(statusCheck);
		f.add(storyback2);
		f.add(nextLabel);
		f.add(nextBtn);
		f.add(congrat);
		f.add(input);
		f.add(background);

		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		f.setVisible(true);
	}

	public void wordGame() {
		char in = typedInput.charAt(0);
		if(in < 'a' || in > 'z' || typedInput.length() > 1) {
			statusCheck.setText("한글자의 영소문자만 입력");
		} else if(cString.indexOf(in) != -1) {
			statusCheck.setText("이미 입력한 글자입니다");
		} else {
			boolean found = false;
			cString = "";
			for(int i = 0; i < answer.length(); i++) {
				if(answer.charAt(i) == in) {
					
					cWord[i] = in;
					apples[i].setIcon(null);
					apples[i].setText(typedInput);
					apples[i].setFont(new Font("맑은 고딕", Font.BOLD, 70));
					apples[i].setForeground(Color.RED);
					found = true;
				}
				cString += cWord[i];
			}
			if(!found) {
				statusCheck.setText(in + "은(는) 없습니다!");
			}
		}
	}//wordGame()
}//class














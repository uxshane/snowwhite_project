package main;

import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import episode0.Episode0;
import episode1.Episode1;
import episode2.Episode2_1;
import episode3.Episode3_2;
import episode4.Episode4;
import episode5.Episode5;
import episode6.Episode6;
import episode8.Episode8_1;
import episode9.Episode9;

public class EndingFrame {
	
	JFrame f;
	JLabel bg;
	JButton nextBtn;
	int episode;
	
	public EndingFrame(int episode, Frame prevFrame) {
		this.episode = episode;
		f = new JFrame("EndingFrame");
		f.setBounds(550, 150, 900, 700);
		f.setLayout(null);
		
		if(episode == 0) {
			bg = new JLabel(new ImageIcon("images/Hunter_Ending_real.jpg"));
			bg.setBounds(0, 0, 900, 700);
			nextBtn = new JButton(new ImageIcon("images/loadbar.png"));
			nextBtn.setBounds(620, 550, 200, 70);
			nextBtn.setContentAreaFilled(false);
			nextBtn.setBorderPainted(false);
			nextBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Main.backgroundMusic.close();
					Main.backgroundMusic.bgPlay("sound/episode1_2bgm.wav");
					new Episode1();
					f.dispose();
					prevFrame.dispose();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn.setBounds(620, 555, 200, 70);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn.setBounds(620, 550, 200, 70);
				}
			});
		}//if
		
		if(episode == 1) {
			bg = new JLabel(new ImageIcon("images/streetdead.jpg"));
			bg.setBounds(0, 0, 900, 700);
			nextBtn = new JButton(new ImageIcon("images/loadbar.png"));
			nextBtn.setBounds(620, 550, 200, 70);
			nextBtn.setContentAreaFilled(false);
			nextBtn.setBorderPainted(false);
			nextBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Main.backgroundMusic.close();
					Main.backgroundMusic.bgPlay("sound/episode1_2bgm.wav");
					new Episode2_1();
					f.dispose();
					prevFrame.dispose();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn.setBounds(620, 555, 200, 70);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn.setBounds(620, 550, 200, 70);
				}
			});
		}//if
		
		if(episode == 2) {
			bg = new JLabel(new ImageIcon("images/blood_ending_real.jpg"));
			bg.setBounds(0, 0, 900, 700);
			nextBtn = new JButton(new ImageIcon("images/loadbar.png"));
			nextBtn.setBounds(620, 550, 200, 70);
			nextBtn.setContentAreaFilled(false);
			nextBtn.setBorderPainted(false);
			nextBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Main.backgroundMusic.close();
					Main.backgroundMusic.bgPlay("sound/episode3bgm.wav");
					new Episode3_2();
					f.dispose();
					prevFrame.dispose();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn.setBounds(620, 555, 200, 70);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn.setBounds(620, 550, 200, 70);
				}
			});
		}//if
		
		if(episode == 3) {
			bg = new JLabel(new ImageIcon("images/poison_apple_ending_real.jpg"));
			bg.setBounds(0, 0, 900, 700);
			nextBtn = new JButton(new ImageIcon("images/loadbar.png"));
			nextBtn.setBounds(620, 550, 200, 70);
			nextBtn.setContentAreaFilled(false);
			nextBtn.setBorderPainted(false);
			nextBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Main.backgroundMusic.close();
					Main.backgroundMusic.bgPlay("sound/episode4~6bgm.wav");
					new Episode4();
					f.dispose();
					prevFrame.dispose();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn.setBounds(620, 555, 200, 70);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn.setBounds(620, 550, 200, 70);
				}
			});
		}//if
		
		if(episode == 4) {
			bg = new JLabel(new ImageIcon("images/comb_bad_ending_real.jpg"));
			bg.setBounds(0, 0, 900, 700);
			nextBtn = new JButton(new ImageIcon("images/loadbar.png"));
			nextBtn.setBounds(620, 550, 200, 70);
			nextBtn.setContentAreaFilled(false);
			nextBtn.setBorderPainted(false);
			nextBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Main.backgroundMusic.close();
					Main.backgroundMusic.bgPlay("sound/episode4~6bgm.wav");
					new Episode5();
					f.dispose();
					prevFrame.dispose();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn.setBounds(620, 555, 200, 70);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn.setBounds(620, 550, 200, 70);
				}
			});
		}//if
		
		if(episode == 5) {
			bg = new JLabel(new ImageIcon("images/corset_ending_real.jpg"));
			bg.setBounds(0, 0, 900, 700);
			nextBtn = new JButton(new ImageIcon("images/loadbar.png"));
			nextBtn.setBounds(620, 550, 200, 70);
			nextBtn.setContentAreaFilled(false);
			nextBtn.setBorderPainted(false);
			nextBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Main.backgroundMusic.close();
					Main.backgroundMusic.bgPlay("sound/episode4~6bgm.wav");
					new Episode6();
					f.dispose();
					prevFrame.dispose();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn.setBounds(620, 555, 200, 70);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn.setBounds(620, 550, 200, 70);
				}
			});
		}//if
		
		if(episode == 6) {
			bg = new JLabel(new ImageIcon("images/prince_bad_ending_real.jpg"));
			bg.setBounds(0, 0, 900, 700);
			nextBtn = new JButton(new ImageIcon("images/loadbar.png"));
			nextBtn.setBounds(620, 550, 200, 70);
			nextBtn.setContentAreaFilled(false);
			nextBtn.setBorderPainted(false);
			nextBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Main.backgroundMusic.close();
					Main.backgroundMusic.bgPlay("sound/episode8bgm.wav");
					new Episode8_1();
					f.dispose();
					prevFrame.dispose();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn.setBounds(620, 555, 200, 70);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn.setBounds(620, 550, 200, 70);
				}
			});
		}//if
		
		if(episode == 7) {
			bg = new JLabel(new ImageIcon("images/happy_ending.jpg"));
			bg.setBounds(0, 0, 900, 700);
			nextBtn = new JButton(new ImageIcon("images/loadbar.png"));
			nextBtn.setBounds(620, 550, 200, 70);
			nextBtn.setContentAreaFilled(false);
			nextBtn.setBorderPainted(false);
			nextBtn.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					Main.backgroundMusic.close();
					Main.backgroundMusic.bgPlay("sound/episode8bgm.wav");
					new Episode9();
					f.dispose();
					prevFrame.dispose();
				}
				@Override
				public void mouseEntered(MouseEvent e) {
					nextBtn.setBounds(620, 555, 200, 70);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					nextBtn.setBounds(620, 550, 200, 70);
				}
			});
		}//if
		
		f.add(nextBtn);
		f.add(bg);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
	
}
















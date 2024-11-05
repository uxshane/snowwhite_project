package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import episode0.Episode0;
import episode1.HunterEnding;
import episode2.Episode2_2;
import episode3.Episode3_Death;
import episode4.PosionAppleEnding;
import episode5.OpenDie;
import episode6.CorsetEnding;
import episode8.PrinceDie;
import episode9.HappyEnding;

public class EndingCredit extends Frame{

	JLabel bg;
	JButton end0, end1, end2, end3, end4, end5, end6, end7;
	Loader load;
	boolean[] badEnding;
	int episode;

	public EndingCredit() {
		load = new Loader(LoadGame.ID);
		badEnding = load.user.badEnding;

		setBounds(550, 150, 900, 700);
		setLayout(null);

		bg = new JLabel(new ImageIcon("images/ending_all_background.jpg"));
		bg.setBounds(0, 0, 900, 700);

		if(badEnding[0] == true) {
			end0 = new JButton(new ImageIcon("images/hunter_ending_frame.jpg"));
		} else {
			end0 = new JButton(new ImageIcon("images/empty_frame.jpg"));
		}
		end0.setBorderPainted(false);
		end0.setContentAreaFilled(false);
		end0.setBounds(100, 100, 150, 224);
		
		end0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(badEnding[0] == true) {
					Main.frameclick.btnPlay("sound/frameclick.wav");
					episode = 0;
					new EndingFrame(episode, EndingCredit.this);
				} else {
					System.out.println("ending not seen");
				}
			}
		});

		end0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				end0.setBounds(100, 105, 150, 224);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				end0.setBounds(100, 100, 150, 224);
			}
		});


		if(badEnding[1] == true) {
			end1 = new JButton(new ImageIcon("images/open_door_ending_frame.jpg"));
		} else {
			end1 = new JButton(new ImageIcon("images/empty_frame.jpg"));
		}
		end1.setBorderPainted(false);
		end1.setContentAreaFilled(false);
		end1.setBounds(230, 100, 150, 224);
		end1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(badEnding[1] == true) {
					Main.frameclick.btnPlay("sound/frameclick.wav");
					episode = 1;
					new EndingFrame(episode, EndingCredit.this);
				} else {
					System.out.println("ending not seen");
				}
			}
		});
		end1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				end1.setBounds(230, 105, 150, 224);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				end1.setBounds(230, 100, 150, 224);
			}
		});

		if(badEnding[2] == true) {
			end2 = new JButton(new ImageIcon("images/blood_ending_frame.jpg"));
		} else {
			end2 = new JButton(new ImageIcon("images/empty_frame.jpg"));
		}
		end2.setBorderPainted(false);
		end2.setContentAreaFilled(false);
		end2.setBounds(360, 100, 150, 224);
		end2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(badEnding[2] == true) {
					Main.frameclick.btnPlay("sound/frameclick.wav");
					episode = 2;
					new EndingFrame(episode, EndingCredit.this);
				} else {
					System.out.println("ending not seen");
				}
			}
		});
		end2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				end2.setBounds(360, 105, 150, 224);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				end2.setBounds(360, 100, 150, 224);
			}
		});

		if(badEnding[3] == true) {
			end3 = new JButton(new ImageIcon("images/poison_ending_frame.jpg"));
		} else {
			end3 = new JButton(new ImageIcon("images/empty_frame.jpg"));
		}
		end3.setBorderPainted(false);
		end3.setContentAreaFilled(false);
		end3.setBounds(490, 100, 150, 224);
		end3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(badEnding[3] == true) {
					Main.frameclick.btnPlay("sound/frameclick.wav");
					episode = 3;
					new EndingFrame(episode, EndingCredit.this);
				} else {
					System.out.println("ending not seen");
				}
			}
		});
		end3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				end3.setBounds(490, 105, 150, 224);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				end3.setBounds(490, 100, 150, 224);
			}
		});

		if(badEnding[4] == true) {
			end4 = new JButton(new ImageIcon("images/comb_ending_frame.jpg"));
		} else {
			end4 = new JButton(new ImageIcon("images/empty_frame.jpg"));
		}
		end4.setBorderPainted(false);
		end4.setContentAreaFilled(false);
		end4.setBounds(100, 400, 150, 224);
		end4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(badEnding[4] == true) {
					Main.frameclick.btnPlay("sound/frameclick.wav");
					episode = 4;
					new EndingFrame(episode, EndingCredit.this);
				} else {
					System.out.println("ending not seen");
				}
			}
		});
		end4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				end4.setBounds(100, 405, 150, 224);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				end4.setBounds(100, 400, 150, 224);
			}
		});

		if(badEnding[5] == true) {
			end5 = new JButton(new ImageIcon("images/corset_ending_frame.jpg"));
		} else {
			end5 = new JButton(new ImageIcon("images/empty_frame.jpg"));
		}
		end5.setBorderPainted(false);
		end5.setContentAreaFilled(false);
		end5.setBounds(230, 400, 150, 224);
		end5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(badEnding[5] == true) {
					Main.frameclick.btnPlay("sound/frameclick.wav");
					episode = 5;
					new EndingFrame(episode, EndingCredit.this);
				} else {
					System.out.println("ending not seen");
				}
			}
		});
		end5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				end5.setBounds(230, 405, 150, 224);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				end5.setBounds(230, 400, 150, 224);
			}
		});

		if(badEnding[6] == true) {
			end6 = new JButton(new ImageIcon("images/prince_ending_frame.jpg"));
		} else {
			end6 = new JButton(new ImageIcon("images/empty_frame.jpg"));
		}
		end6.setBorderPainted(false);
		end6.setContentAreaFilled(false);
		end6.setBounds(360, 400, 150, 224);
		end6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(badEnding[6] == true) {
					Main.frameclick.btnPlay("sound/frameclick.wav");
					episode = 6;
					new EndingFrame(episode, EndingCredit.this);
				} else {
					System.out.println("ending not seen");
				}
			}
		});
		end6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				end6.setBounds(360, 405, 150, 224);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				end6.setBounds(360, 400, 150, 224);
			}
		});

		//////////////////////////////////////////////여기!
		if(badEnding[7] == true) {
			end7 = new JButton(new ImageIcon("images/happy_ending_frame.jpg"));
		} else {
			end7 = new JButton(new ImageIcon("images/empty_frame.jpg"));
		}
		end7.setBorderPainted(false);
		end7.setContentAreaFilled(false);
		end7.setBounds(490, 400, 150, 224);
		end7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(badEnding[7] == true) {
					Main.frameclick.btnPlay("sound/frameclick.wav");
					episode = 7;
					new EndingFrame(episode, EndingCredit.this);
				} else {
					System.out.println("ending not seen");
				}
			}
		});
		end7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				end7.setBounds(490, 405, 150, 224);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				end7.setBounds(490, 400, 150, 224);
			}
		});

		//돌아가기버튼
		JButton returnBtn = new JButton(new ImageIcon("images/rtmainbtn.png"));
		returnBtn.setBounds(620, 210, 300, 100);
		returnBtn.setBorderPainted(false);
		returnBtn.setContentAreaFilled(false);

		returnBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.buttonMusic.btnPlay("sound/buttoneffect.wav");
				new StartPage();
				dispose();
			}
		});

		returnBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				returnBtn.setBounds(620, 215, 300, 100);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				returnBtn.setBounds(620, 210, 300, 100);
			}
		});
		
		JButton starBtn = new JButton(new ImageIcon("images/page.png"));
		starBtn.setBounds(620, 410, 300, 100);
		starBtn.setBorderPainted(false);
		starBtn.setContentAreaFilled(false);
		Font font2 = new Font("맑은 고딕", Font.BOLD, 30);
		JLabel startBtnlb = new JLabel("처음부터");
		startBtnlb.setForeground(Color.BLACK);
		startBtnlb.setFont(font2);
		startBtnlb.setBounds(710, 410, 300, 100);

		starBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.buttonMusic.btnPlay("sound/buttoneffect.wav");
				new Episode0();
				dispose();
			}
		});

		starBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				starBtn.setBounds(620, 415, 300, 100);
				startBtnlb.setBounds(710, 415, 300, 100);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				starBtn.setBounds(620, 410, 300, 100);
				startBtnlb.setBounds(710, 410, 300, 100);
			}
		});

		add(end0);
		add(end1);
		add(end2);
		add(end3);
		add(end4);
		add(end5);
		add(end6);
		add(end7);
		add(startBtnlb);
		add(returnBtn);
		add(starBtn);
		add(bg);

		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				new Episode0();
				System.exit(0);
			}
		});
	}

}














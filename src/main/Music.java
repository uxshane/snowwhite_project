package main;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {

	AudioInputStream ais = null;
	String fileName;
	Clip clip;

	public void bgPlay(String filename) {		
		this.fileName = filename;
		try {
			ais = AudioSystem.getAudioInputStream(new File(fileName));
			clip = AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void btnPlay(String filename) {
		this.fileName = filename;
		try {
			ais = AudioSystem.getAudioInputStream(new File(fileName));
			clip = AudioSystem.getClip();
			clip.stop();
			clip.open(ais);
			clip.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void stop() {
		if(clip.isRunning()) {
			clip.stop();
		}
	}

	public void start() {
		if(!clip.isRunning()) {
			clip.start();
		}
	}

	public void close() {
		clip.close();
	}

}

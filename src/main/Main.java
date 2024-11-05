package main;

public class Main {
	
	public static Music backgroundMusic;
	public static Music buttonMusic = new Music();
	public static Music frameclick = new Music();
	public static Music booksound = new Music();
	
	public static void main(String[] args) {
		
		new StartPage();
		backgroundMusic = new Music();
		backgroundMusic.bgPlay("sound/soundtrack1.wav");
		
	}//main
}//class
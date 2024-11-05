package main;

public class Main2 {
	public static void main(String[] args) {
		
		Loader load = new Loader("kim");
		for(int i = 0; i < load.user.badEnding.length; i++) {
			System.out.print(load.user.badEnding[i] + " / ");
		}
		
	}
}

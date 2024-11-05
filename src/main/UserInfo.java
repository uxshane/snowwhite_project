package main;

import java.io.Serializable;

import episode0.Episode0;
import episode1.Episode1;
import episode2.Episode2_1;
import episode3.Episode3_2;
import episode4.Episode4;
import episode5.Episode5;
import episode6.Episode6;
import episode8.Episode8_1;
import episode9.HappyEnding;

public class UserInfo implements Serializable{

	private String id;
	int episode = 0;
	public boolean[] badEnding = new boolean[8];
	//false
	public UserInfo(String id) {
		this.id = id;
	}
	
//	public void endingFinder() {
//		oo: for(int i = 0; i < badEnding.length; i++) {
//			if(badEnding[i] == true) {
//				for(int j = i+1; j < badEnding.length; j++) {
//					if(badEnding[j] == true) {
//						continue oo;
//					}
//				}
//				episode = i;
//				break;
//			}
//		}//for
//	}
//	
//	public void loadEpisode() {
//		switch(episode) {
//		case 0:
//			new Episode0();
//			break;
//		case 1:
//			new Episode2_1();
//			break;	
//		case 2:
//			new Episode3_2();
//			break;	
//		case 3:
//			new Episode4();
//			break;	
//		case 4:
//			new Episode5();
//			break;	
//		case 5:
//			new Episode6();
//			break;	
//		case 6:
//			new Episode8_1();
//			break;	
//		case 7:
//			new HappyEnding();
//			break;	
//		}
//	}

}

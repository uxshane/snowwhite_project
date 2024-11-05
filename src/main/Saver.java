package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Saver {
	
	private String id;
	UserInfo user;
	boolean exist;
	
	public Saver(String id) {
		this.id = id;
		user = new UserInfo(id);
		save();
	}
	
	public void save() {
		String path = "C:/Users/user1/java_kmk/SnowWhiteUsers/" + id + "/UserInfo.sav";
		File f = new File("C:/Users/user1/java_kmk/SnowWhiteUsers/" + id);
		
		if(!f.exists()) {
			f.mkdirs();
			
			ObjectOutputStream oos = null;
			FileOutputStream fos = null;
			
			try {
				fos = new FileOutputStream(path);
				oos = new ObjectOutputStream(fos);
				
				oos.writeObject(user);
				System.out.println("save successfully!");
				
			} catch (Exception e) {
				System.out.println("failed to save!");
				e.printStackTrace();
			} finally {
				try {
					oos.close();
					fos.close();
				} catch (IOException e) {
					System.out.println("unable to shut down!");
				}
			}
		} else {
			exist = true;
			System.out.println("id exists!");
		}
		
	}//save()
	
}//class










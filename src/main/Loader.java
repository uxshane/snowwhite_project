package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Loader {

	public UserInfo user;
	private String id;
	boolean exist = true;

	public Loader(String id) {
		this.id = id;
		user = new UserInfo(id);
		load();
	}//생성자

	public void load() {
		String path = "C:/Users/user1/java_kmk/SnowWhiteUsers/" + id + "/UserInfo.sav";
		File f = new File(path);

		if(f.exists()) {
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			try {
				fis = new FileInputStream(f);
				ois = new ObjectInputStream(fis);

				user = (UserInfo) ois.readObject();
				exist = true;
			} catch (Exception e) {
				System.out.println("failed to load");
			} finally {
				try {
					ois.close();
					fis.close();
				} catch (IOException e) {
					System.out.println("unable to shut down the hallway");
				}
			}
		} else {
			exist = false;
			System.out.println("id not found");
		}

	}//load()

	public void save() {
		String path = "C:/Users/user1/java_kmk/SnowWhiteUsers/" + id + "/UserInfo.sav";
		File f = new File("C:/Users/user1/java_kmk/SnowWhiteUsers/" + id);

		if(f.exists()) {

			ObjectOutputStream oos = null;
			FileOutputStream fos = null;

			try {
				fos = new FileOutputStream(path);
				oos = new ObjectOutputStream(fos);

				oos.writeObject(user);
				System.out.println("save successfully!");

			} catch (Exception e) {
				System.out.println("failed to save");
			} finally {
				try {
					oos.close();
					fos.close();
				} catch (IOException e) {
					System.out.println("unable to shut down the hallway");
				}
			}
		} else {
			exist = false;
			System.out.println("couldn't find the path");
		}
	}

}//class









package by.sokhaeduard.seventhhw;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			String country = null;
			String language = null;
			int input = ReadLine.getInt("1.-english 2.-russian 3.-exit");
			switch (input) {
			case 1:
				language = "en";
				country = "en";
				flag = false;
				break;
			case 2:
				language = "ru";
				country = "ru";
				flag = false;
				break;
			case 3:
				flag = false;
				break;
			}
			Locale current = new Locale(language, country);
			ResourceBundle resourceBundle = ResourceBundle.getBundle("locale", current);
			String firstMessage = resourceBundle.getString("db.line1");
			String secondMessage = resourceBundle.getString("db.line2");
			System.out.println(firstMessage);
			System.out.println(secondMessage);
		}
	}

}

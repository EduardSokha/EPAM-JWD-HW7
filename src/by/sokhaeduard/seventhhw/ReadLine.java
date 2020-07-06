package by.sokhaeduard.seventhhw;

import java.util.Scanner;

public class ReadLine {
	private static final Scanner sc = new Scanner(System.in);

	public static int getInt(String message) {
		int number;
		System.out.println(message);

		while (sc.hasNextInt() == false) {
			sc.next();
			System.out.println("not int");
			System.out.println("enter int");
		}
		number = sc.nextInt();

		return number;
	}
	
}

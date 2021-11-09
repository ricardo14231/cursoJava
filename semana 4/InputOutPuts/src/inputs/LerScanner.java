package inputs;

import java.util.Scanner;

public class LerScanner {

	public static void main(String[] args) {
		
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String userName = myObj.nextLine();
		
		System.out.println("Enter age: ");
		int userAge = myObj.nextInt();
		
		System.out.println("User Name is: " + userName);
		System.out.println("Age user is: " + userAge);
		
		myObj.close();
		
	}
	
}

package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int an = tc.nextInt();
		System.out.print("Enter account holder: ");
		tc.nextLine();
		String ah = tc.nextLine();
		Account user = new Account(an, ah);
		System.out.print("Is there na initial deposit (y/n)? ");
		char deposit = tc.next().charAt(0);
		if (deposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			user.accountDeposit(tc.nextDouble());
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(user);
		System.out.println();
		System.out.print("Enter a deposit value: ");
		user.accountDeposit(tc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(user);
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		user.accountWithDrawal(tc.nextDouble());
		System.out.println("Updated account data: ");
		System.out.println(user);
		
		tc.close();
		
	}

}

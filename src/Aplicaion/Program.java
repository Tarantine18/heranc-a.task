package Aplicaion;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import Entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ts = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = ts.nextInt();
			System.out.print("Holder: ");
			ts.nextLine();
			String holder = ts.nextLine();
			System.out.print("Initial balance:");
			double balanceInicial = ts.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = ts.nextDouble();

			Account acc = new Account(number, holder, balanceInicial, limit);
			
			System.out.print("Enter amount for withdraw: ");
			double withdraw = ts.nextDouble();
			acc.withDraw(withdraw);
			
			System.out.println("New balance: " + acc.getBalance());
			
			ts.close();
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("error in type");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}

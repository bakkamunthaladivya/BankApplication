package project;

import java.util.Scanner;

public class BankAppImpl {
	static int accBal=0;
	int accNo;
	int amount;
	String customerName;
	Scanner sc=new Scanner(System.in);
	public void basicDetails() {
		System.out.println("Enter your account number :");
		accNo=sc.nextInt();
	}
	public void viewBalance() {
		System.out.println("   YOUR ACCOUNT DETAILS   ");
		System.out.println("Account holder name : "+customerName);
		System.out.println("Account number : "+accNo);
		System.out.println("your current balance: "+accBal);
	}
	public void creditMoney() {
	
		System.out.print("Enter the amount which you want to credit in your account : ");
		int CreditMon=sc.nextInt();
		accBal=accBal+CreditMon;
		System.out.println("Transaction successful.");
	}
	public void withDrawMoney() {
		System.out.println("enter the amount which you want to withdraw ");
		int withDrawAmount=sc.nextInt();
		
		if(accBal<500) {
			System.out.println("sorry... you can not withdraw the amount");
			
		
		}
		else {
			System.out.println("withdraw operation is successful");
			accBal=accBal-withDrawAmount;
			System.out.println("Balance is: "+accBal);
		}
	}
	
	

}

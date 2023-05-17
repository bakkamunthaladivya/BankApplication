package project;
import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		BankAppImpl b=new BankAppImpl();
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("   WELCOME TO MY BANK   ");
		do {
			
			System.out.println("1.credit amount  ");
			System.out.println("2.Withdraw amount ");
			System.out.println("3. View Balance ");
			System.out.println("4. Exit");
			System.out.println();
			System.out.print("Enter yout choice : ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: b.basicDetails();
					b.creditMoney();
				break;
			case 2: b.basicDetails(); 
					b.withDrawMoney();
				break;
			case 3: b.basicDetails();
					b.viewBalance();
			 	break;
			default:
				sc.close();
				System.exit(0);
			}
			System.out.println("Do you want to use our Bank Services ");
			String ans=sc.next();
			
			if("yes".equalsIgnoreCase(ans)) {
				flag=true;
				
			}else {
				flag=false;
				System.out.println("Thank you");
				System.out.println("  Please visit again " );
				
			}
		}while(flag);

	}

}

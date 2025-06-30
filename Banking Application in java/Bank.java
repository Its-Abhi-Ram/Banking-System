
import java.util.Scanner;

// after loging the inner operations done here

public class Bank{
	
		int balance;
		int previousTransaction;
		String customerFName,customerLName,Email;
		int customerid;
		
		//  constructors are used for mapping of a BankAccount
		
		void BankAccount(String cfname,String clname, int id1,String email){
			customerFName = cfname;
			customerLName = clname;
			customerid = id1;
			Email = email;
			showMenu();
		}
		
		//  deposit of money 
		
		void deposit(int amount) {
			if(amount != 0) {
				balance = balance + amount;
				previousTransaction = amount;
				
			}
		}
		
		//  withdraw of money 
		
		void withdraw(int amount) {
			if(amount != 0 && amount <= balance) {
				balance = balance - amount;
				previousTransaction = -amount;
				System.out.println("==============================================");
				System.out.println("Amount withdrawn is : "+amount);
				System.out.println("==============================================");
			}
			else {
				System.out.println("==============================================");
				System.out.println("Insufficient Balance");
				System.out.println("==============================================");
			}
		}
		
		// for Previous Transactions details only one previous transaction
		
		void getPreviousTransaction() {
			if(previousTransaction > 0) {
				System.out.println("Deposited : "+previousTransaction);
			}
			else if(previousTransaction < 0) {
				System.out.println("Withdrawn : "+Math.abs(previousTransaction));
			}
			else {
				System.out.println("No transaction is Occured!.");
			}
		}
		
		// inner menu options of Bank Applicaton
		
		void showMenu() {
			int option;
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome "+customerFName+" "+customerLName);
			System.out.println("Your ID is : "+customerid);
			System.out.println("Your Email : "+Email);
			System.out.println();
			while(true) {
				System.out.println("==============================================");
				System.out.println("1.Check Balance");
				System.out.println("2.Deposit");
				System.out.println("3.Withdraw");
				System.out.println("4.Previous Transaction");
				System.out.println("5.Exit");
				System.out.println();
				System.out.println("==============================================");
				System.out.println("Enter your choice : ");
				option = sc.nextInt();
				
				switch(option) {
				case 1:
					System.out.println("==============================================");
					System.out.println("Balance is : "+balance);
					System.out.println("==============================================");
					System.out.println();
					break;
					
				case 2:
					System.out.println("==============================================");
					System.out.println("Enter the amount to deposit : ");
					System.out.println("==============================================");
					int amount = sc.nextInt();
					deposit(amount);
					System.out.println("Amount deposited Successfully.");
					System.out.println();
					break;
					
				case 3:
					System.out.println("==============================================");
					System.out.println("Enter the amount to withdraw : ");
					System.out.println("==============================================");
					int amount2 =sc.nextInt();
					withdraw(amount2);
					System.out.println();
					break;
					
				case 4:
					System.out.println("==============================================");
					getPreviousTransaction();
					System.out.println("==============================================");
					break;
				
				case 5:
					System.out.println("==============================================");
					System.out.println("Thank you for using online banking");
					System.out.println("==============================================");
					return ;
					
				default :
					System.out.println("==============================================");
					System.out.println("Invalid Choice! Please try again.");
					break;
					
				}
			}
			
		
			
		}
	

}

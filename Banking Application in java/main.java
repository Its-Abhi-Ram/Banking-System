
import java.util.*;

// Main class creation

public class main {
	static Scanner sc = new Scanner(System.in);

	 static int lastaccid = 0;
	 private static ArrayList<Account>accounts;
	public static void main(String[] args) throws InterruptedException {
		
		accounts = new ArrayList<>(); // using arraylist concept
		 while(true) {
			 System.out.println("Welcome to Bank Management System");
			 System.out.println("1. Create a new Account");
			 System.out.println("2. Login");
			 System.out.println("3. Exit");
			 System.out.println("Enter your option : ");
			 int i = sc.nextInt();
			 
			 //front page of Banking Application
			 
			 switch(i) {  // switch case operation
			 	case 1:
			 		CreateNewAccount();
			 		break;
			 	case 2:
			 		Login();
			 		break;
			 	case 3: System.exit(0);
			 	default : System.out.println("Invalid option! please try again.");
			 }
		 }
		
	
		 
	}
	
	// Creation of new Account 
	
	private static void CreateNewAccount()  {
		System.out.println("Enter the first name : ");
		String firstName = sc.next();
		System.out.println("Enter the last name : ");
		String lastName =sc.next();
		System.out.println("Enter the Email : ");
		String email = sc.next();
		System.out.println("Set the Password (digits only) : ");
		int password = sc.nextInt();
		System.out.println("Confirm the Password : ");
		int passwordc = sc.nextInt();
		
		if(password != passwordc) {
			System.out.println("Password Not Matching! Try again");
			return;
		}
		int id = 1000000 + lastaccid;
		lastaccid =lastaccid +1;
		Account acc = new Account(firstName ,lastName,id,email, password);
		accounts.add(acc);
		System.out.println("Your Account ID : "+id);
		System.out.println("Account created Successfully.");
		System.out.println("==============================================");
	}
	
	// Loging into the Account 
	
	private static void Login() throws InterruptedException {
		System.out.println("==============================================");
		System.out.println("Enter the Account ID : ");
		int id = sc.nextInt();
		System.out.println("==============================================");
		System.out.println("Enter the Password : ");
		int Password = sc.nextInt();
		System.out.println("==============================================");
		Account account = new Account();
		boolean exist = false;
		for (Account acc : accounts) {
			if(acc.getId() == id && acc.getPassword() == Password) {
				exist = true;
				account = acc;
			}
		}
		if (exist) {
			ShowAcc(account);
		}else {
			System.out.println("==============================================");
			System.out.println("Account doesn't exist");
			System.out.println("==============================================");
		}
		
	}
	
	// Account details displaying 
	
	private static void ShowAcc(Account acc) throws InterruptedException {
		
		System.out.println("Account Found.....");
		System.out.println("==============================================");
		System.out.println("Logging.......................................");
		System.out.println("==============================================");
		Thread.sleep(1500);  // Thread concept using for better experience
		
		Bank b = new Bank();
 		b.BankAccount(acc.getFirstname(),acc.getLastname(),acc.getId(),acc.getEmail());
	}
		 

}

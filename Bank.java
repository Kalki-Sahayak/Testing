import java.util.*;
class Bank_Account
{

	static final int n = 2;
	static int Account_Number[] = new int [100];
	static String Account_Holder_name[] = new String[100];
	static char Account_type[] = new char[100];
	static double balance []= new double[100];
	
	static void input ()
	{
		Scanner sc = new Scanner (System.in);
		
		for (int i=0; i<n;i++)
		{
			System.out.println("Person "+ (i+1));
		
			System.out.print ("Enter the name of the user: ");
			Account_Holder_name[i] = sc.nextLine();
		
			System.out.print ("Enter the account number: ");
			Account_Number[i] = sc.nextInt();
			
			System.out.print ("Enter the Account type 'S' for Saving and 'C' for Current: ");
			Account_type[i] = sc.next().charAt(0);
			sc.nextLine();
		}
	}

	static void deposit ()
	{

		Scanner sc = new Scanner (System.in);

		System.out.print ("Enter the account number: ");
		int a= sc.nextInt();

		for (int i=0; i<n ;i++)
		{
			if (a ==  Account_Number[i])
			{
				a = i;
			}
		}
		
		System.out.print ("Enter the amount to be deposited: ");
		double c = sc.nextDouble();
		
		if (balance[a] == 0)
			balance[a] = c;
		else
			balance[a] = balance[a]+c;

		System.out.println ("The Account Number: "+ Account_Number[a]+ " has the amount "+ balance[a] );
		System.out.println();
		
	}

	static void withdraw ()
	{

		Scanner sc = new Scanner (System.in);

		System.out.print ("Enter the account number: ");
		int a= sc.nextInt();

		for (int i=0; i<n ;i++)
		{
			if (a ==  Account_Number[i])
			{
				a = i;
			}
		}
		
		System.out.print ("Enter the amount to be Withdrawn: ");
		double c = sc.nextDouble();
		
		if (c > balance[a])
		{
			System.out.println ("Insufficient balance");
		}
		else
		{
			balance[a] = balance[a] - c;
			System.out.println ("Rupees "+ c + " is Withdrawn Successfully!!");
		
			System.out.println ("The Account Number: "+ Account_Number[a]+ " has the amount "+ balance[a] );
			System.out.println();
		}

		
		
	}

	static void display ()
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Enter the account number whose details are to be displayed: ");
		int b = sc.nextInt();

		for (int i=0; i<n ;i++)
		{
			if (b ==  Account_Number[i])
			{
				b = i;
			}
		}
		
		System.out.println("Account Holder Name: "+ Account_Holder_name[b]);
		System.out.println("Account type: "+ Account_type[b]);
		System.out.println("Account Number: "+ Account_Number[b]);
		System.out.println("Account balance: "+ balance[b]);
	}

	public static void main (String args[])
	{
		int wish =0;

		Scanner sc = new Scanner (System.in);
		
		input ();

		do
		{
			System.out.println(" Press 1. to Withdraw");
			System.out.println(" Press 2. to Deposit");
			System.out.println(" Press 3. to Display");
			int c = sc.nextInt();


			if (c == 1)
			{
				withdraw ();
			}
			else if (c== 2)
			{
				deposit ();
			}
			else
			{
				display ();
			}
			
			System.out.print ("Do you wish to continue? (1/0): ");
			wish = sc.nextInt();
		} while (wish != 0);
	}
}

			

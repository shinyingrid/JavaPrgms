package Concrete;
import java.util.Scanner;
public class IciciAtmDriver
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		IciciAtm i=new IciciAtm();
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter your choice \n1.Create account \n2.Withdraw amount \n3.Deposit amount \n4.Check Balance \n5.Change Password \n6.Deactivate Account \n7.Exit");
			int choice =sc.nextInt();
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter your account number");
				long accNo=sc.nextLong();
				System.out.println("Enter your password");
				int password=sc.nextInt();
				System.out.println("Enter your balance");
				double balance=sc.nextDouble();
				i.createAccount(new Account(accNo,password,balance));
			}
			break;
			case 2:
			{
				System.out.println("Enter your password");
				int password=sc.nextInt();
				System.out.println("Enter the amount to withdraw");
				double balance=sc.nextDouble();
				i.withdraw(password, balance);
			}
			break;
			case 3:
			{
				System.out.println("Enter your password");
				int password=sc.nextInt();
				System.out.println("Enter the amount to deposit");
				double balance=sc.nextDouble();
				i.deposit(password, balance);
			}
			break;
			case 4:
			{
				System.out.println("Enter your password");
				int password=sc.nextInt();
				i.balanceEnquiry(password);
			}
			break;
			case 5:
			{
				System.out.println("Enter your old password");
				int oldPwd=sc.nextInt();
				System.out.println("Enter your new password");
				int newPwd=sc.nextInt();
				i.changePwd(oldPwd, newPwd);
			}
			break;
			case 6:
			{
				System.out.println("Enter your password");
				int password=sc.nextInt();
				i.deactivate(password);
			}
			break;
			case 7:
			{
				exit =false;
				System.out.println("Thank you!");
			}
			break;
			default:
			{
				System.out.println("Invalid Option.Please check again");
			}
		   }
		}
	}

}

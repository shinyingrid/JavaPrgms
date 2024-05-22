package Concrete;
//if IciciAtm shows error, choose Add unimplemented methods
public class IciciAtm extends Atm //Achieved Is-A relationship
{
	Account a; //Achieved Has-A relationship;
	
	//Late or Lazy Instatiation
	public void createAccount(Account a)
	{
		if (this.a==null)
		{
			this.a=a;
			System.out.println("Account has been created successfully");
		}
		else
		{
			System.out.println("Account already exists");
		}
	}
	
	@Override
	public void withdraw(int pwd,double amount)
	{
		if(this.a==null)
		{
			System.out.println("Account does not exist");
		}
		else
		{
			if(a.password==pwd)
			{
				if(a.balance>=amount)
				{
					a.balance-=amount;//a.balance=a.balance-amount
					System.out.println("Amount is withdrawn successfully");
				}
				else
				{
					System.out.println("Amount is insufficient to withdraw");
				}
			}
			else
			{
				System.out.println("Incorrect Password");
			}
		}
	}

	@Override
	public void deposit(int pwd, double amount) 
	{
		if(this.a==null)
		{
			System.out.println("Account does not exist");
		}
		else
		{
			if(a.password==pwd)
			{
				a.balance+=amount;//a.balance=a.balance+amount
				System.out.println("Amount is deposited successfully");
			}
			else
			{
				System.out.println("Incorrect password");
			}
		}
		
	}

	@Override
	public void balanceEnquiry(int pwd)
	{
		if(this.a==null)
		{
			System.out.println("Account does not exist");
		}
		else
		{
			if(a.password==pwd)
			{
				System.out.println("Balance is: "+a.balance);
			}
			else
			{
				System.out.println("Incorrect password");
			}
		}
			
	}

	@Override
	public void changePwd(int oldPwd, int newPwd)
	{
		if(this.a==null)
		{
			System.out.println("Account is not created");
		}
		else
		{
			if(a.password==oldPwd)
			{
				a.password=newPwd;
				System.out.println("Password has been changed successfully");
			}
			else
			{
				System.out.println("Incorrect password");
			}
		}
		
	}
	
	public void deactivate(int pwd)
	{
		if(this.a==null)
		{
			System.out.println("Account is not created");
		}
		else
		{
			if(a.password==pwd)
			{
				this.a=null;
				System.out.println("Account is deactivated");
			}
			else
			{
				System.out.println("Incorrect password");
			}
		}
	}
}

package Concrete;
/*concept of OOPs. Here we have used abstraction and concrete concepts*/

public abstract class Atm 
{
	public abstract void withdraw(int pwd,double amount);
	public abstract void deposit(int pwd,double amount);
	public abstract void balanceEnquiry(int pwd);
	public abstract void changePwd(int oldPwd,int newPwd);
}

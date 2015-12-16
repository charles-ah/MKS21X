public class BankAccount{
    
    
private    double  balance; 
private    int accountID;
private    String username; 
private    String password; 
private    int  pin;

    public BankAccount(double bal,int ID,String user,String pass,int num)
    {
	username = user;
	balance = bal;
	accountID = ID;
	password = pass;
	pin = num;
    }

    public void Info()
    {
	System.out.println("Name: " +username +  "\nAccount ID:" + accountID + "\nBalance: " + balance + "\npassword: " + password + "\npin: " + pin);; 
    }

    public double getBal()
    {
	return balance;
    }

    public int getID()
    {
	return accountID;
    }

    public String getUser()
    {
	return username;
    }

    public void setPass(String pass)
    {
	password = pass;
    }

    public void setPin(int num)
    {
	pin = num;
    }

    public boolean deposit(double n)
    {
	if (n >= 0)
	    {
		System.out.println("Deposit success");
		balance += n;
		return true;
	    }
	else
	    {
		System.out.println("Deposit failure");
		return false;
	    }

    }

    public boolean withdraw(int n)
    {
	if ((n <= balance)&&(n>=0))
	    {
		balance -= n;
		System.out.println("Withdrawal success");
		return true;
	    }
	else
	    {
		System.out.println("Withdrawal failure");
		return false;
	    }
    }
	public String toString()
	{
	    return "Name: " + username + "\t Account: " + accountID + "\t Balance: " + balance;
	}
	
    




    
public static void main(String[]args)
{
    BankAccount myAccount = new BankAccount(0,3728,"CZ","xox",5);
    myAccount.Info();
    myAccount.deposit(500);
    myAccount.Info();
    myAccount.withdraw(500);
    myAccount.Info();
    System.out.println(myAccount.toString());
}
    
}
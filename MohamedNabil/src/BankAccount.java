
public class BankAccount {
public String[] history= new String[5];
private double Balance;
private int counter;
String random;
public BankAccount() {
	super();
	
	Balance = 0;
	counter=0;
}
public boolean Deposit(double Balance)
{   
	if(Balance<=0)
	return false;
else
	{
	this.Balance=this.Balance+Balance;
	
	}
	return true;
}
public double getBalance() {
	if (Balance<0)
		Balance=0;
	
	return Balance;
}
public boolean Withdraw(double Balance)
{
	if (this.Balance<Balance||Balance<=0)
		return false;
	else
	{
	this.Balance=this.Balance-Balance;
	
	}
	return true;
	
}
public void history(String Balance)
{
	
	
	if(counter<5)
	{history[counter]=Balance;
	counter++;
	}
	else
		{
		
			int i;
			for(i=0;i<4;i++)
			{
				String temp ;
				temp=history[i];
				history[i]=history[i+1];
				
				history[i+1]=temp;
				
				
			}
			history[counter-1]=Balance;
		
			
		}
	
	}
	
	
}




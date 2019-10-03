package Bussiness;


public class bank 
{
	private int amount=500;
	private String accno="sbi1234";
	
	public int deposit(String accno, int amount)
	{
		if(accno.equals(this.accno)) {
			this.amount=this.amount+amount;
		}
		else {
			System.out.println("Enter Valid No");
			
		}
		return this.amount;
	}
}

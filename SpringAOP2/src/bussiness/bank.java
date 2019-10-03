package bussiness;

public class bank {

private int amount =500;
private String acno="sbi123";
public int deposit(String accno,int amount)
{
	if(acno.equals(this.acno)) {
		this.amount=this.amount+amount;
		
	}else {
		System.out.println("Error");
	}
	return this.amount;
}
}

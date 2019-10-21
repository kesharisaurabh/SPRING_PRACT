package bussiness;

public class bank 
{
	private int amt=5000;
	private String acname="sbi123";
	
	public int deposit(int amt,String acname) throws AcNotFound
	{
		if(acname.equals(this.acname))
		{
			this.amt=this.amt+amt;
		}else {
			throw new AcNotFound();
		}
		return this.amt;
	}
}

package Beans;

public class Bank 
{
	private int id;

	public void setId(int id) {
		this.id = id;
	}
	private String Bname;
	public Bank(String Bname)
	{
		this.Bname=Bname;
	}

	public void hello(String str) {
		System.out.println(id+" "+str+" "+Bname);
	}
}

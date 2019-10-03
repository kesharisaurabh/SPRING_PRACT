package bean;

public class UserClass 
{
	private String ShowResult;
	public UserClass(String ShowResult)
	{
		this.ShowResult=ShowResult;
	}
	public void disp()
	{
		System.out.println(ShowResult);
		
	}
}

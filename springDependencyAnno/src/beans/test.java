package beans;

import org.springframework.beans.factory.annotation.Required;

public class test 
{
	private String Driver;
	private String url;
	private String user;
	private String psw;
	
	public String getDriver() {
		return Driver;
	}
	@Required
	public void setDriver(String driver) {
		Driver = driver;
	}
	public String getUrl() {
		return url;
	}
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public void print()
	{
		System.out.println(Driver);
		System.out.println(url);
		System.out.println(user);
		System.out.println(psw);
	}
}

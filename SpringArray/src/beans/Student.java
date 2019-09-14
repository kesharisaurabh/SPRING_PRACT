package beans;

public class Student 
{
	String []name;

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}
	public void hello()
	{
		for(String str:name) {
		System.out.println(str);}
	}
}

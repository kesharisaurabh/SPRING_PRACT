package beans;

public class Student 
{
	private String name;
	private int sid;
	private int roll;
	Student(String name,int sid,int roll)
	{
		this.name=name;
		this.sid=sid;
		this.roll=roll;
	}
	public void helloStudent(String Greet)
	{
		System.out.println(Greet+" "+sid+" "+name+" "+roll);
	}
}

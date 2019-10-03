package bean;

public class CLG 
{
	private int Teachers;
	private int Students;
	public int getTeachers() {
		return Teachers;
	}
	public void setTeachers(int teachers) {
		Teachers = teachers;
	}
	public int getStudents() {
		return Students;
	}
	public void setStudents(int students) {
		Students = students;
	}
	public void disp()
	{
		System.out.println("Numbers Of Student "+Students+" and Teachers "+Teachers);
	}
}

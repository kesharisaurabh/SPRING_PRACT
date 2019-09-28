package beans;

import org.springframework.beans.factory.annotation.Autowired;

public class test 
{
	private int id;
	@Autowired
	private Car cars;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setCars(Car cars) {
		this.cars = cars;
	}
	
	public void disp()
	{
		System.out.println(id+" "+cars.getName());
	}
	
}

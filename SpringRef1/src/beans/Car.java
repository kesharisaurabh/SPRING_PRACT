package beans;

public class Car 
{
	private Engine Engine;
	private String CarName;
	public void setCarName(String CarName) 
	{
		this.CarName = CarName;
	}
	public Engine getEngine() {
		return Engine;
	}
	public void setEngine(Engine engine) {
		Engine = engine;
	}
	public void printDetail()
	{
		System.out.println(CarName+" "+Engine.getModel());
	}
}

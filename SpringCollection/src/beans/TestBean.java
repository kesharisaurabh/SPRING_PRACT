package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestBean
{
	private List fruts; 
	private Set cricket;
	private Map CountryCapital;
	public List getFruts() {
		return fruts;
	}
	public void setFruts(List fruts) {
		this.fruts = fruts;
	}
	public Set getCricket() {
		return cricket;
	}
	public void setCricket(Set cricket) {
		this.cricket = cricket;
	}
	public Map getCountryCapital() {
		return CountryCapital;
	}
	public void setCountryCapital(Map countryCapital) {
		CountryCapital = countryCapital;
	}
	public void Hello()
	{
		System.out.println("fruts");
		for(Object fr:fruts)
		{
			System.out.println(fr);
		}
		System.out.println("cricket");
		for(Object cr:cricket)
		{
			System.out.println(cr);
		}System.out.println("CountryCapital");
		Set key=CountryCapital.keySet();
		for(Object cc:key)
		{
			System.out.println("Countrykey"+cc+" CountryCapital"+CountryCapital.get(cc));
		}
	}
	
	
}

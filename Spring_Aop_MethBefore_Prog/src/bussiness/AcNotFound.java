package bussiness;

public class AcNotFound extends RuntimeException
{
	@Override
	public String toString() {
		return "AccountNotFound";
	}
}

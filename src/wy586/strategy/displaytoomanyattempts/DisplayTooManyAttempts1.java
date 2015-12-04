package wy586.strategy.displaytoomanyattempts;

public class DisplayTooManyAttempts1 implements DisplayTooManyAttempts
{

	@Override
	public void showTooManyAttempts()
	{
		System.out.println();
		System.out.println("Too many attempts,Card ejected");
		System.out.println();
	}

}

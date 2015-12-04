package wy586.strategy.eject;

public class Eject1 implements Eject
{
	@Override
	public void EjectCard()
	{
		System.out.println();
		System.out.println("Card ejected");
		System.out.println();
		System.exit(0);
	}

}

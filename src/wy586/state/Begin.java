package wy586.state;
import wy586.Console;
import wy586.MDA_EFSM;

public class Begin extends State
{
	public Begin(MDA_EFSM m)
	{
		mda = m;
	}

	@Override
	public void card()
	{
		mda.changeState(1);
		Console.op.storeData();
	}
	
	@Override
	public void incorrectPin(int max)
	{
		Console.op.displayIncorrectPin();
	}
	
	@Override
	public void incorrectLock()
	{
		System.out.println();
		System.out.println("Please login first");
		System.out.println();
	}

	@Override
	public void incorrectUnlock()
	{
		Console.op.displayIncorrectPin();
	}

	@Override
	public void correctPin()
	{
		System.out.println();
		System.out.println("Please open an card first.");
		System.out.println();
	}

	@Override
	public void deposit()
	{
		System.out.println();
		System.out.println("Please open an card first.");
		System.out.println();
	}

	@Override
	public void withdraw()
	{
		System.out.println();
		System.out.println("Please open an card first.");
		System.out.println();
	}

	@Override
	public void balance()
	{
		System.out.println();
		System.out.println("Please open an card first.");
		System.out.println();
	}

	@Override
	public void lock()
	{
		System.out.println();
		System.out.println("Please open an card first.");
		System.out.println();
	}

	@Override
	public void unlock()
	{
		System.out.println();
		System.out.println("Please open an card first.");
		System.out.println();
	}

	@Override
	public void exit()
	{
		System.out.println();
		Console.op.eject();
		System.out.println();
	}

}

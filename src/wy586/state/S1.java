package wy586.state;

import wy586.Console;
import wy586.MDA_EFSM;

public class S1 extends State
{
	
	public S1(MDA_EFSM m)
	{
		mda = m;
	}

	@Override
	public void card()
	{
		System.out.println();
		System.out.println("Operation open is not available. You already opened an account.");
		System.out.println();
	}

	@Override
	public void deposit()
	{
		System.out.println();
		System.out.println("Operation deposit is not available.");
		System.out.println();
		
	}

	@Override
	public void withdraw()
	{
		System.out.println();
		System.out.println("Operation withdraw is not available.");
		System.out.println();
		
	}

	@Override
	public void balance()
	{
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	}

	@Override
	public void incorrectPin(int max)
	{
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	}

	@Override
	public void correctPin()
	{
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	}

	@Override
	public void aboveMinBalance()
	{
		mda.changeState(3);
	}

	@Override
	public void belowMinBalance()
	{
		mda.changeState(4);
	}


	@Override
	public void incorrectLock()
	{
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	}

	@Override
	public void incorrectUnlock()
	{
		System.out.println();
		System.out.println("Operation is not available.");
		System.out.println();
	}

	@Override
	public void lock()
	{
		System.out.println();
		System.out.println("Operation lock is not available.");
		System.out.println();
		
	}

	@Override
	public void unlock()
	{
		System.out.println();
		System.out.println("Operation unlock is not available.");
		System.out.println();
		
	}
	
	@Override
	public void exit()
	{
		System.out.println();
		System.out.println("Operation logout is not available.");
		System.out.println();
	}
	public void belowMinBalanceWithPanelty()
	{
		mda.changeState(4);
		Console.op.chargePenalty();
	}
	
}

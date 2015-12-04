package wy586.state;

import wy586.Console;
import wy586.MDA_EFSM;

public class Overdrawn extends State
{

	public Overdrawn(MDA_EFSM m)
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
		mda.changeState(2);
		Console.op.makeDeposit();
	}

	@Override
	public void withdraw()
	{
		Console.op.dispalyBalBelowMin();
	}

	@Override
	public void balance()
	{
		Console.op.dispalyBalance();
	}

	@Override
	public void lock()
	{
		mda.changeState(5);
		System.out.println("You locked your account.");
	}

	@Override
	public void unlock()
	{
	}
	
	@Override
	public void incorrectLock()
	{
		Console.op.displayIncorrectPin();
	}

	@Override
	public void exit()
	{
		mda.changeState(0);
		System.out.println();
		Console.op.eject();
		System.out.println();
	}
	
	@Override
	public void incorrectPin(int max)
	{
		Console.op.displayIncorrectPin();
	};
	

}

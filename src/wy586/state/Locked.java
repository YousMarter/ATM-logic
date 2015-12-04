package wy586.state;

import wy586.Console;
import wy586.MDA_EFSM;

public class Locked extends State
{
	
	public Locked(MDA_EFSM m)
	{
		mda = m;
	}
	
	@Override
	public void card()
	{
		System.out.println();
		System.out
				.println("Operation open is not available. You already opened an account.");
		System.out.println();
	}

	@Override
	public void deposit()
	{
		System.out.println();
		System.out.println("You account is locked, please unlock it first.");
		System.out.println();

	}

	@Override
	public void withdraw()
	{
		System.out.println();
		System.out.println("You account is locked, please unlock it first.");
		System.out.println();

	}

	@Override
	public void balance()
	{
		System.out.println();
		System.out.println("You account is locked, please unlock it first.");
		System.out.println();
	}

	@Override
	public void lock()
	{
		System.out.println();
		System.out.println("Operation lock is not available because your account had already been locked.");
		System.out.println();
	}

	@Override
	public void incorrectLock()
	{
		Console.op.displayIncorrectPin();
	}

	@Override
	public void unlock()
	{
		mda.changeState(2);
		System.out.println("You unlocked your account.");
	}

	@Override
	public void incorrectUnlock()
	{
		Console.op.displayIncorrectPin();
	}

	@Override
	public void exit()
	{
		System.out.println();
		System.out.println("You account is locked, please unlock it first.");
		System.out.println();
	}
}

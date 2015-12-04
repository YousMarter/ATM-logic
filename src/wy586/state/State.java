package wy586.state;

import wy586.MDA_EFSM;

public abstract class State
{
	MDA_EFSM	mda;
	
	public void card()
	{
	};

	public void incorrectPin(int max)
	{
	};
	
	public void correctPin()
	{
	};

	public void aboveMinBalance()
	{
	};
	
	public void belowMinBalance()
	{
	};
	
	public void lock()
	{
	};

	public void deposit()
	{
	};

	public void withdraw()
	{
	};

	public void balance()
	{
	};

	public void exit()
	{
	};

	public void incorrectLock()
	{
	};

	public void unlock()
	{
	};
	
	public void incorrectUnlock()
	{
	}

	public void belowMinBalanceWithPanelty()
	{
		
	}
	public void EjectCard()
	{
		
	}
}



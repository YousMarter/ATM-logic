package wy586;

import wy586.state.*;

public class MDA_EFSM
{
	public State	s;
	public State[]	sList		= new State[6];
	public int		attempts	= 0;

	public MDA_EFSM()
	{
		sList[0] = new Begin(this);
		sList[1] = new CheckPin(this);
		sList[2] = new S1(this);
		sList[3] = new Ready(this);
		sList[4] = new Overdrawn(this);
		sList[5] = new Locked(this);
		s = sList[0];
	}

	public void changeState(int state)
	{
		s = sList[state];
	}

	public void card()
	{
		s.card();
	}

	public void correctPin()
	{
		s.correctPin();
	}

	public void aboveMinBalance()
	{
		s.aboveMinBalance();
	}

	public void belowMinBalance()
	{
		s.belowMinBalance();
	}

	public void incorrectPin(int max)
	{
		s.incorrectPin(max);
	}

	public void exit()
	{
		s.exit();
	}

	public void withdraw()
	{
		s.withdraw();
	}

	public void belowMinBalanceWithPanelty()
	{
		s.belowMinBalanceWithPanelty();
	}

	public void deposit()
	{
		s.deposit();
	}

	public void balance()
	{
		s.balance();
	}

	public void lock()
	{
		s.lock();
	}

	public void incorrectLock()
	{
		s.incorrectLock();
	}

	public void unLock()
	{
		s.unlock();
	}

	public void incorrectUnLock()
	{
		s.incorrectUnlock();
	}
	public void EjectCard()
	{
		s.EjectCard();
	}
}

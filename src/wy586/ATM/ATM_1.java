package wy586.ATM;
import wy586.Console;
import wy586.data.Data1;

public class ATM_1
{
	Data1						d1;
	public static final int	MIN_BALANCE		= 1000;
	private static final int	MAX_ATTEMPTS	= 2;//from 0;
	public static final int	PENALTY			= 10;

	public void card(int x, String y)
	{
		Console.tmp_pin1 = y;
		Console.tmp_balance1 = x;
		Console.m.card();
	}

	public void pin(String x)
	{
		d1 = Console.d1;
		if (x.equals(d1.pin))
		{
			Console.m.correctPin();
			if (d1.balance > MIN_BALANCE)
				Console.m.aboveMinBalance();
			else
				Console.m.belowMinBalance();
		}
		else
			Console.m.incorrectPin(MAX_ATTEMPTS);
	}

	public void exit()
	{
		Console.m.exit();
	}

	public void deposit(int d)
	{
		d1 = Console.d1;
		Console.tmp_deposit1 = d;
		Console.m.deposit();
		if (d1.balance > MIN_BALANCE)
		{
			Console.m.aboveMinBalance();
		}
		else
		{
			Console.m.belowMinBalanceWithPanelty();
		}
	}

	public void withdraw(int w)
	{
		d1 = Console.d1;
		Console.tmp_withdraw1 = w;
		Console.m.withdraw();
		if (d1.balance > MIN_BALANCE)
		{
			Console.m.aboveMinBalance();
		}
		else
		{
			Console.m.belowMinBalanceWithPanelty();
		}
	}

	public void balance()
	{
		Console.m.balance();
	}

	public void lock(String x)
	{
		d1 = Console.d1;
		if (x.equals( Console.tmp_pin1))
		{
			Console.m.lock();
		}
		else
		{
			Console.m.incorrectLock();
		}
	}

	public void unlock(String x)
	{
		d1 = Console.d1;
		if (x.equals( Console.tmp_pin1))
		{
			Console.m.unLock();
			if (d1.balance > MIN_BALANCE)
			{
				Console.m.aboveMinBalance();
			}
			else
			{
				Console.m.belowMinBalance();
			}
		}
		else
		{
			Console.m.incorrectUnLock();
		}
	}
}
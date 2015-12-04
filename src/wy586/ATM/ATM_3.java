package wy586.ATM;
import wy586.Console;
import wy586.data.Data3;

public class ATM_3
{
	Data3 d3;
	public static final int	MIN_BALANCE		= 100;
	private static final int	MAX_ATTEMPTS	= 0;//from 0;
	public static final int	PENALTY			= 0;

	public void card(int x, int y)
	{
		Console.tmp_pin3 = y;
		Console.tmp_balance3 = x;
		Console.m.card();
	}

	public void pin(int x)
	{
		d3 = Console.d3;
		if (x == d3.pin)
		{
			Console.m.correctPin();
			if (d3.balance > MIN_BALANCE)
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
		d3 = Console.d3;
		Console.tmp_deposit3 = d;
		Console.m.deposit();
		if (d3.balance > MIN_BALANCE)
		{
			Console.m.aboveMinBalance();
		}
		else
		{
			Console.m.belowMinBalance();
		}
	}

	public void withdraw(int w)
	{
		d3 = Console.d3;
		Console.tmp_withdraw3 = w;
		Console.m.withdraw();
		if (d3.balance > MIN_BALANCE)
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

	public void lock()
	{

		Console.m.lock();
	}

	public void unlock()
	{
		Console.m.unLock();
			if (d3.balance > MIN_BALANCE)
			{
				Console.m.aboveMinBalance();
			}
			else
			{
				Console.m.belowMinBalance();
			}
	}
}
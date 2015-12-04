package wy586.ATM;
import wy586.Console;
import wy586.data.Data2;

public class ATM_2
{
	Data2						d2;
	public static final int	MIN_BALANCE		= 500;
	private static final int	MAX_ATTEMPTS	= 1;//form 0;
	public static final int	PENALTY			= 20;

	public void card(float x, int y)
	{
		Console.tmp_pin2 = y;
		Console.tmp_balance2 = x;
		Console.m.card();
	}

	public void pin(int x)
	{
		d2 = Console.d2;
		if (x == d2.pin)
		{
			Console.m.correctPin();
			if (d2.balance > MIN_BALANCE)
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

	public void deposit(float d)
	{
		d2 = Console.d2;
		Console.tmp_deposit2 = d;
		Console.m.deposit();
		if (d2.balance > MIN_BALANCE)
		{
			Console.m.aboveMinBalance();
		}
		else
		{
			Console.m.belowMinBalanceWithPanelty();
		}
	}

	public void withdraw(float w)
	{
		d2 = Console.d2;
		Console.tmp_withdraw2 = w;
		Console.m.withdraw();
		if (d2.balance > MIN_BALANCE)
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

}
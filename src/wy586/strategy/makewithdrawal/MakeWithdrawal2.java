package wy586.strategy.makewithdrawal;

import wy586.Console;

public class MakeWithdrawal2 implements MakeWithdrawal
{

	@Override
	public void withdraw()
	{
		{Console.d2.balance -= Console.tmp_withdraw2;}
		
	}

}

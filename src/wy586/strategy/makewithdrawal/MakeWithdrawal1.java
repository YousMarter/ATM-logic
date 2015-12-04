package wy586.strategy.makewithdrawal;

import wy586.Console;

public class MakeWithdrawal1 implements MakeWithdrawal
{

	@Override
	public void withdraw()
	{
		Console.d1.balance -= Console.tmp_withdraw1;
	}

}

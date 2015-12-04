package wy586.strategy.makewithdrawal;

import wy586.Console;

public class MakeWithdrawal3 implements MakeWithdrawal
{

	@Override
	public void withdraw()
	{
		{Console.d3.balance -= Console.tmp_withdraw3;}
		
	}

}

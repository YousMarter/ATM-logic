package wy586.strategy.makedeposit;

import wy586.Console;

public class MakeDeposit2 implements MakeDeposit
{

	@Override
	public void deposit()
	{
		{
		Console.d2.balance += Console.tmp_deposit2;
		System.out.println("SEE CURRENT BALANCE IN THE ACCOUNT PLEASE USE BALANCE FUNCTION");
		System.out.println();
		}
	}

}

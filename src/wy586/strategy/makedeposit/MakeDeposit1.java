package wy586.strategy.makedeposit;

import wy586.Console;

public class MakeDeposit1 implements MakeDeposit
{

	@Override
	public void deposit()
	{
		Console.d1.balance += Console.tmp_deposit1;
		System.out.println("SEE CURRENT BALANCE IN THE ACCOUNT PLEASE USE BALANCE FUNCTION");
		System.out.println();
	}

}

package wy586.strategy.makedeposit;

import wy586.Console;

public class MakeDeposit3 implements MakeDeposit
{

	@Override
	public void deposit()
	{
		{
		Console.d3.balance += Console.tmp_deposit3;
		System.out.println("SEE CURRENT BALANCE IN THE ACCOUNT PLEASE USE BALANCE FUNCTION");
		System.out.println();
		}
	}

}

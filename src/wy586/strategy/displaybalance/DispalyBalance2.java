package wy586.strategy.displaybalance;
import wy586.Console;

public class DispalyBalance2 implements DispalyBalance
{

	@Override
	public void showBalance()
	{
		
		System.out.println();
		System.out.println("CURRENT BALANCE IN THE ACCOUNT: $"+Console.d2.balance);
		System.out.println();
		
	}
	
}

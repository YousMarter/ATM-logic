package wy586.strategy.displaybalance;
import wy586.Console;

public class DisplayBalance3 implements DispalyBalance
{

	@Override
	public void showBalance()
	{
		
		System.out.println();
		System.out.println("CURRENT BALANCE IN THE ACCOUNT: $"+Console.d3.balance);
		System.out.println();
		
	}
	
}

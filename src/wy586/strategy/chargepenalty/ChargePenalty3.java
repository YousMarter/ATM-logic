package wy586.strategy.chargepenalty;
import wy586.Console;
import wy586.ATM.ATM_3;

public class ChargePenalty3 implements ChargePenalty
{

	@Override
	public void penalty()
	{
		{
		Console.d3.balance = Console.d3.balance-ATM_3.PENALTY;
		System.out.println("BALANCE BELOW MINIMUM. $"+ATM_3.PENALTY+" PENALTY APPLIED");
		}
	}

}
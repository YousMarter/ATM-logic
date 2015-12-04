package wy586.strategy.chargepenalty;
import wy586.Console;
import wy586.ATM.ATM_1;

public class ChargePenalty1 implements ChargePenalty
{

	@Override
	public void penalty()
	{
		Console.d1.balance =Console.d1.balance- ATM_1.PENALTY;
		System.out.println("BALANCE BELOW MINIMUM. $"+ATM_1.PENALTY+" PENALTY APPLIED");
		
	}
	
}

package wy586.strategy.chargepenalty;
import wy586.Console;
import wy586.ATM.ATM_2;

public class ChargePenalty2 implements ChargePenalty
{

	@Override
	public void penalty()
	{
		if(Console.flag==2){
		Console.d2.balance = Console.d2.balance-ATM_2.PENALTY;
		System.out.println("BALANCE BELOW MINIMUM. $"+ATM_2.PENALTY+" PENALTY APPLIED");
		}
	}

}
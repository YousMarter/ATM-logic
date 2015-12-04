package wy586.strategy.storedata;

import wy586.Console;

public class StoreData1 implements StoreData
{

	@Override
	public void saveData()
	{
         Console.d1.pin = Console.tmp_pin1;
         Console.d1.balance = Console.tmp_balance1;
         System.out.println();
         System.out.println("Your opened your account successfully, please entry pin of your account.");
         System.out.println();
	}

}

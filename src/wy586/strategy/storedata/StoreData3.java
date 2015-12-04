package wy586.strategy.storedata;
import wy586.Console;
public class StoreData3 implements StoreData
{

	@Override
	public void saveData()
	{
         Console.d3.pin = Console.tmp_pin3;
         Console.d3.balance = Console.tmp_balance3;
         System.out.println();
         System.out.println("Your opened your account successfully, please entry pin of your account.");
         System.out.println();
	}

}
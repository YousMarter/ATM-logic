package wy586.strategy.storedata;
import wy586.Console;
public class StoreData2 implements StoreData
{

	@Override
	public void saveData()
	{
         Console.d2.pin = Console.tmp_pin2;
         Console.d2.balance = Console.tmp_balance2;
         System.out.println();
         System.out.println("Your opened your account successfully, please entry pin of your account.");
         System.out.println();
	}

}

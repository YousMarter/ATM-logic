package wy586.abstractFactory;

import wy586.strategy.chargepenalty.ChargePenalty;
import wy586.strategy.chargepenalty.ChargePenalty3;
import wy586.strategy.dispalybalbelowmin.DispalyBalBelowMin;
import wy586.strategy.dispalybalbelowmin.DispalyBalBelowMin1;
import wy586.strategy.displaybalance.DispalyBalance;
import wy586.strategy.displaybalance.DisplayBalance3;
import wy586.strategy.displayenterpin.DisplayEnterPin;
import wy586.strategy.displayenterpin.DisplayEnterPin1;
import wy586.strategy.displayincorrectpin.DisplayIncorrectPin;
import wy586.strategy.displayincorrectpin.DisplayIncorrectPin1;
import wy586.strategy.displaymenu.DisplayMenu;
import wy586.strategy.displaymenu.DisplayMenu3;
import wy586.strategy.displaytoomanyattempts.DisplayTooManyAttempts;
import wy586.strategy.displaytoomanyattempts.DisplayTooManyAttempts1;
import wy586.strategy.eject.Eject;
import wy586.strategy.eject.Eject1;
import wy586.strategy.makedeposit.MakeDeposit;
import wy586.strategy.makedeposit.MakeDeposit3;
import wy586.strategy.makewithdrawal.MakeWithdrawal;
import wy586.strategy.makewithdrawal.MakeWithdrawal3;
import wy586.strategy.storedata.StoreData;
import wy586.strategy.storedata.StoreData3;

public class ATMFactory3 implements ATMFactory
{
	@Override
	public DisplayMenu createDisplayMenu()
	{
		return new DisplayMenu3();
	}

	@Override
	public DisplayIncorrectPin createDisplayIncorrectPin()
	{
		return new DisplayIncorrectPin1();
	}

	@Override
	public DisplayTooManyAttempts createDisplayTooManyAttempts()
	{
		return new DisplayTooManyAttempts1();
	}

	@Override
	public DispalyBalBelowMin createDispalyBalBelowMin()
	{
		return new DispalyBalBelowMin1();
	}

	@Override
	public DispalyBalance createDispalyBalance()
	{
		return new DisplayBalance3();
	}

	@Override
	public DisplayEnterPin createDisplayEnterPin()
	{
		return new DisplayEnterPin1();
	}

	@Override
	public MakeWithdrawal createMakeWithdraw()
	{
		return new MakeWithdrawal3();
	}

	@Override
	public ChargePenalty createChargePenalty()
	{
		return new ChargePenalty3();
	}

	@Override
	public MakeDeposit createMakeDeposit()
	{
		return new MakeDeposit3();
	}

	@Override
	public StoreData createStoreData()
	{
		return new StoreData3();
	}
	
	@Override
	public Eject createEject()
	{
		return new Eject1();
	}
}
package wy586.abstractFactory;

import wy586.strategy.chargepenalty.ChargePenalty;
import wy586.strategy.dispalybalbelowmin.DispalyBalBelowMin;
import wy586.strategy.displaybalance.DispalyBalance;
import wy586.strategy.displayenterpin.DisplayEnterPin;
import wy586.strategy.displayincorrectpin.DisplayIncorrectPin;
import wy586.strategy.displaymenu.DisplayMenu;
import wy586.strategy.displaytoomanyattempts.DisplayTooManyAttempts;
import wy586.strategy.eject.Eject;
import wy586.strategy.makedeposit.MakeDeposit;
import wy586.strategy.makewithdrawal.MakeWithdrawal;
import wy586.strategy.storedata.StoreData;

public interface ATMFactory
{
	public DisplayMenu createDisplayMenu();

	public DisplayIncorrectPin createDisplayIncorrectPin();

	public DisplayTooManyAttempts createDisplayTooManyAttempts();

	public DispalyBalBelowMin createDispalyBalBelowMin();

	public DispalyBalance createDispalyBalance();

	public DisplayEnterPin createDisplayEnterPin();

	public MakeWithdrawal createMakeWithdraw();

	public ChargePenalty createChargePenalty();

	public MakeDeposit createMakeDeposit();

	public StoreData createStoreData();

	public Eject createEject();

}
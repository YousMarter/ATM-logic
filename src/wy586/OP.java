package wy586;

import wy586.abstractFactory.ATMFactory;

public class OP
{
	public ATMFactory af;

	public void displayMenu()
	{
		af = Console.af;
		af.createDisplayMenu().showMenu();
	}

	public void displayIncorrectPin()
	{
		af = Console.af;
		af.createDisplayIncorrectPin().ShowIncorrectPin();
	}

	public void displayTooManyAttempts()
	{
		af = Console.af;
		af.createDisplayTooManyAttempts().showTooManyAttempts();
	}

	public void dispalyBalBelowMin()
	{
		af = Console.af;
		af.createDispalyBalBelowMin().showBalBelowMin();
	}

	public void dispalyBalance()
	{
		af = Console.af;
		af.createDispalyBalance().showBalance();
	}

	public void displayEnterPin()
	{
		af = Console.af;
		af.createDisplayEnterPin().showEnterPin();
	}

	public void makeWithdrawal()
	{
		af = Console.af;
		af.createMakeWithdraw()
		.withdraw();
	}

	public void chargePenalty()
	{
		af = Console.af;
		af.createChargePenalty().penalty();
	}

	public void makeDeposit()
	{
		af = Console.af;
		af.createMakeDeposit().deposit();
	}

	public void storeData()
	{
		af = Console.af;
		af.createStoreData().saveData();
	}
	
	public void eject()
	{
		af = Console.af;
		af.createEject().EjectCard();
	}

}
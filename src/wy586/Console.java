package wy586;

import java.util.Scanner;

import wy586.abstractFactory.ATMFactory;
import wy586.abstractFactory.ATMFactory1;
import wy586.abstractFactory.ATMFactory2;
import wy586.abstractFactory.ATMFactory3;
import wy586.ATM.ATM_1;
import wy586.ATM.ATM_2;
import wy586.ATM.ATM_3;
import wy586.data.*;

public class Console
{
	public static ATMFactory	af;
	public static Data1				d1;
	public static Data2				d2;
	public static Data3				d3;
	public static String			tmp_pin1;//atm1
	public static int				tmp_balance1;
	public static int				tmp_deposit1;
	public static int				tmp_withdraw1;
	public static int			    tmp_pin2;//atm2
	public static float				tmp_balance2;
	public static float				tmp_deposit2;
	public static float				tmp_withdraw2;
	public static int			    tmp_pin3;//atm3
	public static int				tmp_balance3;
	public static int				tmp_deposit3;
	public static int				tmp_withdraw3;
	public static int				ch;
	public static int               flag;
	public static MDA_EFSM						m				= new MDA_EFSM();
	public static OP		op			= new OP();

	public static void main(String[] args)
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("                                   CS586 ");
		System.out.println();
		System.out.println("                                  Project");
		System.out.println();
		System.out.println("                                  You  Wu");
		System.out.println();
		System.out.println("                              CWID: A20308578");
		System.out.println();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while (true)
		{
			System.out
					.println("                      Select ATM-1 or ATM-2 or ATM-3");
			System.out.println();
			System.out.println("          1. ATM-1");
			System.out.println("          2. ATM-2");
			System.out.println("          3. ATM-3");
			System.out.println("          4. Quit");
			System.out.println();
			System.out.println("  Select one ATM:");

			ch = scan.nextInt();
			if (ch == 4)
			{
				System.out.print("Operation: Quit ");
				System.exit(0);
				break;
			}
			else
			{
				if (ch == 1)
				{
					flag=1;
					ATM_1 atm1 = new ATM_1();
					af = new ATMFactory1();
					d1 = new Data1();

					String pin;
					int balance;
					int deposit;
					int withdraw;

					System.out.println();
					System.out.println("      ATM-1");
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. card(int,string)");
					System.out.println("   1. pin(string)");
					System.out.println("   2. deposit(int)");
					System.out.println("   3. withdraw(int)");
					System.out.println("   4. balance()");
					System.out.println("   5. lock(String)");
					System.out.println("   6. unlock(String)");
					System.out.println("   7. exit()");
					System.out.println();

					while (ch != 8)
					{
						System.out.println("      ATM-1 Execution    ");
						System.out.println();
						System.out.println("  Select Operation:");
						System.out
								.println("0-card,1-pin,2-deposit,3-withdraw,4-balance,5-lock,6-unlock,7-exit");

						ch = scan.nextInt();
						System.out.println();
						switch (ch)
						{
						case 0:
							System.out.print("Operation:  card (int x, string y) ");
							System.out.print("Enter value of the balance x: ");
							balance = scan.nextInt();
							System.out.print("Enter value of the pin p: ");
							pin = scan.next();
							atm1.card(balance,pin);
							scan.nextLine();
							System.out.println();
							break;
														
						case 1:
							System.out.print("Operation:  pin(String x) ");
							System.out.print("Enter value of the pin x ");
							pin = scan.next();
							atm1.pin(pin);
							scan.nextLine();
							System.out.println();
							break;
							
						case 2:
							System.out.print("Operation:  deposit(int d)");
							System.out.print("Enter value of the money you want to deposit d: ");
							deposit = scan.nextInt();
							atm1.deposit(deposit);
							scan.nextLine();
							System.out.println();
							break;
							
						case 3:
							System.out.print("Operation:  withdraw(int w) ");
							System.out.print("Enter value of the money you want to withdraw w: ");
							withdraw = scan.nextInt();
							atm1.withdraw(withdraw);
							scan.nextLine();
							System.out.println();
							break;
							
						case 4:
							System.out.print("Operation:  balance() ");
							atm1.balance();
							scan.nextLine();
							System.out.println();
							break;
														
						case 5:
							System.out.print("Operation:  lock(String x) ");
							System.out.print(" Enter value of the pin x: ");
							pin = scan.next();
							atm1.lock(pin);
							scan.nextLine();
							System.out.println();
							break;
							
						case 6:
							System.out.print("Operation:  unlock(String x) ");
							System.out.print(" Enter value of the pin x: ");
							pin = scan.next();
							atm1.unlock(pin);
							scan.nextLine();
							System.out.println();
							break;
							
						case 7:
							System.out.print("Operation: exit");
							atm1.exit();
							break;
							
						}
					}
				}
				else if (ch == 2)
				{
					flag=2;
					ATM_2 atm2 = new ATM_2();
					af = new ATMFactory2();
					d2 = new Data2();

					System.out.println();
					System.out.println("      ATM-2");
					System.out.println();
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. CARD(float,int)");
					System.out.println("   1. PIN(int)");
					System.out.println("   2. DEPOSIT(float)");
					System.out.println("   3. WITHDRAW(float)");
					System.out.println("   4. BALANCE()");
					System.out.println("   5. EXIT()");
					System.out.println();

					int pin;
					float balance;
					float deposit;
					float withdraw;

					while (ch != 6)
					{
						System.out.println("      ATM-2 Execution");
						System.out.println();
						System.out.println("     Select Operation:");
						System.out.println("0-Card,1-PIN,2-DEPOSIT,3-WITHDRAW,4-BALANCE,5-EXIT");

						ch = scan.nextInt();
						System.out.println();
						switch (ch)
						{
						case 0:
							System.out.print("Operation:  card (float x, int y) ");
							System.out.print("Enter value of the balance x: ");
							balance = scan.nextFloat();
							System.out.print("Enter value of the pin p: ");
							pin = scan.nextInt();
							atm2.card(balance,pin);
							scan.nextLine();
							System.out.println();
							break;
			
						case 1:
							System.out.print("Operation:  PIN(int x) ");
							System.out.print("Enter value of the PIN x ");
							pin = scan.nextInt();
							atm2.pin(pin);
							System.out.println();
							break;
							
						case 2:
							System.out.print("Operation:  DEPOSIT(float d)");
							System.out.print("Enter value of the money you want to deposit d: ");
							deposit = scan.nextFloat();
							atm2.deposit(deposit);
							scan.nextLine();
							System.out.println();
							break;
							
						case 3:
							System.out.print("Operation:  WITHDRAW(float w) ");
							System.out.print("Enter value of the money you want to withdraw w: ");
							withdraw = scan.nextFloat();
							atm2.withdraw(withdraw);
							scan.nextLine();
							System.out.println();
							break;
							
						case 4:
							System.out.print("Operation:  BALANCE() ");
							atm2.balance();
							System.out.println();
							break;
							
						case 5:
							System.out.print("Operation: EXIT");
							atm2.exit();
							break;

						}
					}
				}
				if (ch == 3)
				{
					flag=3;
					ATM_3 atm3 = new ATM_3();
					af = new ATMFactory3();
					d3 = new Data3();

					int pin;
					int balance;
					int deposit;
					int withdraw;

					System.out.println();
					System.out.println("      ATM-3");
					System.out.println("  MENU of Operations");
					System.out.println();
					System.out.println("   0. card(int,int)");
					System.out.println("   1. pin(int)");
					System.out.println("   2. deposit(int)");
					System.out.println("   3. withdraw(int)");
					System.out.println("   4. balance()");
					System.out.println("   5. lock()");
					System.out.println("   6. unlock()");
					System.out.println("   7. exit()");
					System.out.println();

					while (ch != 8)
					{
						System.out.println("      ATM-3 Execution    ");
						System.out.println();
						System.out.println("  Select Operation:");
						System.out
								.println("0-card,1-pin,2-deposit,3-withdraw,4-balance,5-lock,6-unlock,7-exit");

						ch = scan.nextInt();
						System.out.println();
						switch (ch)
						{
						case 0:
							System.out.print("Operation:  card (int x, int y) ");
							System.out.print("Enter value of the balance x: ");
							balance = scan.nextInt();
							System.out.print("Enter value of the pin p: ");
							pin = scan.nextInt();
							atm3.card(balance,pin);
							scan.nextLine();
							System.out.println();
							break;
														
						case 1:
							System.out.print("Operation:  pin(int x) ");
							System.out.print("Enter value of the pin x ");
							pin = scan.nextInt();
							atm3.pin(pin);
							scan.nextLine();
							System.out.println();
							break;
							
						case 2:
							System.out.print("Operation:  deposit(int d)");
							System.out.print("Enter value of the money you want to deposit d: ");
							deposit = scan.nextInt();
							atm3.deposit(deposit);
							scan.nextLine();
							System.out.println();
							break;
							
						case 3:
							System.out.print("Operation:  withdraw(int w) ");
							System.out.print("Enter value of the money you want to withdraw w: ");
							withdraw = scan.nextInt();
							atm3.withdraw(withdraw);
							scan.nextLine();
							System.out.println();
							break;
							
						case 4:
							System.out.print("Operation:  balance() ");
							atm3.balance();
							scan.nextLine();
							System.out.println();
							break;
														
						case 5:
							System.out.print("Operation:  lock() ");
							atm3.lock();
							scan.nextLine();
							System.out.println();
							break;
							
						case 6:
							System.out.print("Operation:  unlock() ");
							atm3.unlock();
							scan.nextLine();
							System.out.println();
							break;
							
						case 7:
							System.out.print("Operation: exit");
							atm3.exit();
							break;
							
						}
					}
				}
			}
		}
	}
}

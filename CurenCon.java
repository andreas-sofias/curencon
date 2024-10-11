package curencon;
import java.util.*;
import java.lang.*;
import java.io.*;

public class CurenCon {

	public static void main(String[] args) throws InterruptedException {
			String euro = "EUR";
			String usd = "USD";
			String yen = "YEN";
			String renmibi = "RMB";
			String sterling = "GBP"; //fixed variables for currency strings
		
			String baseCurr;
			double amount;
			String endCurr;
			String input;			//variables for programm to function
		
			Scanner sc = new Scanner(System.in);
			header();
			sleep();
			System.out.print("Nice, what is the currency you are holding ('eur' for euro, 'usd' for USD, 'yen' for yen,"
					+        "'rmb' for renmibi, 'gbp' for british pounds)?");
			input = sc.next();
			baseCurr = assignCur(input);
			sleep();
			System.out.print("Now I want to ask you which currency you want to convert to(same inputs as above):");
			input = sc.next();
			endCurr = assignCur(input);
			sleep();
			System.out.print("Give me the amount of money you currently have: ");
			amount = sc.nextDouble();																						
			if (baseCurr.equals("error") || endCurr.equals("error"))									//input checker
				{
				System.out.println("\nDo not use programme incorrectly...exiting");
				System.exit(0);
				}
			
			if (baseCurr.equals(euro)) 	// if for base currency expands to converting functions 
				{
					switch (endCurr) 
					{
					case "USD": System.out.format("%.2f of EUR corresponds to %.2f USD",amount,eur_to_usd(amount));
							    break;
					case "YEN": System.out.format("%.2f of EUR corresponds to %.2f YEN",amount,eur_to_yen(amount));
				    			break;
					case "RMB": System.out.format("%.2f of EUR corresponds to %.2f RMB",amount,eur_to_rmb(amount));
				    			break;
					case "GBP": System.out.format("%.2f of EUR corresponds to %.2f GBP",amount,eur_to_gbp(amount));
				    			break;
					}
				}
			else if (baseCurr.equals(usd)) 
			{
				switch (endCurr) 
				{
				case "EUR": System.out.format("%.2f of USD corresponds to %.2f EUR",amount,usd_to_eur(amount));
						    break;
				case "YEN": System.out.format("%.2f of USD corresponds to %.2f YEN",amount,usd_to_yen(amount));
			    			break;
				case "RMB": System.out.format("%.2f of USD corresponds to %.2f RMB",amount,usd_to_rmb(amount));
			    			break;
				case "GBP": System.out.format("%.2f of USD corresponds to %.2f GBP",amount,usd_to_gbp(amount));
			    			break;
				}
			}
			else if (baseCurr.equals(yen)) 
			{
				switch (endCurr) 
				{
				case "EUR": System.out.format("%.2f of YEN corresponds to %.2f EUR",amount,yen_to_eur(amount));
						    break;
				case "USD": System.out.format("%.2f of YEN corresponds to %.2f USD",amount,yen_to_usd(amount));
			    			break;
				case "RMB": System.out.format("%.2f of YEN corresponds to %.2f RMB",amount,yen_to_rmb(amount));
			    			break;
				case "GBP": System.out.format("%.2f of YEN corresponds to %.2f GBP",amount,yen_to_gbp(amount));
			    			break;
				}
			}
			else if (baseCurr.equals(renmibi)) 
			{
				switch (endCurr) 
				{
				case "EUR": System.out.format("%.2f of RMB corresponds to %.2f EUR",amount,renmibi_to_eur(amount));
						    break;
				case "USD": System.out.format("%.2f of RMB corresponds to %.2f USD",amount,renmibi_to_usd(amount));
			    			break;
				case "RMB": System.out.format("%.2f of RMB corresponds to %.2f YEN",amount,renmibi_to_yen(amount));
			    			break;
				case "GBP": System.out.format("%.2f of RMB corresponds to %.2f GBP",amount,renmibi_to_gbp(amount));
			    			break;
				}
			}
			else if (baseCurr.equals(sterling)) 
			{
				switch (endCurr) 
				{
				case "EUR": System.out.format("%.2f of GBP corresponds to %.2f EUR",amount,sterling_to_eur(amount));
						    break;
				case "USD": System.out.format("%.2f of GBP corresponds to %.2f USD",amount,sterling_to_usd(amount));
			    			break;
				case "RMB": System.out.format("%.2f of GBP corresponds to %.2f RMB",amount,sterling_to_rmb(amount));
			    			break;
				case "GBP": System.out.format("%.2f of GBP corresponds to %.2f YEN",amount,sterling_to_yen(amount));
			    			break;
				}
			}
			System.out.print("\nThank you for using our converter!\n\n");
	}
	
	/*--------------------------EURO -> CURRENCIES ----------------------------*/
	
	private static double eur_to_usd(double input)
	{
		return input*1.09;
	}
	private static double eur_to_yen(double input)
	{
		return input*163.36;
	}

	private static double eur_to_rmb(double input)
	{
		return input*7.73;
	}
	private static double eur_to_gbp(double input) 
	{
		return input*0.89;
	}
	
	/*-----------------------USD -> CURRENCIES -----------------------------------*/
	
	private static double usd_to_eur(double input)
	{
		return input*0.91;
	}
	private static double usd_to_yen(double input)
	{
		return input*149.26;
	}

	private static double usd_to_rmb(double input)
	{
		return input*7.07;
	}
	private static double usd_to_gbp(double input) 
	{
		return input*0.76;
	}
	/* ============================= yen -> currencies =======================*/
	
	private static double yen_to_eur(double input)
	{
		return input*0.0061;
	}
	private static double yen_to_usd(double input)
	{
		return input*0.0067;
	}

	private static double yen_to_rmb(double input)
	{
		return input*0.047;
	}
	private static double yen_to_gbp(double input) 
	{
		return input*0.0051;
	}
	
	/* ================================= RMB -> CURRENCIES========================*/
	
	private static double renmibi_to_eur(double input)
	{
		return input*0.13;
	}
	private static double renmibi_to_usd(double input)
	{
		return input*0.14;
	}

	private static double renmibi_to_yen(double input)
	{
		return input*21.10;
	}
	private static double renmibi_to_gbp(double input) 
	{
		return input*0.11;
	}
	
	/*==============================sterling -> currencies========================*/
	
	private static double sterling_to_eur(double input)
	{
		return input*1.19;
	}
	private static double sterling_to_usd(double input)
	{
		return input*1.31;
	}

	private static double sterling_to_rmb(double input)
	{
		return input*9.24;
	}
	private static double sterling_to_yen(double input) 
	{
		return input*195.03;
	}
	
	// fixes string for comparisons 
	
	private static String assignCur(String input) 
	{
		if (input.equalsIgnoreCase("eur"))
				return "EUR";
		else if (input.equalsIgnoreCase("usd"))
				return "USD";
		else if (input.equalsIgnoreCase("rmb"))
				return "RMB"; 
		else if (input.equalsIgnoreCase("yen"))
				return "YEN";
		else if (input.equalsIgnoreCase("gbp"))
				return "GBP";
		else return "error";
	}
	
	// sleep function 
	
	private static void sleep() throws InterruptedException
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	//header of program
	
	private static void header()
	{
		System.out.print("=============================================================================================\n");
		System.out.print(" ______     __  __     ______     ______     __   __     ______     ______     __   __    \n"
				+ "/\\  ___\\   /\\ \\/\\ \\   /\\  == \\   /\\  ___\\   /\\ \"-.\\ \\   /\\  ___\\   /\\  __ \\   /\\ \"-.\\ \\   \n"
				+ "\\ \\ \\____  \\ \\ \\_\\ \\  \\ \\  __<   \\ \\  __\\   \\ \\ \\-.  \\  \\ \\ \\____  \\ \\ \\/\\ \\  \\ \\ \\-.  \\  \n"
				+ " \\ \\_____\\  \\ \\_____\\  \\ \\_\\ \\_\\  \\ \\_____\\  \\ \\_\\\\\"\\_\\  \\ \\_____\\  \\ \\_____\\  \\ \\_\\\\\"\\_\\ \n"
				+ "  \\/_____/   \\/_____/   \\/_/ /_/   \\/_____/   \\/_/ \\/_/   \\/_____/   \\/_____/   \\/_/ \\/_/ \n"
				+ "                                                                                          \n");
		System.out.print("==============================================================================================\n");
		System.out.println("\nCurrency converter made in java"
				+          "\npowered by ains0ph			\n");
		System.out.print("==============================================================================================\n");
	}
}

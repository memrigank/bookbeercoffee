package C.javaindeapth.src.com.basics;
import util.moneyTransferService;

public class moneyConverter{

public static double[] rates;
public static int index;

public static void main(String[] args){
	
	rates = new double[]{63.0, 3.0, 3.0, 595.5, 18.0, 107.0, 2.0};
	moneyConverter mC = new moneyConverter();
	moneyTransferService mTS = new moneyTransferService();
	System.out.println("Rates[0] "+rates[0]);
	System.out.println("Rates[1] "+rates[1]);
	System.out.println("Rates[2] "+rates[2]);
	System.out.println("Rates[3] "+rates[3]);
	System.out.println("Rates[4] "+rates[4]);
	System.out.println("Rates[5] "+rates[5]);
	System.out.println("Rates[6] "+rates[6]);

	double amount = mC.getExchangeRatesOfIndex(3);
	System.out.println("the return value of the shown index is: "+ amount);
	amount = mC.setExchangeRatesOfIndex(2,23.0);
	System.out.println("the value set to the shown index is: "+ amount);
	amount = mTS.transferMoney(3,1000,mC);
	System.out.println("the transfered money is: "+ amount);
	
}
}
class newCurrencyConverter{

	static double[] exchangeRates;

	void setExchangeRates(double[] rates){
		exchangeRates = rates;
	}

	void updateExchangeRate(int arrayIndex, double newVal){
		exchangeRates[arrayIndex]= newVal;
	}

	void printCurrencies(){
		System.out.println("\nrupee: " + exchangeRates[0]);
        System.out.println("dirham: " + exchangeRates[1]);
    	System.out.println("real: " + exchangeRates[2]);
    	System.out.println("chilean_peso: " + exchangeRates[3]);
    	System.out.println("mexican_peso: " + exchangeRates[4]);
    	System.out.println("_yen: " + exchangeRates[5]);
    	System.out.println("$australian: " + exchangeRates[exchangeRates.length-1]);
	}


	public static void main(String[] args){
		newCurrencyConverter nCC = new newCurrencyConverter();
		double[] rates = {63.0,3.0,3.2,595.5,18.1,107.0,2.0};
		nCC.setExchangeRates(rates);
		nCC.printCurrencies();
		nCC.updateExchangeRate(2,3.5);
		nCC.printCurrencies();

	}
}
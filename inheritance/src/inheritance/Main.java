package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer bireyselM��teri = new IndividualCustomer();
		bireyselM��teri.customerNumber="11111111";
		
		CorporateCustomer kurumsalM��teri = new CorporateCustomer();
		kurumsalM��teri.customerNumber="22222222";
		
		SendikaCustomer sendikaCustomer = new SendikaCustomer();
		sendikaCustomer.customerNumber = "33333333";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(kurumsalM��teri);
		//customerManager.add(bireyselM��teri);
		//customerManager.add(sendikaCustomer);
		Customer[] customers = {bireyselM��teri,kurumsalM��teri,sendikaCustomer};
		
		customerManager.addMultiple(customers);
	}

}

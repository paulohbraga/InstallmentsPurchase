package models.services;

public class PaypalTaxService implements TaxService {

	@Override
	public double calcTax(double installment) {
		double tax = installment * 0.2;
		return tax;
	}

}

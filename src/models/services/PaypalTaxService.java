package models.services;

public class PaypalTaxService implements TaxService {

	@Override
	public double calcTax(double installment, double rate) {
		double simple_interest = installment * (0.01 * rate);
		double payment_fee = installment * 0.02;
		return installment + simple_interest + payment_fee;
	}

}

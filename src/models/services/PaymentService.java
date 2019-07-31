package models.services;

import java.util.List;

import models.entities.Installment;

public class PaymentService {
	
	private List<Installment> installments;
	private TaxService taxService;
	
	
	public PaymentService(List<Installment> installments, TaxService taxService) {
		super();
		this.installments = installments;
		this.taxService = taxService;
	}
	
	
	public List<Installment> getInstallments() {
		return installments;
	}



	public void setInstallments(List<Installment> installments) {
		this.installments = installments;
	}



	public TaxService getTaxService() {
		return taxService;
	}



	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}


	
	
	
}

package models.services;

import java.util.ArrayList;

import models.entities.Contract;
import models.entities.Installment;

public class ProcessInstallments {
	
	private ArrayList<Installment> installments;
	private Contract contract;
	private Integer number_installments;
	private TaxService taxService;
	
	public ProcessInstallments(ArrayList<Installment> installments, Contract contract, Integer number_installments, PaypalTaxService tax) {
		super();
		this.installments = installments;
		this.contract = contract;
		this.number_installments = number_installments;
		this.taxService = tax;
	}

	public ArrayList<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(ArrayList<Installment> installments) {
		this.installments = installments;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public Integer getNumber_installments() {
		return number_installments;
	}

	public void setNumber_installments(Integer number_installments) {
		this.number_installments = number_installments;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}

	public void processinstallments() {
		
		for (int i = 0; i < number_installments; i++) {
			System.out.println(contract.getTaxService().calcTax(installments.get(i).getAmount(), i+1));
		}
	}

}

package models.entities;

import java.util.ArrayList;
import java.util.Date;

import models.services.TaxService;

public class Contract {
	
	private Integer number;
	private Date dateContract;
	private Double totalValue;
	private TaxService taxService;
	
	private ArrayList<Installment> installment;

	public Contract(Integer number, Date dateContract, Double totalValue, TaxService taxService) {
		this.number = number;
		this.dateContract = dateContract;
		this.totalValue = totalValue;
		this.taxService = taxService;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public ArrayList<Installment> getInstallment() {
		return installment;
	}

	public void setInstallment(ArrayList<Installment> installment) {
		this.installment = installment;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}
	
	

}

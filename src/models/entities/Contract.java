package models.entities;

import java.util.Date;

public class Contract {
	
	private Integer number;
	private Date dateContract;
	private Double totalValue;
	
	private Installment installment;

	public Contract(Integer number, Date dateContract, Double totalValue, Installment installment) {
		this.number = number;
		this.dateContract = dateContract;
		this.totalValue = totalValue;
		this.installment = installment;
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

	public Installment getInstallment() {
		return installment;
	}

	public void setInstallment(Installment installment) {
		this.installment = installment;
	}
	
	

}

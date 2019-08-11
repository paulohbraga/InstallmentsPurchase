package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import models.entities.Contract;
import models.entities.Installment;
import models.services.PaypalTaxService;
import models.services.ProcessInstallments;
import models.services.TaxService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter contract data");
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Number: ");
		Integer number = Integer.parseInt(sc.nextLine());
		System.out.print("Data: (dd/MM/yyyy): ");
		Date date_start = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		Double c_value = Double.parseDouble(sc.nextLine());
		System.out.print("Enter the number of installments: ");
		Integer number_installments = Integer.parseInt((sc.nextLine()));
		sc.close();
		
		ArrayList<Installment> installments = new ArrayList<>();
		Contract contract = new Contract(number, date_start, c_value, new PaypalTaxService());

		for (int i = 0; i < number_installments; i++) {
			installments.add(new Installment(date_start, c_value / number_installments));
			
		}
		
		ProcessInstallments processInstallments = new ProcessInstallments(installments, contract, number_installments, new PaypalTaxService());
		System.out.println("Installments: ");
		processInstallments.processinstallments();
			

	}
}

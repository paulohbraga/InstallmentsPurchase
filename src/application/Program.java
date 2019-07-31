package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import models.entities.Contract;
import models.entities.Installment;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		Date data = sdf.parse("30/01/2019 20:00");
		ArrayList<Installment> parcelas = new ArrayList<>();
		double total = 300;
		int numparcelas = 3;
		for (int i = 0; i < numparcelas; i++) {
			Contract contract = new Contract(3333, data, 300.0, new Installment(data, 3.0));
			parcelas.add(new Installment(data, total / numparcelas));
		
		}
		for (int i = 0; i < numparcelas; i++) {
			
			System.out.println(parcelas.get(i).getAmount() + " " + parcelas.get(i).getDueDate());
		}
		

	}
}

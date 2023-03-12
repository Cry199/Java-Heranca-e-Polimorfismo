package app;

import java.util.*;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			System.out.printf("Tax payer #%d data:\n", i);
			
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: "); 
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(type == 'i')
			{
				System.out.print("Health expenditures: ");
				double healthExpen = sc.nextDouble();
						
				list.add(new Individual(name,anualIncome,healthExpen));
			}
			else
			{
				System.out.print("Number of employees: ");
				int numeberOfEmployees = sc.nextInt();
						
				list.add(new Company(name,anualIncome,numeberOfEmployees));
			}
		}
		
		System.out.println("");
		
		double sum = 0;
		System.out.println("TAXES PAID:");
		for(TaxPayer tax : list)
		{
			System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.tax()));
			sum += tax.tax();
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		
		sc.close();
	}

}

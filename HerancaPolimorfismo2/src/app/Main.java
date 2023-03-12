package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main{

	public static void main(String[] args) throws ParseException 
	{
		Scanner sc = new Scanner(System.in);	
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of product: ");
		int n = sc.nextInt();
		
		sc.nextLine();
		for(int i = 1; i <= n; i++)
		{
			
			System.out.println("Product #" + i + " data: ");
			System.out.print("common, used or imported (c/u/i)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
	
			if(type == 'i')
			{
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

				list.add(new UsedProduct(name,price,date));
			}
			else if(type == 'c')
			{	
				list.add(new Product(name,price));
			}
			else
			{
				System.out.print("Customs fee: ");
				double customs = sc.nextDouble();	
				list.add(new ImportedProduct(name,price,customs));
			}
		}
		
		System.out.println("");
		
		System.out.println("Price Tags:");
		
		for(Product prod : list)
		{
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}

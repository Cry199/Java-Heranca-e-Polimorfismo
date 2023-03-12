package app;

import java.util.*;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) 
		{
			System.out.println("Employee #" + i + " data:");
			
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			
			if (ch == 'y') 
			{
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else 
			{
				list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		
		System.out.println("PAYMENTS:");
		for (Employee emp : list) 
		{
			System.out.printf("%s - $ %.2f", emp.getName(), emp.payment());
		}
		
		sc.close();
	}

}

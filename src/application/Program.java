package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner scan = new Scanner(System.in);

		List<Employee> employeeList = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int nEmployees = scan.nextInt();

		for (int cont = 1; cont <= nEmployees; cont++) {
			System.out.println("Employee #" + cont + " Data:");
			System.out.println("Outsourced (y/n) ?");
			char employeeType = scan.next().charAt(0);
			scan.nextLine();
			if (employeeType == 'y') {
				System.out.print("Name: ");
				String name = scan.nextLine();
				System.out.print("Hours: ");
				int hours = scan.nextInt();
				System.out.print("Value per Hour: ");
				double valuePerHour = scan.nextDouble();
				System.out.print("Additional Change: ");
				double additionalChange = scan.nextDouble();
				Employee outEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalChange);
				employeeList.add(outEmployee);
			} else if (employeeType == 'n') {
				System.out.print("Name: ");
				String name = scan.nextLine();
				System.out.print("Hours: ");
				int hours = scan.nextInt();
				System.out.print("Value per Hour: ");
				double valuePerHour = scan.nextDouble();
				Employee Employee = new Employee(name, hours, valuePerHour);
				employeeList.add(Employee);
			} else {
				System.out.println("Resposta inválida");
			}
		}
		System.out.println();
		for (Employee emp : employeeList) {
			System.out.println(emp);
		}
		
		scan.close();

	}

}

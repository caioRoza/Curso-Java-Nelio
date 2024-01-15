package entities;

public class Employee {

	public String name;
	public double grossalary;
	public double tax;
	
	public double netSalary() {
		return grossalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		grossalary += grossalary * percentage / 100.0;
	}
	
	public String toString() {
		return name + ", $" + String.format("%.2f",netSalary());
	}
}

package com.hibernate.JUnitMaven;


public class BasicSalaryCalculator {
	private double basicSalary;

	public double getBasicSalary() {
		return basicSalary;

	}

	public void setBasicSalary(double basicSalary) {
		if (basicSalary < 0) {
			throw new IllegalArgumentException("Negative Salary is Invalid");
		}
		this.basicSalary=basicSalary;
	}
	public double getGrossSalary() {
		return this.basicSalary+ getSocialInsurence()+ AdditionalBonus();
	}

	public double getSocialInsurence() 
	{
		return this.basicSalary*25/100;
	}

	public double AdditionalBonus()
	{
		return this.basicSalary/10;
	}
}
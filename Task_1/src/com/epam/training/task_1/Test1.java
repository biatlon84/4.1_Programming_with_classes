package com.epam.training.task_1;

public class Test1 {
	private double variable1 = 0;
	private double variable2 = 0;

	public Test1() {
	}

	public double getMaxVariable() {
		return variable1 < variable2 ? variable2 : variable1;
	}

	public void setVariable1(double variable1) {
		this.variable1 = variable1;
	}

	public double getSumVar() {
		return variable2 + variable1;
	}

	public void setVariable2(double variable2) {
		this.variable2 = variable2;
	}

	public double printVariable2(int r) {
		Print.doub("Vareble2 = ", variable2, r);
		return variable2;
	}

	public double printVariable1(int r) {
		Print.doub("Vareble1 = ", variable1, r);
		return variable1;
	}

	public double getVariable1() {
		return variable1;
	}

	public double getVariable2() {
		return variable2;
	}

	public void printMaxVariable(int r) {
		Print.doub("VarebleMaxVariable = ", getMaxVariable(), r);
	}

	public void printSumVar(int r) {
		Print.doub("VarebleSumVar = ", getSumVar(), r);
	}
}
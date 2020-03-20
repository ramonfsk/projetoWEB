package br.com.calculator;

public class OperatingClass {
	//Properties
	private double num1;
	private double num2;
	private String operator;
	private double result;
	//Constructors
	public OperatingClass(double num1, double num2, String operator) {
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	//Accessors
	public double getResult() {
		return this.result;
	}
	//Methods
	public void calc() {
		switch(operator) {
			case "+":
				this.result = (this.num1 + this.num2);
				break;
			case "-":
				this.result = (this.num1 - this.num2);
				break;
			case "*":
				this.result = (this.num1 * this.num2);
				break;
			case "/":
				this.result = (this.num1 / this.num2);
				break;
		}
	}
}

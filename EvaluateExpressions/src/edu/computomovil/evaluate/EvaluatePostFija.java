package edu.computomovil.evaluate;

import java.util.ArrayList;
import java.util.Stack;

public class EvaluatePostFija {
	
	private Stack<String> stack = new Stack<String>();
	String a, b;
	double tmpRes = 0;
	
	public double evaluateExpPostFija(ArrayList<String> expressionPost){
		for(String elem : expressionPost){
			if(!this.isOperator(elem)){
				stack.push(elem);
			}else{
				b = stack.pop();
				a = stack.pop();
				tmpRes = this.evaluate(Double.valueOf(a), Double.valueOf(b), elem);
				stack.push(String.valueOf(tmpRes));
			}
		}
		return Double.valueOf(stack.pop());
	}
	
	public boolean isOperator(String elem){
		if(elem == "+" || elem == "-" || elem == "x" || elem == "/")return true;
		return false;
	}
	
	public double evaluate(double op1, double op2, String operator){
		if(operator == "+"){
			return op1 + op2;
		}
		if(operator == "-"){
			return op1 - op2;
		}
		if(operator == "x"){
			return op1 * op2;
		}
		if(operator == "/"){
			return op1 / op2;
		}
		return 0;
	}
	
}

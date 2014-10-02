package edu.computomovil.postfija;

import java.util.ArrayList;
import java.util.Stack;

public class InfijaPostFija {
	
	private ArrayList<String> expressionPost = new ArrayList<String>();
	private Stack<String> stack = new Stack<String>();
	
	public ArrayList<String> infijaPosfija(ArrayList<String> expressionInf){
		
		for(String elem : expressionInf){
			boolean isOperator = this.isOperator(elem);
			if(!isOperator){
				expressionPost.add(elem);
			}
		}
		while(!stack.isEmpty()){
			this.expressionPost.add(stack.pop());
		}
		
		return this.expressionPost;
	}
	
	public boolean isOperator(String elem){
		if(elem == "+" || elem == "-" || elem == "x" || elem == "/"){
			if(stack.isEmpty()){
				stack.push(elem);
			}else{
				this.checkPriority(elem);
			}
			return true;
		}
		return false;
	}
	
	public void checkPriority(String operator){
		int priorityNext = this.getPriority(operator);
		int priorityCurrent = this.getPriority(stack.peek());
		
		if(priorityNext > priorityCurrent){
			stack.push(operator);
		}else{
			String tmp = stack.pop();
			this.expressionPost.add(tmp);
			this.isOperator(operator);
		}
	}
	
	public int getPriority(String operator){
		if("+".equals(operator) || "-".equals(operator)){
			return 1;
		}else{
			return 2;
		}
	}
	
}

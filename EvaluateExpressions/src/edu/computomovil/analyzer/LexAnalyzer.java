package edu.computomovil.analyzer;

import java.util.ArrayList;
import java.util.List;

public class LexAnalyzer {
	
	private ArrayList<String> finalTokens = new ArrayList<String>();
	private int index = 0;
	private StringBuilder strBuilder;
	
	public void setIndex(int index) {
		this.index = index;
	}

	public void doAnalysis(char[] expression){
		int i = 0;
		char character;
		while(this.getIndex() <  expression.length){
			character = expression[this.getIndex()];
			if(Character.isDigit(character)){
				this.getNumber(expression, this.getIndex());
				i = getIndex();
			}else if(character == '+' || character == '-' || character == 'x' || character == '/' ){
				strBuilder = new StringBuilder();
				strBuilder.append(character);
				this.finalTokens.add(strBuilder.toString());
				this.setIndex(++i);
			}			
		}
	}
	
	public void getNumber(char[] expression, int tmpIndex){
		StringBuilder strBuilder = new StringBuilder();
		int length = expression.length;
		boolean isPoint = false;
		while(tmpIndex < length && Character.isDigit(expression[tmpIndex])){
			strBuilder.append(expression[tmpIndex]);
			tmpIndex++;
		}
		if(tmpIndex < length && expression[tmpIndex] == '.'){
			isPoint = true;
			strBuilder.append(expression[tmpIndex]);
			tmpIndex++;
			while(tmpIndex < length && Character.isDigit(expression[tmpIndex])){
				strBuilder.append(expression[tmpIndex]);
				tmpIndex++;
			}
		}
		this.setIndex(tmpIndex);
		this.finalTokens.add(strBuilder.toString());
	}

	public ArrayList<String> getFinalTokens() {
		return finalTokens;
	}
	
	public int getIndex() {
		return index;
	}
	
}

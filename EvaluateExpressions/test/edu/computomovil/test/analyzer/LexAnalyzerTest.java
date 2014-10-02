package edu.computomovil.test.analyzer;

import java.util.ArrayList;

import org.junit.Test;

import edu.computomovil.analyzer.LexAnalyzer;

public class LexAnalyzerTest {

	private LexAnalyzer analyzer = new LexAnalyzer();
	
	@Test
	public void testDoAnalysis() {
		analyzer.doAnalysis("26.663x9.99+655.2".toCharArray());
		ArrayList<String> tokens = new ArrayList<String>();
		tokens = analyzer.getFinalTokens();
		System.out.printf(tokens.toString());
	}

	@Test
	public void testGetNumber() {
		//fail("Not yet implemented");
	}

}

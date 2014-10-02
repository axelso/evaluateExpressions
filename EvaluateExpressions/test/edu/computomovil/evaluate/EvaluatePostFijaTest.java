package edu.computomovil.evaluate;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class EvaluatePostFijaTest {

	EvaluatePostFija eval;
	ArrayList<String> postFija;
	
	@Before
	public void setUp() throws Exception {
		eval = new EvaluatePostFija();
		postFija = new ArrayList<String>();
		postFija.add("5.6");
		postFija.add("2.3");
		postFija.add("x");
		postFija.add("2");
		postFija.add("/");
		postFija.add("8.1");
		postFija.add("+");
	}

	@Test
	public void testEvaluateExpPostFija() {
		double res = eval.evaluateExpPostFija(postFija);
		System.out.println("Result = " + res);
	}

	@Test
	public void testIsOperator() {
		//fail("Not yet implemented");
	}

	@Test
	public void testEvaluate() {
		//fail("Not yet implemented");
	}

}

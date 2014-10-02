package edu.computomovil.postfija;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class InfijaPostFijaTest {
	
	InfijaPostFija expPost;
	ArrayList<String> tokens;
	ArrayList<String> postFija;
	
	@Before
	public void setUp() throws Exception {
		expPost = new InfijaPostFija();
		postFija = new ArrayList<String>();
		tokens = new ArrayList<String>();
		tokens.add("5.6");
		tokens.add("x");
		tokens.add("2.3");
		tokens.add("/");
		tokens.add("2");
		tokens.add("+");
		tokens.add("8.1");
	}

	@Test
	public void testInfijaPosfija() {
		
		postFija = expPost.infijaPosfija(tokens);
		System.out.println("Done.. " + postFija.toString());
		
	}

	@Test
	public void testIsOperator() {
		//fail("Not yet implemented");
	}

	@Test
	public void testCheckPriority() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetPriority() {
		//fail("Not yet implemented");
	}

}

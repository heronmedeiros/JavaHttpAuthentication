package br.com.guia.tests.httpAuthentication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.guia.authentication.Constantes;


public class ContantsTest {

	@Test
	public void URL_should_be_not_null() {
		assertNotNull("Must have a URL", Constantes.URL);
	}
	
	@Test
	public void URL_should_be_a_String(){
		assertEquals(String.class, Constantes.URL.getClass());
	}
	
	@Test
	public void kpass_should_be_not_null() {
		assertNotNull("Must have a Pass", Constantes.kpass);
	}
	
	@Test
	public void kuser_should_be_not_null() {
		assertNotNull("Must have a User", Constantes.kuser);
	}

}

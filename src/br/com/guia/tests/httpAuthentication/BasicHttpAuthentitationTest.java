package br.com.guia.tests.httpAuthentication;

import static org.junit.Assert.assertEquals;
import java.net.PasswordAuthentication;

import org.junit.Test;

import br.com.guia.authentication.BasicHttpAuthentication;

public class BasicHttpAuthentitationTest {
	
	@Test
	public void PasswordAuthentication_should_return_PasswordAuthentication() {
		BasicHttpAuthentication bha = new BasicHttpAuthentication();
		
		assertEquals(PasswordAuthentication.class, bha.getPasswordAuthentication().getClass());
	}

}

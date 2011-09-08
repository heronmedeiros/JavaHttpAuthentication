package br.com.guia.authentication;

import java.net.Authenticator;
import java.net.PasswordAuthentication;



public class BasicHttpAuthentication extends Authenticator {

	public PasswordAuthentication getPasswordAuthentication() {
		//System.err.println("Feeding username and password for " + getRequestingScheme());
		return (new PasswordAuthentication(Constantes.kuser,
										   Constantes.kpass.
										   			toCharArray()));

	}
}

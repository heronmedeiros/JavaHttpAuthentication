package br.com.guia.tests.httpAuthentication;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BasicHttpAuthentitationTest.class,
	ContantsTest.class })
public class AllTests {

}

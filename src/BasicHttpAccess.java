import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URL;

public class BasicHttpAccess extends Authenticator {



	
	public PasswordAuthentication getPasswordAuthentication() {
			// I haven't checked getRequestingScheme() here, since for NTLM
			// and Negotiate, the username and password are all the same.
			System.err.println("Feeding username and password for "
					+ getRequestingScheme());
			return (new PasswordAuthentication(Constantes.kuser, Constantes.kpass.toCharArray()));
		
	}

	public static void main(String[] args) {
		Authenticator.setDefault(new BasicHttpAccess());
		URL url;
		try {
			url = new URL(Constantes.URL);
			InputStream ins;
			ins = url.openConnection().getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					ins));
			String str;
			while ((str = reader.readLine()) != null)
				System.out.println(str);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

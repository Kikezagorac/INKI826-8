package vezbi.br2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();

			Rechnik r = new Rechnik();
			r.vnesiMapa();
			r.translate(s);
		} 

		catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
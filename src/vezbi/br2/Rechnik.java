package vezbi.br2;

import java.util.HashMap;
import java.util.Map;

public class Rechnik {
	Map<String, String> rechnik = new HashMap<String, String>();

	public void vnesiMapa() {
		rechnik.put("Hello", "Zdravo");
		rechnik.put("Bye", "Chao");
		rechnik.put("Good luck", "So srekja");
		rechnik.put("Good night", "Dobra nokj");
		rechnik.put("Good day", "Dobar den");
		rechnik.put("Sunset", "Zajdisonce");
		rechnik.put("Sunrise", "Izgrejsonce");
	}

	public void translate (String s) {
		if (rechnik.containsKey(s)) 
		{
			System.out.println(rechnik.get(s));
		} 
		else
			System.out.println("Vo rechnikot ne postoi takov zbor kako napishaniot.");
	}
}
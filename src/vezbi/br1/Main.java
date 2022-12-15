package vezbi.br1;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<String,String> rechnik = new HashMap<String,String>();
		rechnik.put("hi", "zdravo");
		rechnik.put("bye", "chao");
		rechnik.put("good day", "dobar den");
		rechnik.put("good luck", "so srekja");
		rechnik.put("good night", "dobra nokj");

		System.out.println("Kluchni zborovi: "+rechnik.keySet());
		System.out.println("Vrednosti: "+rechnik.values());

		for(Map.Entry<String,String> entry : rechnik.entrySet()){
			System.out.println(entry.getKey()+" | "+entry.getValue());	
		}

		if(rechnik.containsKey("hi"))
			System.out.println("Vrednosta t.e prevodot za zborcheto 'hi' e :" + rechnik.get("hi") + ". ");
		else
			System.out.println("Ne postoi takov zbor.");
	}
}
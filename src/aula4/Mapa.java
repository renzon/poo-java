package aula4;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

	public static void main(String[] args) {
		Map<String, String> paises = new HashMap<String,String>();
		paises.put("Brasil", "Português");
		paises.put("Argentina", "Espanhol");
		System.out.println(paises.get("Argentinda"));
		System.out.println(paises.containsKey("Argentina"));
		paises.remove("Argentina");
		paises.remove("Argentina");
		for(String chave: paises.keySet()){
			System.out.println(chave+": "+paises.get(chave));
		}

	}

}

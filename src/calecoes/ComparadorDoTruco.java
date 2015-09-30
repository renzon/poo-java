package calecoes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ComparadorDoTruco implements Comparator<Carta> {

	@Override
	public int compare(Carta carta1, Carta carta2) {
		Map<String, Integer> pesosNumeros = new HashMap<String, Integer>();
		pesosNumeros.put("3", 13);
		pesosNumeros.put("2", 12);
		pesosNumeros.put("1", 11);
		for(int i=4; i<=10;++i){
			pesosNumeros.put(""+i,i);
		}
		
		Integer pesoNumeroCarta1= pesosNumeros.get(carta1.getNumero());
		Integer pesoNumeroCarta2= pesosNumeros.get(carta2.getNumero());
		int comp= pesoNumeroCarta1.compareTo(pesoNumeroCarta2);
		if (comp == 0) {

			Map<String, Integer> pesosNaipes = new HashMap<String, Integer>();
			pesosNaipes.put("♢", 1);
			pesosNaipes.put("♠", 2);
			pesosNaipes.put("♡", 3);
			pesosNaipes.put("♣", 4);
			Integer pesoDessaCarta = pesosNaipes.get(carta1.getNaipe());
			Integer pesoOutraCarta = pesosNaipes.get(carta2.getNaipe());
			return pesoDessaCarta.compareTo(pesoOutraCarta);
			
		} else {
			return comp;
		}
	}

}

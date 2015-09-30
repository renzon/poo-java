package calecoes;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Carta implements Comparable<Carta> {
	private String naipe;
	private String numero;

	public Carta(String numero, String naipe) {
		super();
		this.numero = numero;
		this.naipe = naipe;
	}

	public static void main(String[] args) {
		Carta asDePaus = new Carta("A", "♣");
		Carta asDePaus2 = new Carta("A", "♣");
		Carta seteDeCopas = new Carta("7", "♡");
		Carta valeteDeOuros = new Carta("J", "♢");
		Carta doisDeEspadas = new Carta("2", "♠");
		Set<Carta> deck1 = new HashSet<Carta>();
		deck1.add(asDePaus);
		deck1.add(doisDeEspadas);
		Set<Carta> deck2 = new HashSet<Carta>();
		deck2.add(asDePaus2);
		deck2.add(seteDeCopas);
		deck2.add(valeteDeOuros);

		System.out.println(deck1.contains(asDePaus2));
		System.out.println(deck1.contains(seteDeCopas));
		deck1.retainAll(deck2);
		System.out.println(deck1);

	}

	@Override
	public String toString() {
		return "Carta (" + naipe + ", " + numero + ")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((naipe == null) ? 0 : naipe.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		if (naipe == null) {
			if (other.naipe != null)
				return false;
		} else if (!naipe.equals(other.naipe))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public int compareTo(Carta o) {

		int comp = this.numero.compareTo(o.numero);
		if (comp == 0) {

			Map<String, Integer> pesosNaipes = new HashMap<String, Integer>();
			pesosNaipes.put("♢", 1);
			pesosNaipes.put("♠", 2);
			pesosNaipes.put("♡", 3);
			pesosNaipes.put("♣", 4);
			Integer pesoDessaCarta = pesosNaipes.get(this.naipe);
			Integer pesoOutraCarta = pesosNaipes.get(o.naipe);
			return pesoDessaCarta.compareTo(pesoOutraCarta);
			
		} else {
			return comp;
		}

	}

	public String getNaipe() {
		return naipe;
	}

	public String getNumero() {
		return numero;
	}

}

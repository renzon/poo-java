package calecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Baralho implements Iterable<Carta>, Iterator<Carta>{
	private List<Carta> cartas= new ArrayList<Carta>();
	private int cartaAtualIndex=0;
	
	public Baralho() {
		new Carta("A","♣");
		
		cartas.add(new Carta("3", "♡"));
		cartas.add(new Carta("2", "♠"));
		cartas.add(new Carta("2", "♣"));
		cartas.add(new Carta("2", "♢"));
		cartas.add(new Carta("2", "♡"));
		cartas.add(new Carta("4", "♡"));
	}
	
	@Override
	public Iterator<Carta> iterator() {
		cartaAtualIndex=0;
		return this.cartas.iterator();
	}
	
	public static void main(String[] args) {
		Baralho baralho=new Baralho();
		System.out.println(baralho);
		baralho.ordenar();
		System.out.println(baralho);
		
		for(Carta c: baralho){
			System.out.println(c);
		}
	}

	private void ordenar() {
		ComparadorDoTruco comp=new ComparadorDoTruco();
		Collections.sort(cartas,comp);
		
	}

	@Override
	public String toString() {
		return "Baralho [cartas=" + cartas + "]";
	}

	@Override
	public boolean hasNext() {
		return cartaAtualIndex<cartas.size();
	}

	@Override
	public Carta next() {
		Carta cartaAtual = cartas.get(cartaAtualIndex);
		cartaAtualIndex++;
		return cartaAtual;
	}

	
	
	

}

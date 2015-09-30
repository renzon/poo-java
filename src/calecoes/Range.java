package calecoes;

import java.util.Iterator;

public class Range implements Iterable<Integer>, Iterator<Integer> {
	private int inicio, fim, passo, valorAtual;

	public Range(int inicio, int fim, int passo) {
		super();
		this.inicio = inicio;
		this.fim = fim;
		this.passo = passo;
		valorAtual = inicio;
	}

	public Range(int inicio, int fim) {
		this(inicio, fim, 1);
	}

	public Range(int fim) {
		this(0, fim, 1);
	}

	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public boolean hasNext() {

		return valorAtual < fim;
	}

	@Override
	public Integer next() {
		int aux = valorAtual;
		valorAtual += passo;
		return aux;
	}

	public static void main(String[] args) {
		Range range = new Range(1, 10, 2);
		System.out.println(range);
		for (int valor : range) {
			System.out.println(valor);
		}
	}

}

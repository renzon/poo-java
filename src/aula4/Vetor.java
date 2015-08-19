package aula4;

public class Vetor {
	public static void main(String[] args) {
		int[] inteiros = new int[6];
		for (int i : inteiros) {
			System.out.println(i);
		}

		String[] nomes = {"Renzo","Denis"};
		for (String n : nomes) {
			System.out.println(n);
		}
		System.out.println(nomes.length);
	}

}

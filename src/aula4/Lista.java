package aula4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("Renzo");
		nomes.add("Renzo");
		nomes.add(0,"Barbara");
		
		String[] aux = {"Leonarndo", "Diana"};
		List<String> nomes2 = Arrays.asList(aux);
		
		System.out.println(nomes.size());
		System.out.println(nomes.size());
		System.out.println(nomes);
		nomes.remove("Renzo");
		nomes.addAll(nomes2);
		System.out.println(nomes);
		System.out.println(nomes2);
		for(String n: nomes){
			System.out.println(n);
		}
		
	}

}

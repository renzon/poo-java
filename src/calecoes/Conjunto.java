package calecoes;

import java.util.HashSet;
import java.util.Set;

import aula5.Pessoa;
import aula6.Homem;

public class Conjunto {

	public static void main(String[] args) {
		Homem renzo = new Homem("Renzo");
		Homem renzoIdentico=renzo;
		Homem renzoIgual=new Homem("Renzo");
		Pessoa diana=new Pessoa("Diana");
		System.out.println(renzo==renzoIdentico);
		System.out.println(renzo==renzoIgual);
		System.out.println(renzo.equals(renzoIdentico));
		System.out.println(renzo.equals(renzoIgual));
		
		Set<Pessoa> pessoas=new HashSet<Pessoa>();
		pessoas.add(renzo);
		pessoas.add(renzoIdentico);
		pessoas.add(renzoIgual);
		pessoas.add(diana);
		
		System.out.println(pessoas);

	}

}

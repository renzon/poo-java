package aula5;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Renzo");
 
		Pessoa denis = new Pessoa("Denis");
		 
//		this.OLHOS=3;
		System.out.println(pessoa.nome);
		System.out.println(denis.nome);
		System.out.println(denis.cumprimentar());
		System.out.println(pessoa.cumprimentar());

	}

}

package aula6;

import aula5.Pessoa;

public class Main {
	public static void main(String[] args) {
		Pessoa mulher = new Mulher("Diana");
		System.out.println(mulher.cumprimentar());
		Mulher clone = (Mulher) mulher;
		System.out.println(mulher instanceof Mulher);
		System.out.println(mulher instanceof Pessoa);
		System.out.println(mulher instanceof Object);
		Pessoa homem = new Homem("Leonardo");
		System.out.println(homem.cumprimentar());
		System.out.println(homem);
	}

}

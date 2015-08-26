package aula6;

import aula5.Pessoa;

public class Mulher extends Pessoa{

	public Mulher(String nome) {
		super(nome);
	}
	
	@Override
	public String cumprimentar() {
		// TODO Auto-generated method stub
		return "3 Beijos";
	}

}

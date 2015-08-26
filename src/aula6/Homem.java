package aula6;

import aula5.Pessoa;

public class Homem extends Pessoa {

	public Homem(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {

		return "Homem(" + this.nome + ")";
	}

	@Override
	public String cumprimentar() {
		String msg = super.cumprimentar();
		return msg+". Aperto de mãos";
	}

}

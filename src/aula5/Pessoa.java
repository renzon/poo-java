package aula5;

public class Pessoa {
	static final int OLHOS=2;
	public String nome;

	public String cumprimentar() {
		return "Olá, meu nome é " + this.nome+
				". Tenho ohos = "+this.OLHOS;
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

}

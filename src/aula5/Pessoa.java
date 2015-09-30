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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}

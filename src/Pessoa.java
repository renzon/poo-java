
public class Pessoa {
	private int idade;

	public Pessoa(int idade) {
		super();
		this.idade = idade;
	}
	
	public static void main(String[] args) {
		Pessoa pessoa=new Pessoa(18);
		System.out.println(pessoa.cumprimentar());
	}

	private String cumprimentar() {
		
		return "minha idade é "+this.idade;
	}

}

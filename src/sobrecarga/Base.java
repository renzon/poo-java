package sobrecarga;

public class Base {
	private int quantidade = 0;

	public void setQuantidade(int quantidade) {
		if (quantidade >= 0) {
			this.quantidade = quantidade;
		}
	}

	public Base() {
		this(3);
		// TODO Auto-generated constructor stub
	}
	
	public int soma(int a, int b){
		return a+b;
	}
	public double soma(double a, double b){
		return a+b;
	}
	public int soma(int a, int b, int c){
		return soma(a,b)+c;
	}
	
	public double soma(double a, double b, double ... args){
		double soma = 0;
		for(double d:args){
			soma+=d;
		}
		return soma;
	}

	public Base(int quantidade) {
		super();
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

}

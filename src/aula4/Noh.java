package aula4;

public class Noh {
	public Object valor = null;
	public Noh proximo = null;

	public Noh(Object valor) {
		super();
		this.valor = valor;
	}

	public static void main(String[] args) {
		Noh cabeca = new Noh("a");
		cabeca.add("b");
		cabeca.add("c");
		System.out.println(cabeca);
	}

	private void add(Object conteudo) {
		// TODO Auto-generated method stub
		if (this.proximo == null) {
			proximo = new Noh(conteudo);

		} else {
			proximo.add(conteudo);
		}
	}
	@Override
	public String toString() {
		String str="";
		str+=this.valor;
		if (proximo!=null)
		{
			str+=proximo.toString();
		}
		// TODO Auto-generated method stub
		return str ;
	}

}

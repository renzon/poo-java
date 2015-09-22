package modificadores.a;

public class Base {
	public String publico;
	protected String protegido;
	private int privado =1;
	String padrao="padrao";

	public Base(String publico) {
		super();
		this.publico = publico;
		this.protegido="Protegido";
		this.privado=3;
		this.padrao="P";
		
		
	}

}

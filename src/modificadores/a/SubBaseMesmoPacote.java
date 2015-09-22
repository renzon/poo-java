package modificadores.a;

public class SubBaseMesmoPacote extends Base {
	public void a(){
		Base b= new Base("Blah");
		System.out.println(b.publico);
		b.protegido="Protegido";
		b.privado=3;
		b.padrao="P";
	}

}

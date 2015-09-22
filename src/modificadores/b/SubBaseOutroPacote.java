package modificadores.b;

import modificadores.a.Base;

public class SubBaseOutroPacote extends Base {
	public void a(){
		Base b= new Base("Blah");
		System.out.println(b.publico);;
		this.protegido="Protegido";
		b.privado=3;
		b.padrao="P";
	}
}

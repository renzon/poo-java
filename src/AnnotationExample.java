
public class AnnotationExample {
	@AExample
	public String example;
	private String privada;
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		AnnotationExample e= new AnnotationExample();
		e.example="A";
		e.privada="segredo";
		ValidadorTabajara.validar(e);
		
	}

}



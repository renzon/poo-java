package sobrecarga;

public class Main {

	public static void main(String[] args) {
		Base b = new Base();
		b.setQuantidade(-3);
		System.out.println(b.soma(1, 2));
		System.out.println(b.soma(1.0, 2));
		System.out.println(b.soma(1.0, 2, 3));
		System.out.println(b.soma(1.0, 2, 3, 4));
		System.out.println(b.soma(1, 2, 3));
		double[] numeros={1,2,3,4,5};
		System.out.println(b.soma(1.0, 1, numeros));
	}
}

package aula07;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new CalculadoraPrefixa();
		
		class Divisao implements Operacao{

			@Override
			public double calcular(double arg1, double arg2) {
				// TODO Auto-generated method stub
				return arg1/arg2;
			}
			
		}
		
		Operacao divisao= new Divisao();
		calculadora.adicionarOperacao("/", divisao);
		System.out.println(calculadora.calcularResultado());
		

	}

}

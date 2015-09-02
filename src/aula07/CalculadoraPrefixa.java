package aula07;

import java.util.Scanner;

public class CalculadoraPrefixa extends Calculadora {

	@Override
	public void obter_entradas() {
		Scanner scanner= new Scanner(System.in);
		System.out.print("Digite o Sinal: ");
		this.sinal=scanner.next();
		System.out.print("Digite um número: ");
		this.arg1=scanner.nextDouble();
		System.out.print("Digite outro número: ");
		this.arg2=scanner.nextDouble();
		scanner.close();

	}

}

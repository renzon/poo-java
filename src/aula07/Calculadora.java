package aula07;

import java.util.HashMap;
import java.util.Map;

public abstract class Calculadora {
	private Map<String, Operacao> operacoes = new HashMap<String, Operacao>();
	protected String sinal;
	protected double arg2;
	protected double arg1;

	public Calculadora() {
		Operacao soma= new Soma();
		this.adicionarOperacao("+", soma);
		Operacao subtracao=new Subtracao();
		this.adicionarOperacao("-", subtracao);
	}

	public abstract void obter_entradas();

	public double calcularResultado() {
		// Problemas de obtenção de entradas
		this.obter_entradas();

		// Problema do calcular resultado

		Operacao operacaoSelecionada = this.operacoes.get(this.sinal);
		return operacaoSelecionada.calcular(this.arg1, this.arg2);

	}

	public void adicionarOperacao(String sinal, Operacao operacao) {
		this.operacoes.put(sinal, operacao);

	}
}

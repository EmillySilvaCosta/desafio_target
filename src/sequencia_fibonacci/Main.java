package sequencia_fibonacci;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor
		 * sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
		 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
		 * um número, ele calcule a sequência de Fibonacci e retorne uma mensagem
		 * avisando se o número informado pertence ou não a sequência. IMPORTANTE: Esse
		 * número pode ser informado através de qualquer entrada de sua preferência ou
		 * pode ser previamente definido no código;
		 */
	

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um valor:");
		int numero = entrada.nextInt();

		List<Integer> sequencia = new LinkedList<Integer>();
		sequencia.add(0);
		sequencia.add(1);
		int size = sequencia.size();

		while (numero > sequencia.get(size - 1)) {
			int ultimo = sequencia.get(size - 1);
			int penultimo = sequencia.get(size - 2);
			int proximo = ultimo + penultimo;
			sequencia.add(proximo);
			size++;
		}
		size--;
		while (numero < sequencia.get(size)) {
			size--;
			if(size==-1) {
				size=0;
				break;
			}
		}
		if (sequencia.get(size) == numero) {

			System.out.println("Esse número pertence a sequência Fibonacci!");
		}
		else{

			System.out.println("Esse número NÃO pertence a sequência Fibonacci.");
		}
		

	}

}

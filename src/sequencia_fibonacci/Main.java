package sequencia_fibonacci;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Dado a sequ�ncia de Fibonacci, onde se inicia por 0 e 1 e o pr�ximo valor
		 * sempre ser� a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
		 * 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
		 * um n�mero, ele calcule a sequ�ncia de Fibonacci e retorne uma mensagem
		 * avisando se o n�mero informado pertence ou n�o a sequ�ncia. IMPORTANTE: Esse
		 * n�mero pode ser informado atrav�s de qualquer entrada de sua prefer�ncia ou
		 * pode ser previamente definido no c�digo;
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

			System.out.println("Esse n�mero pertence a sequ�ncia Fibonacci!");
		}
		else{

			System.out.println("Esse n�mero N�O pertence a sequ�ncia Fibonacci.");
		}
		

	}

}

package inverta_caracteres;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String s = entrada.next();
		System.out.println("Entrada: "+ s);
		System.out.println("Saída: " + inverterCaracteres(s));

	}
	public static String inverterCaracteres(String s) {
		//escreva um programa que inverta os caracteres de um string/ obs: nao usar versoes prontas
		//não importa se o usuário vai digitar ou não
		//a string auxiliar começa vazia
		 String Aux = " ";
         int i, n = s.length();
	       
	        /*length() É um método da classe String que retorna o tamanho da String ;
	        length dos Arrays é um atributo da classe que controla o tamanho do array*/
	        //tamanho da string -1(pega a ultima posição)
         for ( i = (n-1); i>=0; i--) {
                //método retorna o caractere no índice especificado em uma string.
	        	Aux = Aux + s.charAt(i);
	            
	        }
         return (Aux);
	}
}

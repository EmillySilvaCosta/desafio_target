package inverta_caracteres;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String s = entrada.next();
		System.out.println("Entrada: "+ s);
		System.out.println("Sa�da: " + inverterCaracteres(s));

	}
	public static String inverterCaracteres(String s) {
		//escreva um programa que inverta os caracteres de um string/ obs: nao usar versoes prontas
		//n�o importa se o usu�rio vai digitar ou n�o
		//a string auxiliar come�a vazia
		 String Aux = " ";
         int i, n = s.length();
	       
	        /*length() � um m�todo da classe String que retorna o tamanho da String ;
	        length dos Arrays � um atributo da classe que controla o tamanho do array*/
	        //tamanho da string -1(pega a ultima posi��o)
         for ( i = (n-1); i>=0; i--) {
                //m�todo retorna o caractere no �ndice especificado em uma string.
	        	Aux = Aux + s.charAt(i);
	            
	        }
         return (Aux);
	}
}

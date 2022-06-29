package faturamento_diario;

import java.io.IOException;
import java.text.DecimalFormat;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		/*3) Dado um vetor que guarda o valor de faturamento di�rio de uma distribuidora, fa�a um programa, 
	 	    * na linguagem que desejar, que calcule e retorne:
	 		   � O menor valor de faturamento ocorrido em um dia do m�s;
	 		   � O maior valor de faturamento ocorrido em um dia do m�s;
	 		   � N�mero de dias no m�s em que o valor de faturamento di�rio foi superior � m�dia mensal.

	 		   IMPORTANTE:
	 		   a) Usar o json ou xml dispon�vel como fonte dos dados do faturamento mensal;
	 		   b) Podem existir dias sem faturamento, como nos finais de semana e feriados. 
	 		   Estes dias devem ser ignorados no c�lculo da m�dia;*/
		    File file1 = new File("faturamento_diario_json/dados.json");
		    //verifica se o ficheiro existe
		    if(file1.exists() && !file1.isDirectory()){
		        System.out.println(file1 + " Exists");
		    }else{
		        System.out.println(file1 + " Not exists");
		    }
		 
			  try {
				  Gson gson = new Gson();
				  //lendo arquivo, dados de texto em java
			      FileReader reader = new FileReader("faturamento_diario_json/dados.json");
			      //pegar o conteudo do arquivo e converter para objeto
			      Faturamento[] faturamentos = gson.fromJson(reader, Faturamento[].class);  
			      double menorValor = 0, maiorValor = 0, media = faturamentos.length,x = 0; 
			      int valorDiaMaior = 0, valorDiaMenor = 0, quantidadeDias = 21, aux = 0;
			      menorValor = faturamentos[0].valor;
			      maiorValor = faturamentos[0].valor;
			      DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
			      for(int i = 0; i < faturamentos.length;i++) {
			    	  if( menorValor > faturamentos[i].valor && faturamentos[i].valor !=0) {
			              menorValor = faturamentos[i].valor;
			              valorDiaMenor = faturamentos[i].dia;
			    	  }
			      }
			      System.out.println("Dia com menor valor de faturamento: "+ valorDiaMenor +" Valor: R$" + decimalFormat.format(menorValor));

			
			      for(int i = 0; i< faturamentos.length;i++) {
			    	  if(maiorValor < faturamentos[i].valor) {
			    		  maiorValor = faturamentos[i].valor;
			    		  valorDiaMaior = faturamentos[i].dia;
			    	  }
			      }
			      System.out.println("Dia com maior valor de faturamento: "+ valorDiaMaior +" Valor: R$" + decimalFormat.format(maiorValor));
			      
			    //calc�lo da m�dia
			     for(int i=0; i< faturamentos.length; i++) {
			    	 x = x + faturamentos[i].valor;
			    	  media = x / quantidadeDias; 
			    	  if(faturamentos[i].valor > media) {
			    		  aux ++;
			    	  }
			    	  
			      }
			    
			     System.out.println("Quantidade de dias em que o faturamento foi superior a m�dia mensal: " + aux + " Valor da media R$"+ decimalFormat.format(media));
			  }catch (IOException e) {
				  e.printStackTrace();
			          }
			   

	}

}

package faturamento_diario;

import java.io.IOException;
import java.text.DecimalFormat;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;
import com.google.gson.Gson;

public class Main {

	public static void main(String[] args) {
		/*3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, 
	 	    * na linguagem que desejar, que calcule e retorne:
	 		   • O menor valor de faturamento ocorrido em um dia do mês;
	 		   • O maior valor de faturamento ocorrido em um dia do mês;
	 		   • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.

	 		   IMPORTANTE:
	 		   a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
	 		   b) Podem existir dias sem faturamento, como nos finais de semana e feriados. 
	 		   Estes dias devem ser ignorados no cálculo da média;*/
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
			      
			    //calcúlo da média
			     for(int i=0; i< faturamentos.length; i++) {
			    	 x = x + faturamentos[i].valor;
			    	  media = x / quantidadeDias; 
			    	  if(faturamentos[i].valor > media) {
			    		  aux ++;
			    	  }
			    	  
			      }
			    
			     System.out.println("Quantidade de dias em que o faturamento foi superior a média mensal: " + aux + " Valor da media R$"+ decimalFormat.format(media));
			  }catch (IOException e) {
				  e.printStackTrace();
			          }
			   

	}

}

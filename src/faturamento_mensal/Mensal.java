package faturamento_mensal;

import java.text.DecimalFormat;

public class Mensal {

	public static void main(String[] args) {
 	   Double sp = 67836.43;
 	   Double rj = 36678.66;
 	   Double mg = 29229.88;
 	   Double es = 27165.48;
 	   Double outros = 19849.53;
 	   Double totalFatu = sp + rj + mg + es + outros;
 	   Double a = (sp/totalFatu)*100, b = (rj/totalFatu)*100, c = (mg/totalFatu)*100, d = (es/totalFatu)*100, e= (outros/totalFatu)*100;
 	  System.out.println("Lucro total mensal R$"+ totalFatu);
 	  DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
 	  System.out.println("O percentual do Estado de São Paulo no lucro total mensal foi de " + decimalFormat.format(a)+"%");
 	  System.out.println("O percentual do Estado do Rio de Janeiro no lucro total mensal foi de "  + decimalFormat.format(b)+"%");
 	  System.out.println("O percentual do Estado de Minas Gerais no lucro total mensal foi de " + decimalFormat.format(c)+"%");
 	  System.out.println("O percentual do Estado do Espírito Santo no lucro total mensal foi de " + decimalFormat.format(d)+"%");
 	  System.out.println("O percentual dos outros Estados no lucro total mensal foi de " + decimalFormat.format(e)+"%");

	}

}

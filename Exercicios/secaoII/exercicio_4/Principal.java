package secaoII.exercicio_4;

import javax.swing.JOptionPane;

/**
 * @author felizolinha
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String strPrecoDoDolar = JOptionPane.showInputDialog("Qual o preço do dólar?"),
			   strQuantidadeDeDolares = JOptionPane.showInputDialog("Quantos dólares serão comprados?");
		double precoDoDolar = Double.parseDouble(strPrecoDoDolar),
			   quantidadeDeDolares = Double.parseDouble(strQuantidadeDeDolares);

		ConversorMoeda conversor = new ConversorMoeda(precoDoDolar, 1.06); //O valor 1.06 corresponde aos 6% de IOF
		JOptionPane.showMessageDialog(null, 
				"Total a ser pago em reais = "
			    + String.format("%.2f", conversor.totalEmReais(quantidadeDeDolares))
		);
	}

}

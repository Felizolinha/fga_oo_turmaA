package secaoII.exercicio_4;

/**
 * @author felizolinha
 *
 */
public class ConversorMoeda {
	double precoDoDolar;
	double IOF;
	
	double totalEmReais(double dolares) {
		return dolares * precoDoDolar * IOF;
	}
	
	ConversorMoeda(double precoDoDolar, double IOF) {
		this.precoDoDolar = precoDoDolar;
		this.IOF = IOF;
	}
}

package secaoII.exercicio_3;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author felizolinha
 *
 */
public class ProgressaoAritmetica {
	/**
	 * Primeiro termo da PA.
	 */
	double termoInicial;
	/**
	 * Constante a ser somada a cada novo termo da PA.
	 */
	double razao;
	
	//Guardamos o número de termos ao invés de passar como parâmetro
	//para ajudar a imprimir a progressão apenas no fim do programa.
	/**
	 * Quantidade de termos da PA.
	 */
	int numeroDeTermos;
	
	/**
	 * Retorna um ArrayList contendo os termos da PA.
	 */
	ArrayList<Double> listaDeTermos() {
		ArrayList<Double> termos = new ArrayList<Double>();
		for(int i=0; i<numeroDeTermos; i++) {
			termos.add(termoInicial + razao*i); 
		}
		return termos;
	}
	
	/**
	 * Retorna a soma dos termos da PA.
	 * A quantidade de termos a ser somada é definida pelo atributo numeroDeTermos.
	 */
	double somaDosTermos() {
		double ultimoTermo = termoInicial + razao * (numeroDeTermos-1);
		
		return numeroDeTermos * (termoInicial + ultimoTermo)/2;
	}
	
	/**
	 * Retorna uma representação em String dos termos da PA e da somda dos termos da PA.
	 */
	public String toString() {
		return "Progressão Aritmética de razão " + Principal.formatarDouble(razao)+ " e termo inicial " + Principal.formatarDouble(termoInicial) + "\n" +
				"Termos:\n" +
				String.join(", ", listaDeTermos().parallelStream().map(d -> Principal.formatarDouble(d)).collect(Collectors.toList())) + "\n" +
				"Soma dos Termos:\n" +
				somaDosTermos();
	}
	
	ProgressaoAritmetica(double termoInicial, double razao, int numeroDeTermos) {
		this.termoInicial = termoInicial;
		this.razao = razao;
		this.numeroDeTermos = numeroDeTermos;
	}
}

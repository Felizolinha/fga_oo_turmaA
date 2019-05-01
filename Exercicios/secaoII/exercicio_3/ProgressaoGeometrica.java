package secaoII.exercicio_3;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author felizolinha
 *
 */
public class ProgressaoGeometrica {
	/**
	 * Primeiro termo da PG.
	 */
	double termoInicial;
	/**
	 * Constante a ser multiplicada a cada novo termo da PG.
	 */
	double razao;
	
	//Guardamos o número de termos ao invés de passar como parâmetro
	//para ajudar a imprimir a progressão apenas no fim do programa.
	/**
	 * Quantidade de termos da PG.
	 */
	int numeroDeTermos;

	/**
	 * Retorna um ArrayList contendo os termos da PG.
	 */
	ArrayList<Double> listaDeTermos() {
		ArrayList<Double> termos = new ArrayList<Double>();
		for(int i=0; i<numeroDeTermos; i++) {
			termos.add(termoInicial * Math.pow(razao, i)); 
		}
		return termos;
	}
	
	/**
	 * Retorna a soma dos termos da PG.
	 * A quantidade de termos a ser somada é definida pelo atributo numeroDeTermos.
	 */
	double somaDosTermos() {
		return termoInicial * (Math.pow(razao, numeroDeTermos) - 1)/(razao - 1);
	}
	
	/**
	 * Retorna uma representação em String dos termos da PG e da somda dos termos da PG.
	 */
	public String toString() {
		return "Progressão Geométrica de razão " + Principal.formatarDouble(razao)+ " e termo inicial " + Principal.formatarDouble(termoInicial) + "\n" +
				"Termos:\n" +
				String.join(", ", listaDeTermos().parallelStream().map(d -> Principal.formatarDouble(d)).collect(Collectors.toList())) + "\n" +
				"Soma dos Termos:\n" +
				somaDosTermos();
	}
	
	ProgressaoGeometrica(double termoInicial, double razao, int numeroDeTermos) {
		this.termoInicial = termoInicial;
		this.razao = razao;
		this.numeroDeTermos = numeroDeTermos;
	}
}

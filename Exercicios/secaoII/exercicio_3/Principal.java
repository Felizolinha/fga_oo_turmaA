package secaoII.exercicio_3;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * @author felizolinha
 *
 */
public class Principal {
	public static void main(String[] args) {
		ArrayList<ProgressaoAritmetica> progressoesAritmeticas = new ArrayList<ProgressaoAritmetica>();
		ArrayList<ProgressaoGeometrica> progressoesGeometricas = new ArrayList<ProgressaoGeometrica>();
		
		//Enquanto o usuario desejar...
		int opcao = 0;
		do {
			//Ler a opção desejada
			String opSelecionadaStr = 
					JOptionPane.showInputDialog("Selecione uma opção:\n"
							+ "1 - Progressão Aritmética\n" 
							+ "2 - Progressão Geométrica\n"
							+ "0 - Sair");
			opcao = Integer.parseInt(opSelecionadaStr);
			//Quebrar o loop caso o usuário deseje parar
			if(opcao == 0) {
				break;
			}

			String strTermoInicial = JOptionPane.showInputDialog("Termo inicial:"),
				   strRazao = JOptionPane.showInputDialog("Razão:"),
				   strNumeroDeTermos = JOptionPane.showInputDialog("Número de termos:");
			
			//Converter os inputs para inteiros
			double termoInicial = Double.parseDouble(strTermoInicial),
				   razao = Double.parseDouble(strRazao);
			int numeroDeTermos = Integer.parseInt(strNumeroDeTermos);
				
			//Instanciar e guardar as progressões
			if(opcao == 1) {
				progressoesAritmeticas.add(new ProgressaoAritmetica(termoInicial, razao, numeroDeTermos));
				JOptionPane.showMessageDialog(null, "Progressão Aritmética cadastrada.");
			} else if(opcao == 2) {
				progressoesGeometricas.add(new ProgressaoGeometrica(termoInicial, razao, numeroDeTermos));
				JOptionPane.showMessageDialog(null, "Progressão Geométrica cadastrada.");
			}
		} while(opcao != 0);
		
		//Imprimir as progressões
		if(progressoesAritmeticas.size() > 0) {
			JOptionPane.showMessageDialog(null, "Progressões Aritméticas cadastradas:");
			for(ProgressaoAritmetica pa: progressoesAritmeticas) {
				JOptionPane.showMessageDialog(null, pa.toString());
			}
		}
		
		if(progressoesGeometricas.size() > 0) {
			JOptionPane.showMessageDialog(null, "Progressões Geométricas cadastradas:");
			for(ProgressaoGeometrica pg: progressoesGeometricas) {
				JOptionPane.showMessageDialog(null, pg.toString());
			}
		}
	}
	
	/**
	 * Formata o double removendo os zeros desnecessários.
	 * @param d um número double a ser representado como String
	 * @return  uma representação em String do número fornecido sem zeros desnecessários
	 */
	public static String formatarDouble(Double d)
	{
		if(d == (long)d.longValue()) { 
			return String.format("%d", d.longValue());
		} else {
			return String.format("%s", d);
		}
	}

}

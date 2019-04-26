import javax.swing.JOptionPane;

public class Principal {
	
	public static void main (String[] args) {
		//Referencias para varias figuras geometrica
		Retangulo[] rets = new Retangulo[10];
		TrianguloEquilatero[] tEqs = new TrianguloEquilatero[10];

		//enquanto o usuario desejar...
		int opcao = 0;
		do {
			//ler a opcao desejada
			String opSelecionadaStr = 
					JOptionPane.showInputDialog("Selecione uma opcao:\n"
							+ "1 - Retangulo\n" 
							+ "2 - Triangulo Equilatero\n"
							+ "0 - Sair");
			opcao = Integer.parseInt(opSelecionadaStr);
			
			//criar obj de figura Geometrica
			switch (opcao) {
			case 1:
				String strBase, strAltura;
				strBase = JOptionPane.showInputDialog("Base do retangulo:");
				strAltura = JOptionPane.showInputDialog("Altura do retangulo:");
				
				float baseRetangulo = Float.parseFloat(strBase);
				float alturaRetangulo = Float.parseFloat(strAltura);
				
				//instanciacao do retangulo
				Retangulo r = new Retangulo(baseRetangulo, alturaRetangulo);
				r.calcularArea();
				r.calcularPerimetro();
		
				//salvar esse obj no vetor de referencias
				for (int i=0; i<rets.length; i++) {
					if (rets[i] == null) {
						rets[i] = r;
						JOptionPane.showMessageDialog(null, "Cadastrado");
						break;
					}
				}
//				JOptionPane.showMessageDialog(null, r.imprimir());
				
				break;

			default:
				break;
			}
		} while(opcao != 0);
		
		//Imprimir os objetos
		//Primeiro os retangulos
		JOptionPane.showMessageDialog(null, "Retangulos cadastrados");
		for (int i=0; i<rets.length; i++) {
			if (rets[i] != null) {
				JOptionPane.showMessageDialog(null, rets[i].imprimir());
			}
		}
		
		
		
		
	}
}

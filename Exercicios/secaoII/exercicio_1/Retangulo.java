package secaoII.exercicio_1;


public class Retangulo {
	float base, 
	 	  altura, 
	 	  area, 
	 	  perimetro;
	
	Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float calcularArea() {
		this.area = this.base * this.altura;
		return this.area;
	}
	
	public float calcularPerimetro() {
		this.perimetro = 2 * (this.base + this.altura);
		return this.perimetro;
	}

	public String imprimir() {
		String resposta;
		resposta = "O retangulo de base igual a " + this.base;
		resposta += " e altura igual a " + this.altura;
		resposta += " tem area igual a " + this.area;
		resposta += " e perimetro igual a " + this.perimetro + ".";
		
		return resposta;
	}
}








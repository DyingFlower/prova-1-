package robo;

public class Andador extends Robo {

	public Andador(int id, String nome, Plano plano) {
		super(id, nome, plano);
		tipo="Andador";
	}

	
	public void Avançar() {
		plano.listaCelulas[posicaox][posicaoy].criaturas.remove(0);
		posicaoy++;
		plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
	}

	public void Retroceder() {
		plano.listaCelulas[posicaox][posicaoy].criaturas.remove(0);
		posicaoy--;
		plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
	}

}

package robo;

public class Peao extends Robo{

	public Peao(int id, String nome, Plano plano) {
		super(id, nome, plano);
		tipo="Peao";
	}
	public void Avançar() {
		plano.listaCelulas[posicaox][posicaoy].criaturas.remove(0);
		posicaox++;
		plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
	}

	public void Retroceder() {
		plano.listaCelulas[posicaox][posicaoy].criaturas.remove(0);
		posicaox--;
		plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
	}


}

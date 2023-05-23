package robo;

public class Andador extends Robo {

	public Andador(int id, String nome, Plano plano) {
		super(id, nome, plano);
		tipo="Andador";
	}

	
	public void Avançar() {
		for(int i=0;i<plano.listaCelulas[posicaox][posicaoy].criaturas.size();i++) {
			if(plano.listaCelulas[posicaox][posicaoy].criaturas.get(i)==this) {
				passadas.add(plano.listaCelulas);
				plano.listaCelulas[posicaox][posicaoy].criaturas.remove(i);
			}
		}
		posicaoy++;
		plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
	}

	public void Retroceder() {
		for(int i=0;i<plano.listaCelulas[posicaox][posicaoy].criaturas.size();i++) {
			if(plano.listaCelulas[posicaox][posicaoy].criaturas.get(i)==this) {
				passadas.add(plano.listaCelulas);
				plano.listaCelulas[posicaox][posicaoy].criaturas.remove(i);
			}
		}
		posicaoy--;
		plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
	}

}

package robo;

public class Horse extends Robo{

	public Horse(int id, String nome, Plano plano) {
		super(id, nome, plano);
		tipo="Cavalo";
	}
	public void Avançar(int z) {
		for(int i=0;i<plano.listaCelulas[posicaox][posicaoy].criaturas.size();i++) {
			if(plano.listaCelulas[posicaox][posicaoy].criaturas.get(i)==this) {
				passadas.add(plano.listaCelulas);
				plano.listaCelulas[posicaox][posicaoy].criaturas.remove(i);
			}
		}
		try {
			if(z<=2 && z>0) {
				posicaox+=z;
				posicaoy+=z;
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
			}
			else {
				throw new excecao();
			}
		}catch(excecao e) {
			System.out.println("O cavalo só avança de 1 a 2, redigite o comando");
		}
	}
	
	public void Retroceder(int z) {
		for(int i=0;i<plano.listaCelulas[posicaox][posicaoy].criaturas.size();i++) {
			if(plano.listaCelulas[posicaox][posicaoy].criaturas.get(i)==this) {
				passadas.add(plano.listaCelulas);
				plano.listaCelulas[posicaox][posicaoy].criaturas.remove(i);
			}
		}
		try {
			if(z<=2 && z>0) {
				posicaox-=z;
				posicaoy-=z;	
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
			}
			else {
				throw new excecao();
			}
		}catch(excecao e) {
			System.out.println("o cavalo só retrocede de 1 a 2, redigite o comando");
		}
	}

}

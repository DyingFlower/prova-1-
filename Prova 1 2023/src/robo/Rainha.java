package robo;

public class Rainha extends Robo{

	public Rainha(int id, String nome, Plano plano) {
		super(id, nome, plano);
		tipo="Rainha";
	}
	public void Avançar(int z) {
		for(int i=0;i<plano.listaCelulas[posicaox][posicaoy].criaturas.size();i++) {
			if(plano.listaCelulas[posicaox][posicaoy].criaturas.get(i)==this) {
				plano.listaCelulas[posicaox][posicaoy].criaturas.remove(i);
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(plano.passadas);
			}
		}
		try {
			if(z<=4 && z>0) {
				posicaox+=z;
				posicaoy+=z;
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
				plano.mostrartab();
				System.out.println(pontos);
			}
			else {
				throw new excecao();
			}
		}catch(excecao e) {
			System.out.println("A Rainha só avança de 1 a 4, redigite o comando");
		}
	}
	
	public void Retroceder(int z) {
		for(int i=0;i<plano.listaCelulas[posicaox][posicaoy].criaturas.size();i++) {
			if(plano.listaCelulas[posicaox][posicaoy].criaturas.get(i)==this) {
				plano.listaCelulas[posicaox][posicaoy].criaturas.remove(i);
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(plano.passadas);
			}
		}
		try {
			if(z<=4 && z>0) {
				posicaox-=z;
				posicaoy-=z;	
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
				plano.mostrartab();
				System.out.println(pontos);
			}
			else {
				throw new excecao();
			}
		}catch(excecao e) {
			System.out.println("A Rainha só retrocede de 1 a 4, redigite o comando");
		}
	}

}

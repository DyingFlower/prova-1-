package robo;

public class Torre extends Robo{

	public Torre(int id, String nome, Plano plano) {
		super(id, nome, plano);
		tipo="Torre";
	}
	public void Avançar(int i) {
		plano.listaCelulas[posicaox][posicaoy].criaturas.remove(0);
		try {
			if(i<=2 && i>0) {
				posicaoy+=i;
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
			}
			else {
				throw new excecao();
			}
		}catch(excecao e) {
			System.out.println("A torre só avança de 1 a 2, redigite o comando");
		}
	}

	public void Retroceder(int i) {
		plano.listaCelulas[posicaox][posicaoy].criaturas.remove(0);
		try {
			if(i<=2 && i>0) {
				posicaoy-=i;	
				plano.listaCelulas[posicaox][posicaoy].criaturas.add(this);
			}
			else {
				throw new excecao();
			}
		}catch(excecao e) {
			System.out.println("A torre só retrocede de 1 a 2, redigite o comando");
		}
	}

}
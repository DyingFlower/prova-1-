package robo;

import java.util.Random;

public class Aluno extends Criatura{

	public Aluno( String nome, Plano plano) {
		super( nome, plano);
		Random random = new Random();
		posicaox=random.nextInt(plano.tamanhox);
		posicaoy=random.nextInt(plano.tamanhoy);
		tipo="Aluno";
		Celula aux = null;
		for (int i = 0; i < plano.listaCelulas.length; i++) {
			for (int j = 0; j < plano.listaCelulas[i].length; j++) {
				aux=plano.listaCelulas[i][j];
				if (aux.posicaoX == posicaox && aux.posicaoY == posicaoy) {
					aux.criaturas.add(this);
	    		}
	        }
	    }
	}
	
}
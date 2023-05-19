package robo;

public class Criatura {
	public int pontos;
	public int id;
	public String nome;
	public int posicaox;
	public int posicaoy;
	public Plano plano;
	protected String tipo;
		public Criatura(String nome, Plano plano) {
			this.nome = nome;
			this.posicaox =1;
			this.posicaoy =1;
			this.plano = plano;

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

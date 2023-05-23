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
			this.plano = plano;
		}
	
}

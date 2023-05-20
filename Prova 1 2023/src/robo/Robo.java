package robo;

public abstract class Robo extends Criatura{
	public Robo( int id,String nome, Plano plano) {
		super(nome, plano);
		this.id=id;
	}

	public void Avançar() {

	}

	public void Retroceder() {
		
	}
}
package robo;

import java.util.ArrayList;

public class Passadas extends Robo{
	

	public Passadas(int id, String nome, Plano plano) {
		super(id, nome, plano);
		tipo="Celula passada";
	}

	public ArrayList<Celula[][]>passadas;

	public void add(Celula[][] listaCelulas) {
		passadas.add(listaCelulas);
	}
}

package robo;

import java.util.ArrayList;

public class Celula {

	public int posicaoX;
	public int posicaoY;
	public int id;
	public String possuido;
	public ArrayList<Criatura> criaturas;	
	
	public Celula(int id, int x , int y) {
		posicaoX = x;
		posicaoY = y;
		this.id = id;
		criaturas =new ArrayList<Criatura>();
	}
	
	public String imprimir() {
		return "Celula:  " + id + " x: " + posicaoX + " y: " + posicaoY;
	}
}

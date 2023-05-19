package robo;

import java.util.ArrayList;

public class Plano {
	public int tamanhox;
	public int tamanhoy;
	public Celula[][] listaCelulas;
	public Plano(int tamanhox, int tamanhoy) {
		this.tamanhox=tamanhox;
		this.tamanhoy=tamanhoy;
		listaCelulas = new Celula[tamanhox][tamanhoy];
			int contador = 1;
			for (int i = 0; i < tamanhox; i++) {
				for (int j = 0; j < tamanhoy; j++) {
					Celula celula = new Celula(contador, i, j);
					listaCelulas[i][j]=celula;
					contador++;
				}
			}
	}

	public void verificarSeTemRobo() {
		for (int i = 0; i < listaCelulas.length; i++) {
			for (int j = 0; j <listaCelulas[i].length; j++) {
				Celula aux=listaCelulas[i][j];
				for(int k=0;k<listaCelulas[i][j].criaturas.size();k++) {
					if (listaCelulas[i][j].criaturas.get(k) != null) {
						System.out.println("tem robo: " + aux.criaturas.get(k).tipo + "- x: " + aux.posicaoX + "  - y: " + aux.posicaoY);
					}	
				}
				
	        }
	    }
	}
	


	public Celula retornarCelula(int x, int y) {
		for (int i = 0; i < listaCelulas.length; i++) {
			for (int j = 0; j <listaCelulas[i].length; j++) {
				if (listaCelulas[i][j].posicaoX == x && listaCelulas[i][j].posicaoY == y) {
					return listaCelulas[i][j];
				}
	        }
	    }
		return null;
	}

	public void retornarCelulas() {
		for (int i = 0; i < listaCelulas.length; i++) {
			for (int j = 0; j <listaCelulas[i].length; j++) {
				System.out.println(listaCelulas[i][j].imprimir());
	        }
	    }
	}
	public void verificarposicoes() {
		boolean temRobo=false;
		boolean temAluno=false;
		int x;
		int y;
		for (int i = 0; i < listaCelulas.length; i++) {
			for (int j = 0; j <listaCelulas[i].length; j++) {
				 for (Criatura criatura : listaCelulas[i][j].criaturas) {
			            if (criatura instanceof Robo) {
			                temRobo = true;
			            }
			            else if (criatura instanceof Aluno) {
			                temAluno = true;
			            }  
			     }
				 if (temRobo && temAluno) {
					 for(int k=1;k<listaCelulas[i][j].criaturas.size();k++) {
						 listaCelulas[i][j].criaturas.get(k).pontos+=10;
					 }
		         }
				
	        }
	    }
	}

}

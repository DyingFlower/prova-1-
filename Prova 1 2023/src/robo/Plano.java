package robo;

import java.util.ArrayList;
import java.util.Scanner;

public class Plano implements MostrarTab{
	public Andador r;
	public Peao P;
	public Torre T;
	public Bispo B;
	public Horse C;
	public Rei R;
	public Rainha Q;
	public Passadas passadas;
	public int alunos;
	public int bugs;
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
			 r = new Andador(1, "andador", this);
			 P = new Peao(2, "Peao", this);
			 T = new Torre(3, "Torre", this);
			 B = new Bispo(4,"Bispo",this);
			 C = new Horse(5,"Cavalo",this);
			 R = new Rei(6,"Rei",this);
			 Q = new Rainha(7,"Rainha",this);
			 passadas = new Passadas(0,"Passadas",this);
			AdicionarAlunosnoPlano();
			AdicionarBugsnoPlano();
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
		boolean temBug=false;
		for (int i = 0; i < listaCelulas.length; i++) {
			for (int j = 0; j <listaCelulas[i].length; j++) {
				 for (Criatura criatura : listaCelulas[i][j].criaturas) {
			            if (criatura instanceof Robo) {
			                temRobo = true;
			            }
			            else if (criatura instanceof Aluno) {
			                temAluno = true;
			            }
			            else if(criatura instanceof Bug) {
			            	temBug = true;
			            }
			     }
				 if (temRobo && temAluno) {
					 for(int k=1;k<listaCelulas[i][j].criaturas.size();k++) {
						 listaCelulas[i][j].criaturas.get(k).pontos+=10;
						 System.out.println("Robo achou aluno");
					 }
		         }
				 else if(temRobo && temBug) {
					 for(int k=1;k<listaCelulas[i][j].criaturas.size();k++) {
						 listaCelulas[i][j].criaturas.get(k).pontos-=15;
						 System.out.print("Robo achou Bug");
					 } 
				 }
				
	        }
	    }
	}
	public void AdicionarAlunosnoPlano() {
		Scanner leitor = new Scanner(System.in);
		int regra =(tamanhox*tamanhoy)/2;
		System.out.println("Informe o Numero de alunos e Bugs no Plano: ");
		alunos=leitor.nextInt();
		if(alunos>regra) {
			System.out.println("Numero muito grande de alunos, informe novamente");
			alunos=leitor.nextInt();
		}
		else {
			for(int i=0;i<alunos;i++) {
				Aluno aluno = new Aluno("Aluno",this);
			}
		}
		leitor.close();
		
	}
	public void AdicionarBugsnoPlano() {
		bugs=alunos;
		for(int i=0;i<bugs;i++) {
		Bug bug = new Bug("bug",this);
		}	
	}

	public void mostrartab() {
		for (int i = 0; i < tamanhoy; i++) {
			for (int j = 0; j <tamanhox; j++) {
				if(listaCelulas[j][i].criaturas.size()>0) {
					for(int k =0;k<listaCelulas[j][i].criaturas.size();k++) {
						if(i==0 && j==0) {
							System.out.print("[I]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Andador) {
							System.out.print("[A]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Peao) {
							System.out.print("[P]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Torre) {
							System.out.print("[T]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Bispo) {
							System.out.print("[B]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Horse) {
							System.out.print("[C]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Rei) {
							System.out.print("[R]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Rainha) {
							System.out.print("[Q]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Passadas) {
							System.out.print("[*]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Aluno) {
							System.out.print("[ ]");
							k=listaCelulas[j][i].criaturas.size();
						}
						else if(listaCelulas[j][i].criaturas.get(k) instanceof Bug) {
							System.out.print("[ ]");
							k=listaCelulas[j][i].criaturas.size();
						}
					}
				}
				else {
					System.out.print("[ ]");
				}
			}
			System.out.println();
		}
	}

}

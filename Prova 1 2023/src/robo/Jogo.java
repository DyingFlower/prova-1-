package robo;

import java.util.Scanner;

public class Jogo {
	String jogador;
	public Jogo(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quem esta jogando? ");
		jogador=leitor.next();
		System.out.println("Bem vindo "+jogador);
		Plano p = new Plano(8, 8);
		Andador r = new Andador(1, "andador", p);
		Peao Pe = new Peao(2, "Peao", p);
		Torre T = new Torre(3, "Torre", p);
		Bispo B = new Bispo(4,"Bispo",p);
		Horse C = new Horse(5,"Cavalo",p);
		r.Avançar();
		p.verificarSeTemRobo();
		System.out.println("f");
		T.Avançar(2);
		C.Avançar(2);
		r.Retroceder();
		Pe.Avançar();
		B.Avançar(1);
		p.verificarSeTemRobo();
		System.out.println(r.pontos);
		leitor.close();
	}
}

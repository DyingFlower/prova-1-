package robo;

import java.util.Scanner;

public class Jogo {
	String jogador;
	int dimensaox;
	int dimensaoy;
	public Jogo(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quem esta jogando? ");
		jogador=leitor.next();
		System.out.println("Bem vindo "+jogador);
		System.out.println("Diga as dimensões do Plano: x");
		dimensaox=leitor.nextInt();
		System.out.println("Diga as dimensões do Plano: y");
		dimensaoy=leitor.nextInt();
		Plano pl = new Plano(dimensaox,dimensaoy);
		pl.r.Avançar();
		pl.verificarSeTemRobo();
		System.out.println("f");
		pl.T.Avançar(2);
		pl.C.Avançar(2);
		pl.r.Retroceder();
		pl.P.Avançar();
		pl.P.Avançar();
		pl.B.Avançar(1);
		pl.R.Avançar(4);
		pl.Q.Avançar(3);
		pl.verificarSeTemRobo();
		leitor.close();
	}
}

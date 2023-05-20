package robo;

public class Main {

	public static void main(String[] args) {
		
		Plano p = new Plano(8, 8);
		Andador r = new Andador(1, "andador", p);
		Peao Pe = new Peao(2, "Peao", p);
		Torre T = new Torre(3, "Torre", p);
		r.Avançar();
		p.verificarSeTemRobo();
		System.out.println("f");
		T.Avançar(2);
		r.Retroceder();
		Pe.Avançar();
		p.verificarSeTemRobo();
		System.out.println(r.pontos);

		
	
	}
	

}

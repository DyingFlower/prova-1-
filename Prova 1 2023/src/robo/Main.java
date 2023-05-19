package robo;

public class Main {

	public static void main(String[] args) {
		
		Plano p = new Plano(8, 8);
		Criatura a = new Aluno("Arthur",p);
		Robo r = new Andador(1, "andador", p);
		r.Avançar();
		p.verificarSeTemRobo();
		System.out.println("f");
		r.Retroceder();
		p.verificarSeTemRobo();

		
	
	}
	

}

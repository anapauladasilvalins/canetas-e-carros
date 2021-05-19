package aula02.aulas;

public class Aula {
	public static void main(String[] args) {
		
		System.out.println("=======================================");
		
		ModeloAula aulaMatematica = new ModeloAula();
		aulaMatematica.diaSemana = "Segunda";
		aulaMatematica.aula = true;
		
		aulaMatematica.status();
		aulaMatematica.dia();
		aulaMatematica.temAula();
		aulaMatematica.naoTemAula();
		
		System.out.println("---------------------------------------");
		
		ModeloAula aulaNatacao = new ModeloAula();
		aulaNatacao.diaSemana = "Sábado";
		aulaNatacao.aula = false;
		
		aulaNatacao.status();
		aulaNatacao.dia();
		aulaNatacao.temAula();
		aulaNatacao.naoTemAula();
		
		System.out.println("=======================================");
		
	}

}

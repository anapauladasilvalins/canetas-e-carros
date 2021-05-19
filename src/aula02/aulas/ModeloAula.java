package aula02.aulas;

public class ModeloAula {
	
	String diaSemana;
	boolean aula;
	
	void status() {
		System.out.println("DIA: "+ this.diaSemana);
	}
	
	void dia() {
		if(diaSemana == "Segunda" || diaSemana == "Quarta" || diaSemana == "Sexta") {
			System.out.println("Tem aula de matemática, vai estudar!");
		}
		else {
			System.out.println("");
		}
		if(diaSemana == "Terça" || diaSemana == "Quinta") {
			System.out.println("Aula de português. Continue estudando!");
		}
		else if(diaSemana == "Sábado" || diaSemana == "Domingo") {
			System.out.println("FINAL DE SEMANA, DESCANSE EM PAZ (:");
		}
		
	}
	
	void temAula() {
		this.aula = true;
		
	}
	
	void naoTemAula() {
		this.aula = true;
		
	}
	
   
}

package aula02.aulas;

public class ModeloAula {
	
	String diaSemana;
	boolean aula;
	
	void status() {
		System.out.println("DIA: "+ this.diaSemana);
	}
	
	void dia() {
		if(diaSemana == "Segunda" || diaSemana == "Quarta" || diaSemana == "Sexta") {
			System.out.println("Tem aula de matem�tica, vai estudar!");
		}
		else {
			System.out.println("");
		}
		if(diaSemana == "Ter�a" || diaSemana == "Quinta") {
			System.out.println("Aula de portugu�s. Continue estudando!");
		}
		else if(diaSemana == "S�bado" || diaSemana == "Domingo") {
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

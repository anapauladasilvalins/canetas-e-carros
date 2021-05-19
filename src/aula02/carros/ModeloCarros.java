package aula02.carros;

public class ModeloCarros {
	
	String modelo;
	String combustivel;
	boolean automatico;
	boolean arCondicionado;
	int portas;
	int ano;
	double motor;
	
	void status() {
		System.out.println("MODELO: " + this.modelo);
		System.out.println("ANO:" + this.ano);
		System.out.println("PORTAS: " + this.portas);
		System.out.println("Motor: " + this.motor);
		System.out.println("COMBUST�VEL: " + combustivel);
	}
	
	void serAutomatico() {
		
		if(this.automatico == true) {
			System.out.println("� autom�tico.");
		}
		else {
			System.out.println("N�o � autom�tico.");
		}
	}
	
	void temArCondicionado() {
		if(this.arCondicionado == true) {
			System.out.println("Tem ar condicionado.");
		}
		else {
			System.out.println("N�o tem ar condicionado.");
		}
	
	}

}

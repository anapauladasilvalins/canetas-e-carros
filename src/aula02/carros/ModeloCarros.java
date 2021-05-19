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
		System.out.println("COMBUSTÍVEL: " + combustivel);
	}
	
	void serAutomatico() {
		
		if(this.automatico == true) {
			System.out.println("É automático.");
		}
		else {
			System.out.println("Não é automático.");
		}
	}
	
	void temArCondicionado() {
		if(this.arCondicionado == true) {
			System.out.println("Tem ar condicionado.");
		}
		else {
			System.out.println("Não tem ar condicionado.");
		}
	
	}

}

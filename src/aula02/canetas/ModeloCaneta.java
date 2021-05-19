package aula02.canetas;

public class ModeloCaneta {
	
	String modelo;
	String cor;
	float ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Caneta " + this.cor); //this. quer dizer auto ref�rencia. � o nome do objeto que chamou
		System.out.println("Ponta: " + this.ponta);
		System.out.println("carga: " + this.carga); 
		System.out.println("Est� tampada? " + this.tampada);
		
	}
	
	void rabiscar() {
		
		if (this.tampada == true) {
			System.out.println("ERRO! N�o posso rabiscar!");
		} else {
			System.out.println("Posso rabiscar!");
		}
	}
	 
	void tampar() {
		this.tampada = true; // this vai chamar o c1.This � uma referencia ao objeto que chamou.
		
	}
	
	void destampar() {
		this.tampada = false;
		
	}
	
}

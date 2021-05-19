package aula02.carros;

public class Carro {
	public static void main(String[] args) {
		
		ModeloCarros car1 = new ModeloCarros();
		car1.modelo = "Hilux";
		car1.ano = 2021;
		car1.portas = 4;
		car1.motor = 2.8;
		car1.combustivel = "Diesel";
		car1.automatico = true;
		car1.arCondicionado = true;
		
		car1.status();
		car1.serAutomatico();
		car1.temArCondicionado();
		
		System.out.println("============================================");
		
		ModeloCarros car2 = new ModeloCarros();
		car2.modelo = "Gol G4";
		car2.ano = 2005;
		car2.portas = 2;
		car2.motor = 1.6;
		car2.combustivel = "álcool";
		car2.automatico = false;
		car2.arCondicionado = false;
		
		car2.status();
		car2.serAutomatico();
		car2.temArCondicionado();
		
		
	}

}

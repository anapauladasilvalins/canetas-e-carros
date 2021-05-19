package aula02.canetas;

public class Caneta {
	public static void main (String[] args) {
		
		ModeloCaneta c1 = new ModeloCaneta();
		c1.modelo = "Bic";
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.carga = 100;
		
		c1.destampar(); // c1 chamou o método tampar
		//c1.tampada = false;
		c1.status(); 
		c1.rabiscar();
		
		System.out.println("=================================================");
		ModeloCaneta c2 = new ModeloCaneta();
		c2.modelo = "Compactor";
		c2.cor = "vermelha";
		c2.ponta = 0.7f;
		c2.carga = 50;
		
		c2.tampar();
		c2.status();
		c2.rabiscar();
	}

}

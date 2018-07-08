package principal;

import fabrica.Fabrica;

public class Principal {

	public static void main(String[] args) {
		//inicia o programa
		Fabrica honda = new Fabrica("Honda","Civic");
		System.out.println(honda.getMarca()+" "+honda.getModelo());
		Fabrica toyota = new Fabrica("Toyota","Corolla");
		System.out.println(toyota.getMarca()+" "+toyota.getModelo());
		System.out.println("Ligar o toyota");
		toyota.start();
		System.out.println("Ligar o Honda");
		honda.start();
		System.out.println("Andar com o Honda");
		honda.drive();
		System.out.println("Parar o honda");
		honda.stop();
		System.out.println("Parar o toyota");
		toyota.stop();
	}

}

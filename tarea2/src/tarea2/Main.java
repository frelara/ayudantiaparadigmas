package tarea2;

public class Main {

	public static void main(String[] args) {
		PrimerNodo nodo1 = new PrimerNodo();
		nodo1.setPrimerValor(7);
		nodo1.setSegundoValor(9);
		NodoSuperior nodosu = new NodoSuperior();
		System.out.println("primer valor superior" + nodosu.getValorMaximo());
		

	}

}

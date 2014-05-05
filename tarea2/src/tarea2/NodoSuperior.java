package tarea2;

public class NodoSuperior extends PrimerNodo {
	
	private int primerValor;// = getValorMinimo();
	private int segundoValor; //minimo de otro de los primeros nodos
	protected int maximo;
	protected int minimo;
	
	public NodoSuperior(){
		
		primerValor = super.getValorMinimo();
		segundoValor = 5; //este atributo deberia contener el valor
						  //minimo de otro de los primeros nodos 
						  //en esta ocacion tomara el valor de 5
		maximo = valorMaximo(primerValor, segundoValor);
		minimo = valorMinimo(primerValor, segundoValor);
		
	}

}

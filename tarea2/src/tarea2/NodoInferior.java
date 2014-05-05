package tarea2;

public class NodoInferior extends PrimerNodo {
	
	private int primerValor;
	private int segundoValor; 
	
	
	public NodoInferior(){
		
		primerValor = super.getValorMaximo();
		segundoValor = 10; //este atributo deberia contener el valor
						  //maximo de otro de los primeros nodos 
						  //en esta ocacion tomara el valor de 10
		maximo = valorMaximo(primerValor, segundoValor);
		minimo = valorMinimo(primerValor, segundoValor);
		
	}

}

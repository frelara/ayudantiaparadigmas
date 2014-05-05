package tarea2;

public class NodoSuperior extends PrimerNodo {
	
	
	public NodoSuperior(){
		
		primerValor = super.minimo;
		segundoValor = 5; //este atributo deberia contener el valor
						  //minimo de otro de los primeros nodos 
						  //en esta ocacion tomara el valor de 5
		maximo = valorMaximo(primerValor, segundoValor);
		minimo = valorMinimo(primerValor, segundoValor);
		
	}

}

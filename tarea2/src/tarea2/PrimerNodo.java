package tarea2;

public class PrimerNodo {
	
	private int primerValor;
	private int segundoValor;
	
	protected int getValorMaximo(){
		
		if(primerValor > segundoValor){
			return primerValor;
		}
		else{
			return segundoValor;
		}
		
	}
	
	protected int getValorMinimo(){
		
		if(primerValor < segundoValor){
			return primerValor;
		}
		else{
			return segundoValor;
		}
		
	}
	

}

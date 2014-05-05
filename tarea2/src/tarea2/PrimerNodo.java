package tarea2;

public class PrimerNodo {
	
	private int primerValor;
	private int segundoValor;
	
	
	public int valorMaximo(int primerValor, int segundoValor){
		
		if(primerValor > segundoValor){
			return primerValor;
		}
		else{
			return segundoValor;
		}
		
	}
	
	public int valorMinimo(int primerValor, int segundoValor){
		
		if(primerValor < segundoValor){
			return primerValor;
		}
		else{
			return segundoValor;
		}
		
	}
	
	public int getValorMaximo(){
		
		if(primerValor > segundoValor){
			return primerValor;
		}
		else{
			return segundoValor;
		}
		
	}
	
	public int getValorMinimo(){
		
		if(primerValor < segundoValor){
			return primerValor;
		}
		else{
			return segundoValor;
		}
		
	}
	
	public void setPrimerValor(int primerValor){
		
		this.primerValor = primerValor;
		
	}
	
	public void setSegundoValor(int segundoValor){
		
		this.segundoValor = segundoValor;
		
	}
	
	
	

}

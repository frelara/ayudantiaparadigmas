package tarea2;

public class PrimerNodo {
	
	private int primerValor;
	private int segundoValor;
	protected int maximo;
	protected int minimo;
	
	public PrimerNodo(){
		primerValor = 0;
		segundoValor = 0;
		maximo = valorMaximo(primerValor, segundoValor);
		minimo = valorMinimo(primerValor, segundoValor);
	}
	
	
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
		
		return maximo;
		
	}
	
	public int getValorMinimo(){
		
		return minimo;
		
	}
	
	public void setPrimerValor(int primerValor){
		
		this.primerValor = primerValor;
		
	}
	
	public void setSegundoValor(int segundoValor){
		
		this.segundoValor = segundoValor;
		
	}
	
	
	

}

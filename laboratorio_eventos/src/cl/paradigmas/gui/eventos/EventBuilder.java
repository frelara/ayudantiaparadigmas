package cl.paradigmas.gui.eventos;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import cl.paradigmas.gui.Ventana;
import cl.paradigmas.modelo.Circulo;
import cl.paradigmas.modelo.Linea;



final public class EventBuilder {
	static Point pressed = new Point();
	//static Point dragged = new Point();

	private EventBuilder(){}
	/**
	 * Aqui se deben crear los metodos static 
	 * que devolveran los ActionListener y
	 * MouseAdapter->(MouseListener y MouseMotionListener)
	 * que marcan los eventos
	 */
	public static ActionListener circuloPresionado(final Ventana ventana){
		ActionListener al = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(ventana.getToolbar().getBtn("CIRCULO").isSelected() == true ){
					ventana.setSeleccionado(Ventana.CIRCULO);	
				}					
			}
		};
		return al;		
	}
	
	public static ActionListener lineaPresionada(final Ventana ventana){
		ActionListener al = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(ventana.getToolbar().getBtn("LINEA").isSelected() == true ){
					ventana.setSeleccionado(Ventana.LINEA);	
				}					
			}
		};
		return al;		
	}
	
	public static ActionListener eventoLimpiar(final Ventana ventana){
		ActionListener al = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				ventana.getCanvas().limpiar();				
			}
		};
		return al;		
	}
	
	
	
	public static MouseAdapter eventoCirculo( final Ventana ventana){
		
		MouseAdapter miMouseAdapter= new MouseAdapter(){
			
			@Override
			public void mouseClicked(MouseEvent e){
				if(ventana.getSeleccionado() == Ventana.CIRCULO){
					Circulo miCirculo = new Circulo(e.getPoint(),65);
					ventana.getCanvas().addDibujable(miCirculo);
					ventana.getCanvas().repaint();
				}
			}
			
		};
		
		return miMouseAdapter;
	}
	
	public static MouseAdapter eventoLinea( final Ventana ventana){
		
		MouseAdapter miMouseAdapter = new MouseAdapter(){
					
			@Override 
			public void mousePressed(MouseEvent e){
				pressed = e.getPoint();
			}
			
			@Override
			public void mouseReleased(MouseEvent e){
				
				if(ventana.getSeleccionado() == Ventana.LINEA){
					Linea miLinea = new Linea(pressed, e.getPoint());
					ventana.getCanvas().addDibujable(miLinea);
					ventana.getCanvas().repaint();
							
				}
			
			}
			
			};
		
		return miMouseAdapter;
	}

}

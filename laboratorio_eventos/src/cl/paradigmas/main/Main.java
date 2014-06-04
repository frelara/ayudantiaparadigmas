package cl.paradigmas.main;

import javax.swing.JToggleButton;

import cl.paradigmas.gui.ParadigmasToolBar;
import cl.paradigmas.gui.Ventana;
import cl.paradigmas.gui.eventos.EventBuilder;

public class Main {
	
	public static void main(String[] args) {
		Ventana ventana = new Ventana();
		/* 
		 * aqui se agregan los botones y 
		 * se agregan los eventos creados en 
		 * EventBuilder
		 * 
		 * */
		JToggleButton circulo = new JToggleButton("CIRCULO");
		JToggleButton linea = new JToggleButton("LINEA");
		
		ventana.getToolbar().addBtn("CIRCULO", circulo);
		ventana.getToolbar().addBtn("LINEA", linea);
		circulo.addActionListener(EventBuilder.circuloPresionado(ventana));
		linea.addActionListener(EventBuilder.lineaPresionada(ventana));
		ventana.getToolbar().addgrupoBtn(circulo);
		ventana.getToolbar().addgrupoBtn(linea);
		ventana.getCanvas().addMouseListener(EventBuilder.eventoCirculo(ventana));
		ventana.getCanvas().addMouseListener(EventBuilder.eventoLinea(ventana));
		ventana.getToolbar().getBtnLimpiar().addActionListener(EventBuilder.eventoLimpiar(ventana));
		
		
		ventana.setVisible(true);
	}

}

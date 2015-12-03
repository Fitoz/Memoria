package test;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Welcome extends JPanel{	
		
	public Welcome(){
		JPanel textPanel = new JPanel(new BorderLayout());
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
        JTextPane pane = new JTextPane();

        pane.setContentType("text/html");
        String text = "<div style=\"text-align: center;\"><p><b>�Hola! Bienvenido al Sistema para Modelar el Ciclo Temprano de BPM</b></p>" +
            "<p>Para empezar a utilizar el sistema debe utilizar el men� lateral. " +
            "Si est� reci�n comenzando, se recomienda comenzar leyendo la informaci�n del sistema, "+
            "para eso haga click en 'Informaci�n' del men� laretal. </p>";
        pane.setText(text);
        pane.setEditable(false);
        textPanel.add(pane);
        add(textPanel);
	}

}

package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cuestionarios1 extends JPanel {

	public JButton config;
	public JButton cuest;
	public Ventana p;
	public Cuestionarios1 Cues;
	public TabbetPanels Cues2;
	
	public Cuestionarios1(Ventana p1, TabbetPanels Cues2){
		p=p1;
		this.Cues2=Cues2;
	}
	public void InitC1(Cuestionarios1 Cues){
		this.Cues=Cues;
		addB();
	}
	public void addB(){
		String s="<html><div style=\"text-align: center;\">Si Ya ha definido el mecanismo de coodinación e ingresado los miembros de la estructura organizacional, presione<br> 'Ver Configuración' \n"+
				"para ver la configuración organizacional sugerida, si está de acuerdo presione 'Ir a Cuestionarios para ver los cuestionarios.</html>";
		JLabel l1 = new JLabel(s);
		l1.setFont(new Font("Serif", Font.PLAIN, 17));
		
		JTextArea textArea = new JTextArea(20, 1);
		textArea.setEditable(true);
		
		config = new JButton("Ver Configuración");
		cuest = new JButton("Ir a Cuestionarios");
		
		JPanel g1 = new JPanel(new GridLayout(3,1));
		JPanel g2 = new JPanel(new GridLayout(4,5));
		JPanel g3 = new JPanel(new GridLayout(5,5));
		
		JLabel [] aux = new JLabel[45];
		for(int i=0;i<45;i++){
			aux[i]=new JLabel("");
		}
		g1.add(l1);
		for(int i=0;i<45;i++){
			if(i<20){				
				switch(i){
				case  13:
					g2.add(config);
				case 14:
					g2.add(textArea);
				default:  
					g2.add(aux[i]);
				}				
			}
			else {
				switch(i){
					case 22:
						g3.add(cuest);
					default:  
						g3.add(aux[i]);
					}
			}			
		}
		AllActionListener l2=new AllActionListener(Cues2,cuest, Cues,p);
        cuest.addActionListener(l2);
         
		g1.add(g2);
		g1.add(g3);
		g1.setPreferredSize(new Dimension (1000,600));
		add(g1);
	}
	
}

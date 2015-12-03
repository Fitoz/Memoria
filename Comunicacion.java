package test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Comunicacion extends JPanel {
	
	static String sup = "Supervision Directa";
	static String ept = "Estandarizaci�n de los Procesos de Trabajo";
	static String edp = "Estandarizaci�n de los Productos";
	static String edh = "Estandarizaci�n de las Habilidades";
	static String adm = "Adaptac�n Mutua";
	public JButton save;
	private JSplitPane jsp;

	public Comunicacion(){
		JRadioButton sp = new JRadioButton(sup);
		sp.setSelected(true);
		JRadioButton et = new JRadioButton(ept);		
		JRadioButton ep = new JRadioButton(edp);
		JRadioButton eh = new JRadioButton(edh);
		JRadioButton am = new JRadioButton(adm);
		
		ButtonGroup group = new ButtonGroup();
		group.add(sp);
		group.add(et);
		group.add(ep);
		group.add(eh);
		group.add(am);
		
		JPanel rp = new JPanel(new GridLayout(0,1));
		rp.add(sp);
		rp.add(et);
		rp.add(ep);
		rp.add(eh);
		rp.add(am);
		rp.setPreferredSize(new Dimension(1000, 400));			
		JPanel aux = new JPanel(new GridLayout(1,5));
		JLabel a1=new JLabel("");
		JLabel a2=new JLabel("");
		JLabel a3=new JLabel("");
		JLabel a4=new JLabel("");
		save = new JButton("Guardar");
		aux.add(a1);
		aux.add(a2);
		aux.add(save);
		aux.add(a3);
		aux.add(a4);
		
		JSplitPane jsp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		jsp2.setTopComponent(rp);
		rp.setBorder(null);
		rp.setMinimumSize(new Dimension(1000, 300));
		jsp2.add(aux, SwingConstants.CENTER);
		aux.setBorder(null);
		aux.setMaximumSize(new Dimension(50,50));
		
		
		JLabel l1 = new JLabel("Defina el mecanismo de coordinaci�n dominante entre los agentes de la organizaci�n", SwingConstants.CENTER);
		l1.setFont(new Font("Serif", Font.PLAIN, 17));
		jsp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		jsp.setTopComponent(l1);
		jsp.setDividerLocation(100);
		l1.setMinimumSize(new Dimension(100,600));
		jsp.setBottomComponent(jsp2);
		jsp2.setMinimumSize(new Dimension(1000, 600));
		add(jsp);
		
		
		
	}
}

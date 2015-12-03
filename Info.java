package test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Info extends JPanel{
	
	private Ventana p;
	private Info I;
	
	public Info(Ventana p1){
		p=p1;
	}
	public void InitInfo(Info I){
		this.I=I;
		addInfo();
	}
	public void addInfo(){
		JTextPane l1 = new JTextPane();
		l1.setContentType("text/html");
		String s="<div style=\"text-align: center;\">"
				+ "<b>Información</b><br>Acá va toda la información que parece ser relevante.";
		l1.setText(s);
		l1.setFont(new Font("Serif", Font.PLAIN, 17));		
		l1.setEditable(false);

		
		JPanel p=new JPanel(new BorderLayout(5,5));
		p.add(l1);		
		JScrollPane sp = new JScrollPane(p);
		sp.setPreferredSize(new Dimension(1100, 600));
		add(sp);
	}

}

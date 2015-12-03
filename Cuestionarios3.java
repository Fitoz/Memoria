package test;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Cuestionarios3 extends JPanel{
	public JScrollPane SP;
	Box PP;
	JPanel PS;
	public Cuestionarios3(){
		PP=new Box(BoxLayout.Y_AXIS);
		PS=new JPanel();
		
		/* Question 1 */
		JLabel Q1=new JLabel("1.- Describa una jornada normal de trabajo, actividades principales.");
		JTextArea textArea = new JTextArea("hola");
			textArea.setFont(new Font("Serif", Font.PLAIN, 16));
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
		JScrollPane areaScrollPane = new JScrollPane(textArea);
		areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		areaScrollPane.setPreferredSize(new Dimension(400, 120));
		PP.add(Q1);
		PP.add(areaScrollPane);	
		/* Question 2 */
		JLabel Q2=new JLabel("2.- Podrías relatar una jornada anormal de trabajo? agrega situaciones anormales que te han sucedido.");
		JTextArea textArea2 = new JTextArea("");
			textArea.setFont(new Font("Serif", Font.PLAIN, 16));
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
		JScrollPane areaScrollPane2 = new JScrollPane(textArea2);
		areaScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		areaScrollPane2.setPreferredSize(new Dimension(400, 120));
		PP.add(Q2);
		PP.add(areaScrollPane2);
		/* Question 3 */
		JLabel Q3=new JLabel("3.- ¿Cómo enfrentas situaciones anormales?");
		JTextArea textArea3 = new JTextArea("");
			textArea.setFont(new Font("Serif", Font.PLAIN, 16));
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
		JScrollPane areaScrollPane3 = new JScrollPane(textArea3);
		areaScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		areaScrollPane3.setPreferredSize(new Dimension(400, 120));
		PP.add(Q3);
		PP.add(areaScrollPane3);
		/* Question 4 */
		JLabel Q4=new JLabel("4.- ¿Qué necesitaría alguien para poder realizar un trabajo como el tuyo?");
		JTextArea textArea4 = new JTextArea("");
			textArea.setFont(new Font("Serif", Font.PLAIN, 16));
			textArea.setLineWrap(true);
			textArea.setWrapStyleWord(true);
		JScrollPane areaScrollPane4 = new JScrollPane(textArea4);
		areaScrollPane4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		areaScrollPane4.setPreferredSize(new Dimension(400, 120));
		PP.add(Q4);
		PP.add(areaScrollPane4);
		
		SP = new JScrollPane();
		SP.setPreferredSize(new Dimension(900, 400));		
	    SP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	    SP.setViewportView(PP);
		PS.add(SP);
		add(PS,BorderLayout.CENTER);
		
		
		
	}

}

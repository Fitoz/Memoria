package test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AllActionListener implements ActionListener {

	 /* This class implements all the bottons */
	public JButton EO, CO, CU, RE, IN, cuest;	        
	public JPanel box;
	public TabbetPanels tp,Cues2;
	public Welcome we;
	public Comunicacion Com;
	public Cuestionarios1 Cues;
	private Ventana prog;
	private Info info;
	
	public AllActionListener(int i, JButton EO, JButton CO, JButton CU,TabbetPanels tp,Comunicacion Com, Cuestionarios1 Cues,Ventana p,Welcome we,TabbetPanels Cues2,Info info,JButton IN){
		this.EO=EO;
		this.CO=CO;
		this.CU=CU;		
		this.tp=tp;
		this.we=we;
		this.Com=Com;
		this.Cues=Cues;
		prog=p;
		this.Cues2=Cues2;
		this.info=info;
		this.IN=IN;
	}
	public AllActionListener(TabbetPanels Cues2, JButton cuest,Cuestionarios1 Cues,Ventana p){
		this.Cues=Cues;
		this.Cues2=Cues2;
		this.cuest=cuest;
		prog=p;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	    /*if (e.getSource()==prog.exit) {
	    	System.exit(0);        
	    }*/
	    if (e.getSource()==EO){	    	
	    	prog.getContentPane().remove(we);
	    	prog.getContentPane().remove(Com);
	    	prog.getContentPane().remove(Cues);
	    	prog.getContentPane().remove(Cues2);
	    	prog.getContentPane().remove(info);
	    	prog.getContentPane().add(tp, BorderLayout.EAST);
	    	prog.revalidate();
	    	prog.repaint();
	    }
	    if(e.getSource()==CO){  
	    	prog.getContentPane().remove(we);
	    	prog.getContentPane().remove(tp);
	    	prog.getContentPane().remove(Cues);
	    	prog.getContentPane().remove(Cues2);
	    	prog.getContentPane().remove(info);
	    	prog.getContentPane().add(Com, BorderLayout.EAST);
	    	prog.revalidate();
	    	prog.repaint(); 	
	    }
	    if(e.getSource()==CU){
	    	prog.getContentPane().remove(we);
	    	prog.getContentPane().remove(Com);
	    	prog.getContentPane().remove(tp);
	    	prog.getContentPane().remove(Cues2);
	    	prog.getContentPane().remove(info);
	    	prog.getContentPane().add(Cues, BorderLayout.EAST);
	    	prog.revalidate();
	    	prog.repaint();	    	
	    }
	    if(e.getSource()==cuest){
	    	prog.getContentPane().remove(Cues);
	    	prog.getContentPane().add(Cues2, BorderLayout.EAST);
        	prog.revalidate();
        	prog.repaint();
	    }
	    if(e.getSource()==IN){
	    	prog.getContentPane().remove(we);
	    	prog.getContentPane().remove(Com);
	    	prog.getContentPane().remove(tp);
	    	prog.getContentPane().remove(Cues2);
	    	prog.getContentPane().remove(Cues);
	    	prog.getContentPane().add(info, BorderLayout.EAST);
	    	prog.revalidate();
	    	prog.repaint();	    	
	    }
	}
	
}

package test;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Run  {
	
	public static void createAndShowGui() {
		  // Model model = new MyModel();
		  Ventana view = new Ventana();
		  view.init(view);
		  // Control control = new MyControl(model, view);

		  //JFrame frame = view;
		  view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  //frame.getContentPane().add(view);
		  view.setSize(1350, 720);
		  //frame.pack();		  
		  view.setVisible(true);
		  view.setExtendedState(view.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		}

		public static void main(String[] args) {
		  SwingUtilities.invokeLater(new Runnable() {
		     public void run() {
		        createAndShowGui();
		     }
		  });
		}

}

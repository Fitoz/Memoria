package test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import java.awt.event.KeyEvent;

public class TabbetPanels extends JPanel{
	
	private JTabbedPane tabbedPane;
	private JLabel label;
	private JSplitPane sp;
	
	
	public TabbetPanels(int i) {
		initTP(i);
	}
	private void initTP(int i)
	{
		if (i==1)
		{
			ImageIcon icon = createImageIcon("/images/middle.gif");
			
			tabbedPane=new JTabbedPane();		   
			ListModels LM1 = new ListModels();
			LM1.setPreferredSize(new Dimension(1000, 500));
					   tabbedPane.addTab("Ápice Estratégico", icon, LM1,
			                     "Does nothing");
		   tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		     
		  
		   ListModels LM2 = new ListModels();
		   LM2.setPreferredSize(new Dimension(1000, 500));
		   tabbedPane.addTab("Línea Media", icon, LM2,
		                     "Does twice as much nothing");
		   tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

		   ListModels LM3 = new ListModels(); 
		   LM3.setPreferredSize(new Dimension(1000, 500));
		   tabbedPane.addTab("Núcleo Operativo", icon, LM3,
		                     "Still does nothing");
		   tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

		   ListModels LM4 = new ListModels(); 
		   LM4.setPreferredSize(new Dimension(1000, 500));
		   tabbedPane.addTab("Tecnoestructura", icon, LM4,
		                         "Does nothing at all");
		   tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
		   ListModels LM5 = new ListModels(); 
		   LM5.setPreferredSize(new Dimension(1000, 500));		   
		   tabbedPane.addTab("Soporte", icon, LM5,
		                     "Still does nothing");
		   tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);		   
		      
		   //The following line enables to use scrolling tabs.
		   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		   JLabel l = new JLabel("Indique los miembros que componen cada parte de la organización", SwingConstants.CENTER);
		   l.setFont(new Font("Serif", Font.PLAIN, 17));
		   sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		   sp.setTopComponent(l);
		   l.setMinimumSize(new Dimension(600,100));
		   sp.setBottomComponent(tabbedPane);		   
		   add(sp);
		}
		else
			if (i==2){
				ImageIcon icon = createImageIcon("/images/middle.gif");
				
				tabbedPane=new JTabbedPane();		   
				Cuestionarios3 LM1 = new Cuestionarios3();
				LM1.setPreferredSize(new Dimension(1000, 500));
						   tabbedPane.addTab("Ápice Estratégico", icon, LM1,
				                     "Does nothing");
			   tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
			     
			  
			   Cuestionarios3 LM2 = new Cuestionarios3(); 
			   LM2.setPreferredSize(new Dimension(1000, 500));
			   tabbedPane.addTab("Línea Media", icon, LM2,
			                     "Does twice as much nothing");
			   tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);

			   Cuestionarios3 LM3 = new Cuestionarios3(); 
			   LM3.setPreferredSize(new Dimension(1000, 500));
			   tabbedPane.addTab("Núcleo Operativo", icon, LM3,
			                     "Still does nothing");
			   tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

			   Cuestionarios3 LM4 = new Cuestionarios3(); 
			   LM4.setPreferredSize(new Dimension(1000, 500));
			   tabbedPane.addTab("Tecnoestructura", icon, LM4,
			                         "Does nothing at all");
			   tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
			   Cuestionarios3 LM5 = new Cuestionarios3(); 
			   LM5.setPreferredSize(new Dimension(1000, 500));		   
			   tabbedPane.addTab("Soporte", icon, LM5,
			                     "Still does nothing");
			   tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);		   
			      
			   //The following line enables to use scrolling tabs.
			   tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
			   JLabel l = new JLabel("Indique los miembros que componen cada parte de la organización", SwingConstants.CENTER);
			   l.setFont(new Font("Serif", Font.PLAIN, 17));
			   sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
			   sp.setTopComponent(l);
			   l.setMinimumSize(new Dimension(600,100));
			   sp.setBottomComponent(tabbedPane);		   
			   add(sp);
			}
	}
	/** Returns an ImageIcon, or null if the path was invalid. */
	protected static ImageIcon createImageIcon(String path) {
	    java.net.URL imgURL = Ventana.class.getResource(path);
	    if (imgURL != null) { 
	        return new ImageIcon(imgURL);
	    } else {
	        System.err.println("Couldn't find file: " + path);
	        return null;
	    }
	} 

	
}

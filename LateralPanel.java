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

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.KeyEvent;


public class LateralPanel extends JPanel {
	 public JButton EO, CO, CU, RE, IN;	        
	    private JPanel box;
	    
	public LateralPanel(){
		EO = new JButton("Estructura Organizacional");
        // EO.addActionListener(new OpenImageAction());
        CO = new JButton("Mecanismo de Coordinación");
        // CO.addActionListener(new ProcessAction());
        CU = new JButton("Cuestionarios");
        // CU.addActionListener(new OpenImageAction());
        RE = new JButton("Resultados");
        // RE.addActionListener(new OpenImageAction());
        IN = new JButton("Información");
        // IN.addActionListener(new OpenImageAction());

        box = new JPanel(new GridLayout(5, 1));
        box.add(EO);
        box.add(CO);
        box.add(CU);
        box.add(RE);
        box.add(IN);
        JPanel west = new JPanel(new GridBagLayout());
        west.add(box); 
        add(west, BorderLayout.WEST);        
	}
	

}

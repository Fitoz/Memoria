package test;

//INICIO
//PROGRAMA: Ventana.java
//HACEMOS REFERENCIA A LA BIBLIOTECA QUE CONTIENE LAS CLASES GRÁFICAS
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

import java.awt.event.KeyEvent;

//CREAMOS NUESTRA CLASE "Ventana" Y LA HACEMOS QUE HEREDE LOS ATRIBUTOS
//Y METODOS DE LA CLASE "Frame"
public class Ventana extends JFrame implements ActionListener{
	
	
	
//CREAMOS UN OBJETO DE DATOS "MenuBar" PARA CREAR NUESTRA BARRA 
//QUE CONTENDRA LOS MENUS
MenuBar barra = new MenuBar();//LA DECLARAMOS E INSTANCIAMOS.

//CREAMOS LOS MENUS QUE ESTARAN DENTRO DE LA BARRA DE MENUS QUE 
//ACABAMOS DE CREAR
Menu programa = new Menu("File");
Menu ayuda = new Menu("Ayuda");


//PARA CREAR UN SUBMENU, BASTA CON INTRODUCIR EN UN MENU, OTRO MENU.
//CREAMOS EL MENU QUE SERVIRA SE SUBMENU EN NUESTRO PROGRAMA
Menu guardar = new Menu("Guardar");

// cosas varias

MenuItem exit=new MenuItem("Salir");
private JLabel label;
private DefaultListModel model;
private JList list;
private JButton remallbtn;
private JButton addbtn;
private JButton renbtn;
private JButton delbtn;
public JButton EO, CO, CU, RE, IN;	        
public JPanel box;
public TabbetPanels tp,Cues2;
public Welcome we;
public Comunicacion Com;
public Cuestionarios1 Cues;
public Ventana prog;
private Info info;

//CREAMOS EL CONSTRUCTOR DE NUESTRA CLASE
public Ventana(){
   super("Sistema para Modelar Ciclo Temprano de BPM"); //LE DAMOS UN NOMBRE A NUESTRA VENTANA
   this.setSize(1350, 720); //ESTABLECEMOS EL TAMAÑO DE LA VENTANA
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   //SELECCIONAMOS LA BARRA DE MENUS
   setMenuBar(barra);

   //A LA BARRA LE AGREGAMOS LOS MENUS.
   barra.add(programa);
   barra.add(ayuda);

   //AHORA A LOS MENUS LE AGREGAMOS LAS OPCIONES Y EL SUBMENU
   programa.add("Nuevo");
   programa.add("Abrir");

   //PARA AGREGAR UN SEPARADOR ENTRE VARIAS OPCIONES DEL MENU, 
   //HACEMOS LO SIGUIENTE
   programa.addSeparator();

   //SEGUIMOS AGREGANDO MAS OPCIONES Y EL SUBMENU
   programa.add(guardar);//AQUI ESTAMOS AGREGANDO EL SUBMENU

   //AHORA AL SUBMENU LE AGREGAMOS LAS OPCIONES
   guardar.add("Guardar");
   guardar.add("Guardar Como...");
   guardar.add("Guardar Todo");

   //AGREGAMOS OTRO SEPARADOR DE OPCIONES
   programa.addSeparator();

   //AGREGAMOS UNA ULTIMA OPCION A NUESTRO MENU programa   
   programa.add(exit);
   exit.addActionListener(this);

   //AHORA VAMOS A AGREGARLE OPCIONES AL MENU DE AYUDA
   ayuda.add("Ayuda General");
   ayuda.addSeparator();//AGREGAMOS UN SEPARADOR
   ayuda.add("Acerca de...");
   
   
   //panel  
  
 
}//FIN DEL CONSTRUCTOR DE LA CLASE Ventana

public void init(Ventana n){
	prog=n;
	CreateButtons(); 
}
// escuchadores de los botones
public void actionPerformed(ActionEvent e) {
    if (e.getSource()==exit) {
    	System.exit(0);        
    }    
}

//PARA PODER CERRAR LA VENTANA
public boolean handleEvent(Event evt){
   if (evt.id == Event.WINDOW_DESTROY)
      System.exit(0);
      return super.handleEvent(evt);
}
public Cuestionarios1 C1 (){return Cues;}
public Container jf(){return getContentPane();}

public void CreateButtons(){
		we = new Welcome();
	   getContentPane().add(we, BorderLayout.NORTH);
	   
	   tp = new TabbetPanels(1);
	   Cues2 = new TabbetPanels(2);
	   Com = new Comunicacion();
	   Cues = new Cuestionarios1(prog,Cues2);
	   Cues.InitC1(Cues);
	   info=new Info(prog);
	   info.InitInfo(info);
	   
	   
	   EO = new JButton("Estructura Organizacional");
	   AllActionListener l1=new AllActionListener(1,EO,CO,CU,tp,Com,Cues,prog,we,Cues2,info,IN);
	   EO.addActionListener(l1);
	   CO = new JButton("Mecanismo de Coordinación");
	   AllActionListener l2=new AllActionListener(1,EO,CO,CU,tp,Com,Cues,prog,we,Cues2,info,IN);
	   CO.addActionListener(l2);
	   CU = new JButton("Cuestionarios");
	   AllActionListener l3=new AllActionListener(1,EO,CO,CU,tp,Com,Cues,prog,we,Cues2,info,IN);
	   CU.addActionListener(l3);
	   RE = new JButton("Resultados");
	   RE.addActionListener(this);	   
	   IN = new JButton("Información");
	   AllActionListener l5=new AllActionListener(1,EO,CO,CU,tp,Com,Cues,prog,we,Cues2,info,IN);
	   IN.addActionListener(l5);
	   box = new JPanel(new GridLayout(5, 1));
		box.add(EO);
		box.add(CO);
		box.add(CU);
		box.add(RE);
		box.add(IN);
		JPanel west = new JPanel(new GridBagLayout());
		west.add(box); 
		getContentPane().add(west, BorderLayout.WEST);
}

}//FIN DE LA CLASE Ventana
//FIN
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea05;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HP OME
 */
public final class Ventana3 extends JFrame {
    
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JCheckBox> jCheckboxList;
    private List<JComboBox> jComboBox1;
   
    
    public Ventana3(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        this.setLocation(30, 30);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder(""));
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(8,1));
         
        
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
        this.iniciarBotones();
        this.iniciarCombo();
        
    }
    
    public void iniciarPaneles(){
        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6)); 
        this.jPanel1.add(this.jPanelList.get(7));
    }
    
    public void iniciarEtiquetas(){
        
        this.jLabelList = new ArrayList<>();
        
        
        
        this.jLabelList.add(new JLabel("Periodo Academico: "));
        this.jLabelList.add(new JLabel("Carrera:* "));
        this.jLabelList.add(new JLabel("Modalidad:* "));
        this.jLabelList.add(new JLabel("Sede: "));
        this.jLabelList.add(new JLabel("Compus:* "));
        this.jLabelList.add(new JLabel("Jornada:* "));
        this.jLabelList.add(new JLabel("Fecha de Registro:* "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4)); 
        this.jPanelList.get(5).add(this.jLabelList.get(5)); 
        this.jPanelList.get(6).add(this.jLabelList.get(6)); 
       
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField());
        this.jTextFieldList.add(new JTextField());
        
        this.jTextFieldList.get(0).setText("2022-2022");
        this.jTextFieldList.get(1).setText("29/04/22");
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(6).add(this.jTextFieldList.get(1));
        
       
    
    }
    
    public void iniciarBotones(){
        this.jButtonList = new ArrayList<>();
        
        
        
       this.jButtonList.add(new JButton("Siguiente"));
     
        
        this.jPanelList.get(7).add(this.jButtonList.get(0));
           
    }
   
    
    public void iniciarCombo(){
          this.jComboBox1=new ArrayList<>();
         this.jComboBox1.add(new JComboBox());
         this.jComboBox1.add(new JComboBox());
         this.jComboBox1.add(new JComboBox());
         this.jComboBox1.add(new JComboBox());
         this.jComboBox1.add(new JComboBox());
         
         
         this.jComboBox1.get(0).addItem("Electronica y Automatizacion");
         this.jComboBox1.get(0).addItem("Telecomunicaciones");
      
         this.jComboBox1.get(0).addItem("Civil");
         this.jComboBox1.get(0).addItem("Automotriz");
         
         this.jComboBox1.get(1).addItem("Presencial");
         this.jComboBox1.get(1).addItem("Virtual");
         this.jComboBox1.get(1).addItem("Dual");
         
         this.jComboBox1.get(2).addItem("Cuenca");
         this.jComboBox1.get(2).addItem("Guayaquil");
         this.jComboBox1.get(2).addItem("Quito");
         
         this.jComboBox1.get(3).addItem("El Vecino");
         this.jComboBox1.get(3).addItem("Campus Guayaquil");
         this.jComboBox1.get(3).addItem("El Giron");
         
         this.jComboBox1.get(4).addItem("Matutina");
         this.jComboBox1.get(4).addItem("Vespertina");
         this.jComboBox1.get(4).addItem("Nocturna");
         
         this.jPanelList.get(1).add(this.jComboBox1.get(0));
         this.jPanelList.get(2).add(this.jComboBox1.get(1));
         this.jPanelList.get(3).add(this.jComboBox1.get(2));
         this.jPanelList.get(4).add(this.jComboBox1.get(3));
         this.jPanelList.get(5).add(this.jComboBox1.get(4));
       
    }
    
}

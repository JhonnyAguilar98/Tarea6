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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import static javax.swing.border.TitledBorder.LEFT;

/**
 *
 * @author HP OME
 */
public class Datos_Personales extends JFrame {
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    private List<JTextField> jTextFieldList;
    private List<JPanel> jPanelList;
   

    public Datos_Personales(String title) throws HeadlessException{
        super(title);
        this.setSize(800,700);
        this.setLocation(600, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    
        
    
    
    public void iniciarComponentes(){
        this.jPanel1 = new JPanel();
        this.jPanel1.setBorder(BorderFactory.createTitledBorder("Personal"));
        this.jPanel1.setBackground(Color.WHITE);
        this.jPanel1.setLayout(new GridLayout(9,2));
        
        this.iniciarPaneles();
        this.iniciarEtiquetas();
        this.iniciarTextos();
       
        
    }
    
    public void iniciarPaneles(){
        
        this.jPanelList = new ArrayList<>();
        for(var i=0;i<9;i++)
           this.jPanelList.add(new JPanel());
        
        this.jPanel1.add(this.jPanelList.get(0));
        this.jPanel1.add(this.jPanelList.get(1));
        this.jPanel1.add(this.jPanelList.get(2));
        this.jPanel1.add(this.jPanelList.get(3));
        this.jPanel1.add(this.jPanelList.get(4));
        this.jPanel1.add(this.jPanelList.get(5));
        this.jPanel1.add(this.jPanelList.get(6));
        this.jPanel1.add(this.jPanelList.get(7));
        this.jPanel1.add(this.jPanelList.get(8));
        
    }
    
    public void iniciarEtiquetas(){
        
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("Apellidos:"));
        this.jLabelList.add(new JLabel("Nombres: "));
        this.jLabelList.add(new JLabel("Nacionalidad: "));
        this.jLabelList.add(new JLabel("Genero: "));
        this.jLabelList.add(new JLabel("Correo Electronico Personal: "));
        this.jLabelList.add(new JLabel("Fecha de Nacimiento: "));
        this.jLabelList.add(new JLabel("Telefono Domicilio: "));
        this.jLabelList.add(new JLabel("Telefono Celular: "));
        this.jLabelList.add(new JLabel("Whatsapp: "));
        
        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(1).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(4).add(this.jLabelList.get(4));
        this.jPanelList.get(5).add(this.jLabelList.get(5));
        this.jPanelList.get(6).add(this.jLabelList.get(6));
        this.jPanelList.get(7).add(this.jLabelList.get(7));
        this.jPanelList.get(8).add(this.jLabelList.get(8));
    }
    
    public void iniciarTextos(){
        this.jTextFieldList = new ArrayList<>();
        for(var i=0;i<9;i++)
           this.jTextFieldList.add(new JTextField());
        
        
        this.jTextFieldList.get(0).setText("AGUILAR QUESADA");
        this.jTextFieldList.get(1).setText("JHONNY XAVIER");
        this.jTextFieldList.get(2).setText("ECUATORIANA");
        this.jTextFieldList.get(3).setText("Masculino");
        this.jTextFieldList.get(4).setText("jaguilarq@est.ups.edu.ec");
        this.jTextFieldList.get(5).setText("05/08/1998");
        this.jTextFieldList.get(6).setText("073050632");
        this.jTextFieldList.get(7).setText("0963369142");
        this.jTextFieldList.get(8).setColumns(15);
        
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(1).add(this.jTextFieldList.get(1));
        this.jPanelList.get(2).add(this.jTextFieldList.get(2));
        this.jPanelList.get(3).add(this.jTextFieldList.get(3));
        this.jPanelList.get(4).add(this.jTextFieldList.get(4));
        this.jPanelList.get(5).add(this.jTextFieldList.get(5));
        this.jPanelList.get(6).add(this.jTextFieldList.get(6));
        this.jPanelList.get(7).add(this.jTextFieldList.get(7));
        this.jPanelList.get(8).add(this.jTextFieldList.get(8));
    }
    
}

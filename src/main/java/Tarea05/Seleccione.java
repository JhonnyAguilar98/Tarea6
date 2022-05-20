/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tarea05;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

/**
 *
 * @author HP OME
 */

public class Seleccione extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabel1;
    private List<JPanel> jPaneList1;
    private JComboBox jComboBox3;
    private JComboBox jComboBox4;
    private JComboBox jComboBox5;
    private JComboBox jComboBox6;
    private JComboBox jComboBox7;
    private JComboBox jComboBox8;
    

    public Seleccione(String title) throws HeadlessException {
        super(title);
        this.setSize(1500, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.IniciarComponentes();
        this.setContentPane(this.jPanel1);
    }
    
    public void IniciarComponentes(){
        this.jPanel1=new JPanel();
        this.jPanel1.setLayout(new GridLayout(3,3));
        this.IniciarPaneles();
        this.IniciarEtiquetas();
        this.IniciarCombo();
    }
    
    public void IniciarPaneles(){
        this.jPaneList1= new ArrayList<>();
        for(var i=0;i<9;i++)
           this.jPaneList1.add(new JPanel());
        
        
        this.jPanel1.add(this.jPaneList1.get(0));
        this.jPanel1.add(this.jPaneList1.get(1));
        this.jPanel1.add(this.jPaneList1.get(2));
        this.jPanel1.add(this.jPaneList1.get(3));
        this.jPanel1.add(this.jPaneList1.get(4));
        this.jPanel1.add(this.jPaneList1.get(5));
        this.jPanel1.add(this.jPaneList1.get(6));
        this.jPanel1.add(this.jPaneList1.get(7));
        this.jPanel1.add(this.jPaneList1.get(8));
    }
    
    public void IniciarEtiquetas(){
        
        this.jLabel1=new ArrayList<>();
        this.jLabel1.add(new JLabel("Sede:"));
        this.jLabel1.add(new JLabel("Cmpus/Extension"));
        this.jLabel1.add(new JLabel("Carrera"));
        this.jLabel1.add(new JLabel("Codigo del Proyecto"));
        this.jLabel1.add(new JLabel("Modalidad"));
        this.jLabel1.add(new JLabel("Periodo Academico"));
        this.jLabel1.add(new JLabel("Fecha Inicio Clases: 28/03/2022 al 06/08/2022"));
        this.jPaneList1.get(0).add(this.jLabel1.get(0));
        this.jPaneList1.get(1).add(this.jLabel1.get(1));
        this.jPaneList1.get(2).add(this.jLabel1.get(2));
        this.jPaneList1.get(3).add(this.jLabel1.get(3));
        this.jPaneList1.get(4).add(this.jLabel1.get(4));
        this.jPaneList1.get(5).add(this.jLabel1.get(5));
        this.jPaneList1.get(6).add(this.jLabel1.get(6));
    }
    
    public void IniciarCombo(){
        
        this.jComboBox3= new JComboBox();
        this.jComboBox4= new JComboBox();
        this.jComboBox5= new JComboBox();
        this.jComboBox6= new JComboBox();
        this.jComboBox7= new JComboBox();
        this.jComboBox8= new JComboBox();
        
        this.jComboBox3.addItem("MATRIZ CUENCA");
        this.jComboBox3.addItem("QUITO");
        this.jComboBox3.addItem("GUAYAQUIL");
        
        this.jComboBox4.addItem("EL VECINO");
        this.jComboBox4.addItem("EL GIRON");
        this.jComboBox4.addItem("GUAYAQUIL");
        
        this.jComboBox5.addItem("ELECTRONICA");
        this.jComboBox5.addItem("TELECOMUNICACIONES");
        this.jComboBox5.addItem("COMPUTACION");
        this.jComboBox5.addItem("CIVIL");
        this.jComboBox5.addItem("MECANICA");
        this.jComboBox5.addItem("AUTOMOTRIZ");
        this.jComboBox5.addItem("BIOTECNOLOGIA");
        this.jComboBox5.addItem("VETERINARIA");
        
        this.jComboBox6.addItem("ELECTRONICA [REDISEÑO]-Nueva o Rediseño");
        this.jComboBox6.addItem("TELECOMUNICACIONES [REDISEÑO]-Nueva o Rediseño");
        this.jComboBox6.addItem("COMPUTACION [REDISEÑO]-Nueva o Rediseño");
        this.jComboBox6.addItem("CIVIL [REDISEÑO]-Nueva o Rediseño");
        this.jComboBox6.addItem("MECANICA [REDISEÑO]-Nueva o Rediseño");
        this.jComboBox6.addItem("AUTOMOTRIZ [REDISEÑO]-Nueva o Rediseño");
        
        this.jComboBox7.addItem("PRESENCIAL");
        this.jComboBox7.addItem("VIRTUAL");
        this.jComboBox7.addItem("A DISTACIA");
        
        this.jComboBox8.addItem("2020-2020");
        this.jComboBox8.addItem("2020-2021");
        this.jComboBox8.addItem("2021-2021");
        this.jComboBox8.addItem("2021-2022");
        this.jComboBox8.addItem("2022-2022");
        
        this.jPaneList1.get(0).add(this.jComboBox3);
        this.jPaneList1.get(1).add(this.jComboBox4);
        this.jPaneList1.get(2).add(this.jComboBox5);
        this.jPaneList1.get(3).add(this.jComboBox6);
        this.jPaneList1.get(4).add(this.jComboBox7);
        this.jPaneList1.get(5).add(this.jComboBox8);
       
    }

    
        
       
        
    

}

    

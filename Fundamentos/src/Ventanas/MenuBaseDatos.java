package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MenuBaseDatos extends Frame implements ActionListener{
    MenuBar mbarra;
    Menu m1,m2,m3,m4;
    MenuItem m11,m12,m13,m14,m21,m22,m23,m24,m31,m32,m41,m42;
    Label estado;
    TextArea ta;
    
   
    
   
    
    
    public MenuBaseDatos() {
        this.setTitle("Base de datos");
        this.setLayout(new BorderLayout());
        ta= new TextArea();
        ta.setBackground(Color.black);
        ta.setForeground(Color.green);
        estado=new Label("Estado:                                    ");
        estado.setBackground(Color.green);
        this.add("South",estado);
        this.add("Center",ta);
        //crear menu
        mbarra=new MenuBar();
        m1=new Menu("BD");
        m2 = new Menu("Sentencias");
        m3 = new Menu("Precompilados");
        m4 = new Menu("Transacciones");
        
        
        
        
        m11=new MenuItem("Cargar DRV");
       
        m12=new MenuItem("Conectar");
        
        m13=new MenuItem("Desconectar");
        m14=new MenuItem("Salir");
        //añadir menu
    
      
        
        m21 = new MenuItem("Alta");
        m22 = new MenuItem("Baja");
        m23 = new MenuItem("Modificaciones");
        m24 = new MenuItem("Consultar Tabla");
        
        
        m31 = new MenuItem("Buscador");
       
        m41 = new MenuItem("Insertar");
        m42 = new MenuItem("Commit");
       
        m11.addActionListener(this);
        m12.addActionListener(this);
        m13.addActionListener(this);
        m14.addActionListener(this);
        m21.addActionListener(this);
        m22.addActionListener(this);
        m23.addActionListener(this);
        m24.addActionListener(this);
        m31.addActionListener(this);
        m41.addActionListener(this);
        m42.addActionListener(this);
          
        
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.addSeparator();
        m1.add(m14);
        
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        m2.add(m24);
        
        m3.add(m31);
        m4.add(m41);
        m4.add(m42);
         
       
        mbarra.add(m1);
        mbarra.add(m2);
        mbarra.add(m3);
        mbarra.add(m4);
        
        this.setMenuBar(mbarra);
        
        this.setSize(800,600);
        
        //cerrar la ventana***************
    this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
                System.exit(0);
            }
    });
    this.setResizable(false);
     this.setVisible(true);
    }
     
                
    public static void main(String[] args) {
        new MenuBaseDatos();
    }
    public void actionPerformed (ActionEvent e){
        if (e.getSource() == m11) estado.setText("Estado:  "+ m11.getLabel());
        if (e.getSource() == m12) estado.setText("Estado:  "+ m12.getLabel());
        if (e.getSource() == m13) estado.setText("Estado:  "+ m13.getLabel());
        if (e.getSource() == m14) estado.setText("Estado:  "+ m14.getLabel());
        if (e.getSource() == m21){
            new Coche().setVisible(true);
            estado.setText("Estado:  "+ m21.getLabel());
        }
        if (e.getSource() == m22) estado.setText("Estado:  "+ m22.getLabel());
        if (e.getSource() == m23) estado.setText("Estado:  "+ m23.getLabel());
        if (e.getSource() == m24) estado.setText("Estado:  "+ m24.getLabel());
        if (e.getSource() == m31) estado.setText("Estado:  "+ m31.getLabel());
        if (e.getSource() == m41) estado.setText("Estado:  "+ m41.getLabel());
        if (e.getSource() == m42) estado.setText("Estado:  "+ m42.getLabel());   
    }
}

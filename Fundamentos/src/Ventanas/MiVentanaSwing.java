
package Ventanas;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
public class MiVentanaSwing extends JFrame implements ActionListener {
    
    JButton jb;
    JTextField jt;
    
    MiVentanaSwing()
    {
       
        this.setTitle("Mi Ventana Swing");
         jb = new JButton("Escribir");
         jt= new JTextField(20);
         this.add(jb);
         this.add(jt);
         
  
        this.setSize(500,500);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        jb.addActionListener(this);
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new MiVentanaSwing();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jb){
            jt.setText("Pulsado....");
        }
    }
}

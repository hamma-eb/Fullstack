
package Ventanas;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class MiVentana extends Frame implements ActionListener{
   Button b;
   TextField txt;
   static Ventana2 v2;
    MiVentana()
    {
       
        this.setTitle("Mi Ventana");
        
        
        
         b = new Button("Pulsar");
         txt= new TextField(20);
         this.add(b);
         this.add(txt);
         //cerrar la ventana************************************
            this.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e)
                {
                    dispose();//cierra la ventana
                    System.exit(0);
                }
                }//cierra la clase anónima
                );
         //****************************
         b.addActionListener(this);
        this.setSize(500,500);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));
        
        this.setVisible(true);
        
        
    }
    public static void main(String[] args) {
        new MiVentana();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b){
            txt.setText("Pulsado....");
            
            if (v2==null) {
             v2= new Ventana2();
            }
            
        }
    }
}

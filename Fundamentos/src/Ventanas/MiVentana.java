
package Ventanas;

import java.awt.*;
import java.awt.event.*;

public class MiVentana extends Frame implements ActionListener{
   Button b;
  TextField txt;
  
    MiVentana()
    {
       
        this.setTitle("Mi Ventana");
        
         b = new Button("Pulsar");
         txt= new TextField(20);
         this.add(b);
         this.add(txt);
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
        }
    }
}

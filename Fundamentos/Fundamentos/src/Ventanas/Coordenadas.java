/*
public interface MouseListener {
 
public void mousePressed(MouseEvent e);
public void mouseReleased(MouseEvent e);cuando lo suelt
public void mouseClicked(MouseEvent e);apretar y soltar
public void mouseEntered(MouseEvent e);como el de java
public void mouseExited(MouseEvent e);cuando sales de ese area del raton
}
 */
package Ventanas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Coordenadas extends JFrame{
   JLabel lx,ly;
   JTextField tx,ty;
   JPanel jp;
   
    Coordenadas () {
        this.setTitle("Coordenadas");
        this.setSize(700, 600);
        this.setLayout(new BorderLayout());
        lx=new JLabel("X: ");
        ly=new JLabel("Y: ");
        tx=new JTextField(5);
        ty=new JTextField(5);
        jp=new JPanel();
        jp.setBackground(Color.orange);
        jp.add(lx);
        jp.add(tx);
        jp.add(ly);
        jp.add(ty);
        this.add("North",jp);   
        this.addMouseListener(new Raton());
        this.setVisible(true);
   }
    public static void main(String[] args) {
        new Coordenadas();
    }
        class Raton extends MouseAdapter{
            
            public void mouseClicked(MouseEvent e){
                tx.setText(""+e.getX());
                ty.setText(String.valueOf(e.getY()));
            }
        }//interna
}//clase externa


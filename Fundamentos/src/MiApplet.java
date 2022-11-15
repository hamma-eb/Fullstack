

import java.applet.Applet;
import java.awt.*;
public class MiApplet extends Applet{
   
    public void init()
    {
        this.setBackground(Color.green);
        
    }
    public void paint(Graphics g)
    {
        //g.drawString ("Hoy es lunes",100,30);
        String paises[] = {"España","Japon","Inglaterra","Francia"};
        g.setFont(new Font("Arial",Font.BOLD,22));
        for (int i = 0; i < paises.length; i++) 
        {
            g.drawString(paises[i],20,i*20+30);
        }
        g.drawLine(0,0,300,300);
        g.drawRect(100,100,200,100);
        g.setColor(Color.yellow);
        g.fillRect(200,200,200,100);
        g.setColor(Color.blue);
        g.fillOval(400,30,100,100);
        g.drawRoundRect(320,100,200,200,20,20);
        g.fillArc(400,400,300,300,0,90);
    }
}

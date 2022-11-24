
import java.applet.Applet;
import java.awt.*;

public class TextoMovimiento extends Applet implements Runnable {

    Thread t;
    int x;
    int y;
    public void init() {
        x=0;
        y=0;
        this.setForeground(Color.magenta);
    }

    public void start() {
        if (t == null);
        {
            t = new Thread(this);
            t.start();
            
        }

    }

    public void stop() {
        if(t!=null){
            t.stop();
            t = null;
        }
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial",Font.PLAIN,25));
        g.drawString("Java",x,y);
    }

    public void run() 
            
    {
        System.out.println("fyhjfhy");
        while (true) {            
            x=x+5;
            y=y+9;
            try{
                t.sleep(150);
            }catch(Exception es){}
            repaint(); 
            }//While
    }//run
}

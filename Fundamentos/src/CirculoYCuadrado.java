import java.applet.Applet;
import java.awt.*;
public class CirculoYCuadrado extends Applet{
    public boolean mouseDown (Event e,int x,int y)
    {
        //obtener el contexto gráfico fuera del paint
        Graphics g = this.getGraphics();
        
        if(x>this.size().width/2) 
        {
            g.fillRect(x, y, 20, 20);
        }else{
            g.fillOval(x,y,20,20);
        }
        
        return true;
    }
    public boolean mouseDrag (Event e,int x,int y)
    {
        //obtener el contexto gráfico fuera del paint
        Graphics g = this.getGraphics();
        
        if(x>this.size().width/2) 
        {
            g.fillRect(x, y, 20, 20);
        }else{
            g.fillOval(x,y,20,20);
        }
        
        return true;
    }
    
    /*
    Public boolean mouseDown(Event e, int x,int y)
    {
    return true;
    }
    
    Ancho del Applet:
    this.size().width
    Alto del Applet:
    this.size().height
    */
}

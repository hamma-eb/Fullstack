
import java.applet.Applet;
import java.awt.*;


public class Boton extends Applet{
    Button b;
    TextField txt;
    public void init()
{
    b=new Button("Pulsar");
    txt=new TextField(15);
    this.add(b);
    this.add(txt);
    
}
    public boolean action(Event e,Object obj) 
    {
        if(obj.equals("Pulsar")) 
        {
            txt.setText("Botón pulsado");
        }
        return true;
    }

}
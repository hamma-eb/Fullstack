import java.applet.Applet;
import java.awt.*;
public class Pintar extends Applet{
   Button azul;
   Button rojo;
   Color color;
   Label ltamaño;
   Choice lista;   
   int tamaños[] = {10,20,30};
   
   
   public void init() {
       azul = new Button("azul");
       rojo = new Button("rojo");
       color = Color.BLUE;
       ltamaño = new Label("tamaño:"+tamaños[0]+"");
       lista = new Choice();
       
       lista.add(""+tamaños[0]+"");
       lista.add(""+tamaños[1]+"");
       lista.add(""+tamaños[2]+"");
       this.add(azul);
       this.add(rojo);
       this.add(ltamaño);
       this.add(lista);
   }
   
   void pintar(int x, int y) {
       Graphics g = this.getGraphics();
       int w = Integer.parseInt(lista.getSelectedItem());
       g.setColor(color);
       g.fillOval(x-(w/2),y-(w/2),w,w);
   }
   public boolean action(Event e, Object obj){
       if(obj.equals("azul")) {
           color = Color.BLUE;
       }else{
           color = Color.RED;
       }
       if(obj.equals(obj)){
           ltamaño.setText("tamaño:"+lista.getSelectedItem());
       }
       return true;
   }
   
   public boolean mouseDrag (Event e, int x, int y)
   {
       pintar(x,y);
       return true;
   }
}

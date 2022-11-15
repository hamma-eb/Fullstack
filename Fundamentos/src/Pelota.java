
import java.applet.Applet;
import java.awt.*;

public class Pelota extends Applet{

    class Plota {

        int x;
        int y;
        int wh;
        int s;

        public Plota(int x, int y, int wh, int s) {
            this.x = x;
            this.y = y;
            this.wh = wh;
            this.s = s;
        }
    }
        Graphics g;
        Plota plota;
        public void init() {
            g = this.getGraphics();
            plota = new Plota((this.size().width / 2) -25,(this.size().height / 2) - 25, 50, 1);
        }

        public void paint(Graphics g) {
            try{
                g.fillOval(plota.x, plota.y, plota.wh, plota.wh);
            }catch (Exception e){
                
            }
            
        }

        public boolean keyDown(Event e, int key) {
            System.out.println(key);
            switch (key) {
                case 1004:
                    if(plota.y >= 0) {
                        plota.y = plota.y - plota.s;
                    }
                    
                    break;
                case 1005:
                    if(plota.y + plota.wh <= this.size().height) {
                        plota.y = plota.y + plota.s;
                    }
                    
                    break;

                case 1006:
                    if(plota.x >=0){
                       plota.x = plota.x - plota.s; 
                    }
                    
                    break;
                case 1007:
                    if(plota.x + plota.wh <= this.size().width){
                         plota.x = plota.x + plota.s;
                    }
                   
                    break;
                case 115:
                    plota.s += 10;
                    break;
                case 97:
                    plota.s -= 10;
                    break;
                case 100:
                    plota.wh += 10;
                    break;
                case 102:
                    plota.wh-= 10;
                    break;
            }
            repaint();
            return true;
            /*
    public boolean keyDown(Event e,int key)
    {
    return true;
    }
    Event.LEFT
    Event.UP
    Event.DOWN
    Event.LEFT
    
    repaint();//borra la pantalla y llama a Paint()
             */
        }
    }

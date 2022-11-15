
import java.applet.Applet;
import java.awt.*;
/**
 *
 * 
 * Date fecha=new Date();
 * fecha.getHours();devuelve int
 * fecha.getMinutes();devuelve int
 * fecha.getSeconds();devuelve int
 */
import java.util.Date;
public class Reloj extends Applet implements Runnable{
    Thread t;
    Date date;
    int hora;
    int minuto;
    int segundo;
    
    public void init(){
        date = new Date();
        hora = date.getHours();
        minuto = date.getMinutes();
        segundo = date.getSeconds();
    }
    public void start(){
        if(t==null){
            t = new Thread(this);
            t.start();
        }
    System.out.println(hora);
}
    public void stop(){
        if(t != null){
            t.stop();
            t = null;
        }
        
    }
    public void paint(Graphics g){
        g.fillRect(this.size().width-100, 0,100,50);
        g.setColor(Color.yellow);
        if(segundo>10){
            g.drawString(hora+" : "+minuto+" : "+segundo,this.size().width-80,30);
        }else {
            g.drawString(hora+" : "+minuto+" : 0"+segundo,this.size().width-80,30);
        }
        if(minuto>10 && segundo >10){
            g.drawString(hora+" : "+minuto+" : "+segundo,this.size().width-80,30);
        }else {
            g.drawString(hora+" : 0"+minuto+" : "+segundo,this.size().width-80,30);
        }
        if(hora>10 && minuto >10 && segundo >10){
            g.drawString(hora+" : "+minuto+" : "+segundo,this.size().width-80,30);
        }else {
            g.drawString("0"+hora+" : "+minuto+" : "+segundo,this.size().width-80,30);
        }
        
    }
    public void run(){
        
        while (true) {            
            date = new Date();
            hora = date.getHours();
            minuto = date.getMinutes();
            segundo = date.getSeconds();
            
            
            try{
                t.sleep(1000);
                repaint();
            }catch(Exception e){
                
            }
        }
        
    }
}

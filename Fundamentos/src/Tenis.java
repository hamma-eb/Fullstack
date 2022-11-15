
import java.applet.Applet;
import java.awt.*;

public class Tenis extends Applet implements Runnable {

    Graphics g;
    Pelota pelota;
    Raqueta raqueta;
    Thread t;

    class Pelota {

        int w;
        int h;
        int x;
        int y;
        int sx;
        int sy;
        int ss;
        Color color;

        public Pelota(int w, int h, int x, int y, int sx, int sy, int ss, Color color) {

            this.w = w;
            this.h = h;
            this.x = x;
            this.y = y;
            this.sx = sx;
            this.sy = sy;
            this.ss = ss;
            this.color = color;
        }

        void draw() {
            g.setColor(this.color);
            g.fillOval(this.x, this.y, this.w, this.h);
            
        }
         void update(int w, int h) {
            if (this.x <= raqueta.x + raqueta.w && this.y + this.h >= raqueta.y && this.y <= raqueta.y + raqueta.h) {
                this.sx = this.ss;

            }
            if (this.x + this.w >= w) {
                this.sx = -this.ss;
            }
            if (this.y <= 0) {
                this.sy = -this.ss;
            }
            if (this.y >= h) {
                this.sy = this.ss;
            }
            if (this.y < raqueta.y + (raqueta.h / 2) && this.x <= raqueta.x+raqueta.w) {
                this.sy = ((this.y+(this.h / 2)) -(raqueta.y + (raqueta.h / 2))) / 30;
            }
            if (this.y < raqueta.y + (raqueta.h / 2) && this.x <= raqueta.x+raqueta.w) {
                this.sy = ((this.y + (this.h / 2)) - (raqueta.y + (raqueta.h / 2))) / 30;
            }

            this.x += this.sx;
            this.y += this.sy;
        }

       

    }

    class Raqueta {

        int w;
        int h;
        int x;
        int y;
        int sx;
        int sy;
        int ss;
        Color color;

        public Raqueta(int w, int h, int x, int y, int sx, int ss, Color color) {
            this.w = w;
            this.h = h;
            this.x = x;
            this.y = y;
            this.sy = sy;
            this.sx = sx;
            this.ss = ss;
            this.color = color;
        }

        void draw() {
            g.setColor(this.color);
            g.fillRect(this.x, this.y, this.w, this.h);
        }

       

    }

    public void init() {
        g = getGraphics();
        pelota = new Pelota(50, 50, (this.size().width / 2) - 25, (this.size().height / 2) - 25, 2, 0, 2, Color.RED);
        raqueta = new Raqueta(20, 100, 20, (this.size().height - 20) - 50, 5, 10, Color.BLUE);
    }

    public void paint(Graphics g) {

    }

    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.start();
        }

    }

    public void stop() {
        if (t != null) {
            t.stop();
            t = null;
        }
    }

    public void run() {
        while (true) {
            g.clearRect(0, 0, this.size().width, this.size().height);
            pelota.draw();
            pelota.update(this.size().width, this.size().height);
            raqueta.draw();

            try {
                t.sleep(10);

            } catch (Exception e) {
            }
        }
    }

    public boolean keyDown(Event e, int key) {
        System.out.println(key);
        if (key == 1004 && raqueta.y >0) {
            raqueta.y -= raqueta.ss;
        }
        if (key == 1005 && raqueta.y + raqueta.h < this.size().height) {
            raqueta.y += raqueta.ss;
        }
        return true;
    }
}

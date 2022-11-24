
package Ventanas;
import java.awt.event.*;
import java.awt.*;

public class Ventana2 extends Frame {

    Ventana2() {

        this.setTitle("Ventana2");
        this.setSize(400, 400);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                MiVentana.v2 = null;
                dispose();//cierra la ventana
            }
        }//cierra la clase anónima
        );
        //****************************

        this.setVisible(
                true);

        this.setLayout(
                new FlowLayout(FlowLayout.LEFT));

        this.setVisible(
                true);
    }

}

package InterfazGrafica;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pintor
{
    public static void main(String[] args)
    {
        JFrame aplicacion = new JFrame("A simple drawing program");
        PanelDibujo panelDibujo = new PanelDibujo();
        aplicacion.add(panelDibujo, BorderLayout.CENTER);

        aplicacion.add(new JLabel("Arrastre el raton para dibujar"),
                BorderLayout.SOUTH);

        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(400, 200);
        aplicacion.setVisible(true);
    }
}

package InterfazGrafica;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarcoRastreadorRaton extends JFrame {
    private final JPanel panelRaton;
    private final JLabel barraEstado;

    public MarcoRastreadorRaton() {
        super("Demonstration of mouse events");

        panelRaton = new JPanel();
        panelRaton.setBackground(Color.WHITE);
        add(panelRaton, BorderLayout.CENTER);

        barraEstado = new JLabel("Mouse out of JPanel");
        add(barraEstado, BorderLayout.SOUTH);

        ManejadorRaton manejador = new ManejadorRaton() {
            @Override
            public void mousePressed(MouseEvent e) {

            }
        };
        panelRaton.addMouseListener(manejador);
        panelRaton.addMouseMotionListener(manejador);
    }

    private abstract class ManejadorRaton implements MouseListener,
            MouseMotionListener
    {
        @Override
        public void mouseClicked(MouseEvent evento) {
            barraEstado.setText(String.format("Clicked on [%d, %d]", evento.getX(), evento.getY()));
        }

        @Override
        public void mouseReleased(MouseEvent evento) {
            barraEstado.setText(String.format("Got loose on [%d, %d]", evento.getX(), evento.getY()));
        }

        @Override
        public void mouseEntered(MouseEvent evento) {
            barraEstado.setText(String.format("Mouse entered [%d, %d]", evento.getX(), evento.getY()));
            panelRaton.setBackground(Color.GREEN);
        }

        @Override
        public void mouseExited(MouseEvent evento) {
            barraEstado.setText("Raton fuera de JPanel");
            panelRaton.setBackground(Color.WHITE);
        }

        @Override
        public void mouseDragged(MouseEvent evento) {
            barraEstado.setText(String.format("Se arrastro en [%d, %d]", evento.getX(), evento.getY()));
        }

        @Override
        public void mouseMoved(MouseEvent evento) {
            barraEstado.setText(String.format("Moved in [%d, %d]", evento.getX(), evento.getY()));
        }
    }
}


package InterfazGrafica;

import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame {
    private final JButton botonJButtonIzquierda;
    private final JButton botonJButtonCentro;
    private final JButton botonJButtonDerecha;
    private final FlowLayout esquema;
    private final Container contenedor;

    public MarcoFlowLayout()
    {
        super("Demonstration of FlowLayout");
        esquema = new FlowLayout();
        contenedor = getContentPane();
        setLayout(esquema);
        botonJButtonIzquierda = new JButton("Left");
        add(botonJButtonIzquierda);
        botonJButtonIzquierda.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent evento)
            {
                esquema.setAlignment(FlowLayout.LEFT);
                esquema.layoutContainer(contenedor);
            }
        }
        );
        botonJButtonCentro = new JButton("Center");
        add(botonJButtonCentro);
        botonJButtonCentro.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent evento)
            {
                esquema.setAlignment(FlowLayout.CENTER);
                esquema.layoutContainer(contenedor);
            }
        }
        );
        botonJButtonDerecha = new JButton("Right");
        add(botonJButtonDerecha);
        botonJButtonDerecha.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent evento)
            {
                esquema.setAlignment(FlowLayout.RIGHT);
                esquema.layoutContainer(contenedor);
            }
        }
        );
    }
}

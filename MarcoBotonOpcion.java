package InterfazGrafica;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class MarcoBotonOpcion extends JFrame
{
    private final JTextField campoTexto;

    private final Font tipoLetraSimple;
    private final Font tipoLetraNegrita;
    private final Font tipoLetraCursiva;
    private final Font tipoLetraNegritaCursiva;

    private final JRadioButton simpleJRadioButton;
    private final JRadioButton negritaJRadioButton;
    private final JRadioButton cursivaJRadioButton;
    private final JRadioButton negritaCursivaJRadioButton;
    private ButtonGroup grupoOpciones;

    public MarcoBotonOpcion()
    {
        super ("Prueba de RadioButton");
        setLayout (new FlowLayout());

        campoTexto = new JTextField("Observe el cambio en el estilo del tipo de" + "letra",25);
        add(campoTexto);

        simpleJRadioButton = new JRadioButton("Simple",true);
        negritaJRadioButton = new JRadioButton("Bold font",false);
        cursivaJRadioButton = new JRadioButton("Italics",false);
        negritaCursivaJRadioButton = new JRadioButton("Bold/Italic",false);
        add(simpleJRadioButton);//agrega boton simple a JFrame
        add(negritaJRadioButton);//agrega boton negrita a JFrame
        add(cursivaJRadioButton);//agrega boton cursiva a JFrame
        add(negritaCursivaJRadioButton);//agrega boton negrita y cursiva

        //crea una relacion logica entre los objeto JRadioButton
        grupoOpciones = new ButtonGroup();//crea ButtonGroup
        grupoOpciones.add(simpleJRadioButton);//crea ButtonGroup
        grupoOpciones.add(negritaJRadioButton);//agrega negrita al grupo
        grupoOpciones.add(cursivaJRadioButton);//agrega cursiva al grupo
        grupoOpciones.add(negritaCursivaJRadioButton);//agrega negrita y cursiva

        //crea objetos tipo de letra
        tipoLetraSimple = new Font("Serif",Font.PLAIN,14);
        tipoLetraNegrita = new Font("Serif",Font.BOLD,14);
        tipoLetraCursiva = new Font("Serif",Font.ITALIC,14);
        tipoLetraNegritaCursiva = new Font("Serif",Font.BOLD+Font.ITALIC,14);
        campoTexto.setFont(tipoLetraSimple);

        simpleJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraSimple));
        negritaJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraNegrita));
        cursivaJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraCursiva));
        negritaCursivaJRadioButton.addItemListener(
                new ManejadorBotonOpcion(tipoLetraNegritaCursiva));
    }
    //clase interna privada para manejar eventos de botones de opcion
    private class ManejadorBotonOpcion implements ItemListener{
        private Font tipoLetra;//tipo de letra asociado con este componente de escucha
        public ManejadorBotonOpcion(Font f){
            tipoLetra=f;
        }
        //maneja los eventos de botones de opcion
        @Override
        public void itemStateChanged(ItemEvent evento) {
            campoTexto.setFont(tipoLetra);
        }
    }
}

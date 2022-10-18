package InterfazGrafica;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame{
    private JLabel etiqueta1;
    private JLabel etiqueta2;
    private JLabel etiqueta3;

    public LabelFrame(){
        super("Test JLabel");
        setLayout(new FlowLayout());

        etiqueta1 = new JLabel("Label with text");
        etiqueta1.setToolTipText("This is label1");
        add(etiqueta1);//

        Icon insecto= new ImageIcon(getClass().getResource("Mariposa.jpg"));
        etiqueta2 = new JLabel("Label with text and icon",insecto,SwingConstants.LEFT);
        etiqueta2.setToolTipText("This is the label2");
        add(etiqueta2);

        etiqueta3 = new JLabel();
        etiqueta3.setText("Label with icon and text at the bottom");
        etiqueta3.setIcon(insecto);
        etiqueta3.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta3.setVerticalTextPosition(SwingConstants.BOTTOM);
        etiqueta3.setToolTipText("This is label3");
        add(etiqueta3);
    }
}


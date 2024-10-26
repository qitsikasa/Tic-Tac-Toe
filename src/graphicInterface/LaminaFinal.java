package graphicInterface;

import java.awt.*;
import javax.swing.*;

public class LaminaFinal extends JPanel {
    public static final int cuadro = 75;
    public LaminaFinal() {
        super();
        setLayout(new BorderLayout());

        JLabel lbl = new JLabel("Tic Tac Toe");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        add(lbl, BorderLayout.NORTH);

        RecuadroJuego recuadro = new RecuadroJuego();
        add(recuadro, BorderLayout.CENTER);

        LaminaGrilla grilla = new LaminaGrilla();
        add(grilla, BorderLayout.WEST);

        setVisible(true);
    }
}

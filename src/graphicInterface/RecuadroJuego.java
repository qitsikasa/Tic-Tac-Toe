package graphicInterface;

import java.awt.*;
import javax.swing.*;

public class RecuadroJuego extends JPanel {
    int cuadro = 75;
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(cuadro * 2, cuadro, cuadro * 2, cuadro * 4);
        g.drawLine(cuadro * 3, cuadro, cuadro * 3, cuadro * 4);
        g.drawLine(cuadro, cuadro * 2, cuadro * 4, cuadro * 2);
        g.drawLine(cuadro, cuadro * 3, cuadro * 4, cuadro * 3);

        g.drawLine(cuadro*5, 0, cuadro*5, 9000);

    }
}

package graphicInterface;

import javax.swing.*;
import java.awt.*;

public class Marco extends JFrame{
    public Marco() {

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int anchoPantalla = tamanoPantalla.width;
        int altoPantalla = tamanoPantalla.height;

        setSize(anchoPantalla/3+100, altoPantalla/2);
        setLocation(anchoPantalla/3, altoPantalla/4);
        //setBounds(500, 150, 450, 525);
        setVisible(true);
        setTitle("Tic Tac Toe");
        setResizable(false);
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
        Image icono = miPantalla.getImage("src/graphicInterface/media/icono.png");
        setIconImage(icono);
    }
}

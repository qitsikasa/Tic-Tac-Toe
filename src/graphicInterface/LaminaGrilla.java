package graphicInterface;

import javax.swing.*;
import java.awt.*;

public class LaminaGrilla extends JPanel {
    // Crea un arreglo de botones para las celdas
    private JButton[] botones = new JButton[9];
    int cuadro = 75;

    // Constructor de la clase
    public LaminaGrilla() {


        // Establece el layout en GridLayout con un espacio entre componentes
        setLayout(new GridLayout(3, 3, 10, 10));

        setBounds(cuadro, cuadro, cuadro * 3, cuadro * 3);

        // Crea los botones y los agrega a las celdas
        for (int i = 0; i < 9; i++) {
            botones[i] = new JButton("-");
            botones[i].setPreferredSize(new Dimension(50, 50)); // Establece el tamaño preferido de los botones
            add(botones[i]);
        }
        // Muestra la ventana
        setVisible(true);
    }

}
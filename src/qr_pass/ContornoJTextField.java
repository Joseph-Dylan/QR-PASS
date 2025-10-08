
package qr_pass;


import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class ContornoJTextField {
    public void contorno() {
        JFrame frame = new JFrame("Ejemplo JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JTextField textField = new JTextField("Texto de ejemplo");
        textField.setBorder(new LineBorder(Color.RED, 2));

        frame.setLayout(new FlowLayout());
        frame.add(textField);
        frame.setVisible(true);
    }
}
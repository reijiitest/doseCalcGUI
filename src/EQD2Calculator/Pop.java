package EQD2Calculator;

import javax.swing.*;

public class Pop {
    public static void infoBox(String infoMessage, String titleBar) {
        JOptionPane.showMessageDialog(null, infoMessage, "Ошибка ввода" + titleBar, JOptionPane.ERROR_MESSAGE);
    }
}

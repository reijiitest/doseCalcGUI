package dcgui;

import javax.swing.*;

public class MyInputVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String doubleNum = ((JTextField) input).getText();
        try {
            doubleNum = doubleNum.replaceAll(",",".");
            Double.parseDouble(doubleNum);
            return true;
        } catch (NumberFormatException e) {
            Pop.infoBox("введите *число* в каждое поле", "");
            return false;
        }
    }

    public static class Pop
    {
        public static void infoBox(String infoMessage, String titleBar)
        {
            JOptionPane.showMessageDialog(null, infoMessage, "Ошибка ввода" + titleBar, JOptionPane.ERROR_MESSAGE);
        }
    }
}

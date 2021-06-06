package EQD2Calculator;

import javax.swing.*;

public class MyInputVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        String doubleNum = ((JTextField) input).getText();
//        if (doubleNum.isBlank()) {return true;} else
        try {
            doubleNum = doubleNum.replaceAll(",",".");
            Double.parseDouble(doubleNum);
            return true;
        } catch (NumberFormatException e) {
            Pop.infoBox("введите *число* в каждое поле", "");
            return false;
        }
    }
}
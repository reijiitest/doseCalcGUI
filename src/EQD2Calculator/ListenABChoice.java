package EQD2Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenABChoice implements ActionListener {
    JComboBox ABChoice;
    JTextField isAB;

    public ListenABChoice(JComboBox ABChoice, JTextField isAB){
        this.ABChoice = ABChoice;
        this.isAB = isAB;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JComboBox ABChoice = (JComboBox)e.getSource();
        String ABss = (String)ABChoice.getSelectedItem();
        switch (ABss){
            case "Легкое": isAB.setText("3");
            break;
            case "Простата": isAB.setText("3");
            break;
            case "Кость": isAB.setText("3");
            break;
            case "Печень": isAB.setText("1");
            break;
            case "Мозг": isAB.setText("3");
            break;
        }
    }
}

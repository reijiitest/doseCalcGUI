package EQD2Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenABChoice implements ActionListener {
    JComboBox ABChoice;

    public ListenABChoice(JComboBox ABChoice){
        this.ABChoice = ABChoice;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JComboBox ABChoice = (JComboBox)e.getSource();
        String ABss = (String)ABChoice.getSelectedItem();

    }
}

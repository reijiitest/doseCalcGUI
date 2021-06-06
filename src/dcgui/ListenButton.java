package dcgui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ListenButton implements ActionListener {
    JButton button;
    JTextField isd;
    JTextField isD;
    JTextField isAB;
    JTextField tfRes;

    DecimalFormat df = new DecimalFormat("###.##");

    public ListenButton(JButton button, JTextField isd, JTextField isD, JTextField isAB, JTextField tfRes){
        this.button = button;
        this.isd = isd;
        this.isD = isD;
        this.isAB = isAB;
        this.tfRes =tfRes;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double d = Double.parseDouble(isd.getText().replaceAll(",", "."));
        double D = Double.parseDouble(isD.getText().replaceAll(",", "."));
        double ab = Double.parseDouble(isAB.getText().replaceAll(",", "."));
        tfRes.setText(String.valueOf(df.format(D * ((d + ab) / (2 + ab)))));

    }
}

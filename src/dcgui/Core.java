package dcgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Core extends JFrame {

    public Core() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocation(700, 300);

        JPanel panelUp = new JPanel();
        panelUp.setBackground(Color.lightGray);
        add(panelUp, BorderLayout.CENTER);

        JPanel panelDown = new JPanel();
        panelDown.setBackground(Color.lightGray);
        add(panelDown, BorderLayout.SOUTH);

        JTextField isd = new JTextField("РОД");
        isd.setHorizontalAlignment(SwingConstants.CENTER);
        isd.setPreferredSize(new Dimension(150, 20));
        String isdS = isd.getText();

        JTextField isD = new JTextField("СОД");
        isD.setHorizontalAlignment(SwingConstants.CENTER);
        isD.setPreferredSize(new Dimension(150, 20));
        String isDS = isD.getText();

        JTextField isAB = new JTextField("α/β");
        isAB.setHorizontalAlignment(SwingConstants.CENTER);
        isAB.setPreferredSize(new Dimension(150, 20));
        String isABS = isAB.getText();

        JTextField tfRes = new JTextField(6);
        tfRes.setHorizontalAlignment(SwingConstants.CENTER);
        tfRes.setEditable(false);

        JButton button = new JButton("РАСЧЕТ");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double d = Double.parseDouble(isdS);
                double D = Double.parseDouble(isDS);
                double ab = Double.parseDouble(isABS);
                double eqdTwo = D * ((d + ab) / (2 + ab));
                tfRes.setText(String.valueOf(eqdTwo));
            }
        });

        panelUp.add(isd, BorderLayout.WEST);
        panelUp.add(isD, BorderLayout.CENTER);
        panelUp.add(isAB, BorderLayout.EAST);
        panelDown.add(button, BorderLayout.WEST);
        panelDown.add(tfRes, BorderLayout.CENTER);

        setVisible(true);

    }}

    class Terminal {
        public static void main(String[] args) {
            EventQueue.invokeLater(() -> {
                try {
                    new Core();
                } catch (Exception e) {
                    e.printStackTrace();}});}}


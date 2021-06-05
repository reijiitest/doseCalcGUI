package dcgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Core extends JFrame implements ActionListener {

    public Core() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocation(700, 300);

        JPanel panelUp = new JPanel();
        panelUp.setBackground(Color.lightGray);
        add(panelUp, BorderLayout.NORTH);

        JPanel panelMid = new JPanel();
        panelMid.setBackground(Color.lightGray);
        add(panelMid, BorderLayout.CENTER);

        JPanel panelDown = new JPanel();
        panelDown.setBackground(Color.lightGray);
        add(panelDown, BorderLayout.SOUTH);

        JTextField isd = new JTextField();
        isd.setHorizontalAlignment(SwingConstants.CENTER);
        isd.setPreferredSize(new Dimension(150, 20));
        isd.setInputVerifier(new MyInputVerificator());

        JTextField isD = new JTextField();
        isD.setHorizontalAlignment(SwingConstants.CENTER);
        isD.setPreferredSize(new Dimension(150, 20));
        isD.setInputVerifier(new MyInputVerificator());

        JTextField isAB = new JTextField();
        isAB.setHorizontalAlignment(SwingConstants.CENTER);
        isAB.setPreferredSize(new Dimension(150, 20));
        isAB.setInputVerifier(new MyInputVerificator());

        JLabel dpf = new JLabel("Разовая доза");
        dpf.setBackground(Color.lightGray);
        dpf.setHorizontalAlignment(SwingConstants.CENTER);
        dpf.setVerticalAlignment(SwingConstants.CENTER);
        dpf.setPreferredSize(new Dimension(150, 20));

        JLabel dpc = new JLabel("Суммарная доза");
        dpc.setBackground(Color.lightGray);
        dpc.setHorizontalAlignment(SwingConstants.CENTER);
        dpc.setVerticalAlignment(SwingConstants.CENTER);
        dpc.setPreferredSize(new Dimension(150, 20));

        JLabel alfabeta = new JLabel("α/β ткани");
        alfabeta.setBackground(Color.lightGray);
        alfabeta.setHorizontalAlignment(SwingConstants.CENTER);
        alfabeta.setVerticalAlignment(SwingConstants.CENTER);
        alfabeta.setPreferredSize(new Dimension(150, 20));

        JTextField tfRes = new JTextField(6);
        tfRes.setHorizontalAlignment(SwingConstants.CENTER);
        tfRes.setEditable(false);

        DecimalFormat df = new DecimalFormat("###.##");

        JButton button = new JButton("РАСЧЕТ");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {if (e.getSource() == button){
                String isdS = isd.getText();
                isdS = isdS.replaceAll(",",".");
                double d = Double.parseDouble(isdS);
                System.out.println(d);
                String isDS = isD.getText();
                isDS = isDS.replaceAll(",",".");
                double D = Double.parseDouble(isDS);
                System.out.println(D);
                String isABS = isAB.getText();
                isABS = isABS.replaceAll(",",".");
                double ab = Double.parseDouble(isABS);
                System.out.println(ab);
                System.out.printf("%f * ((%f + %f)/(2 + %f))", D, d, ab, ab);
                double eqdTwo = D * ((d + ab) / (2 + ab));
                System.out.println(eqdTwo);
                tfRes.setText(String.valueOf(df.format(eqdTwo)));
            }
        }});

        panelUp.add(isd, BorderLayout.WEST);
        panelUp.add(isD, BorderLayout.CENTER);
        panelUp.add(isAB, BorderLayout.EAST);
        panelMid.add(dpf, BorderLayout.WEST);
        panelMid.add(dpc, BorderLayout.CENTER);
        panelMid.add(alfabeta, BorderLayout.EAST);
        panelDown.add(button, BorderLayout.WEST);
        panelDown.add(tfRes, BorderLayout.CENTER);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

    class Terminal {
        public static void main(String[] args) {
            EventQueue.invokeLater(() -> {
                try {
                    new Core();
                } catch (Exception e) {
                    e.printStackTrace();}});}}


    class MyInputVerificator extends InputVerifier {

        @Override
        public boolean verify(JComponent input) {
            String doubleNum = ((JTextField) input).getText();
            try {
                doubleNum = doubleNum.replaceAll(",",".");
                double val = Double.parseDouble(doubleNum);
                return true;
            } catch (Exception e) {
                return false;
            }
        }}
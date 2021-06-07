package EQD2Calculator;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingGUI extends JFrame implements ActionListener {

    private static JButton button = new JButton("EQD2 =");
    private JTextField isd = new JTextField();
    private JTextField isD = new JTextField();
    private JTextField isAB = new JTextField();
    private JTextField tfRes = new JTextField(10);
    String[] ABs = {"Легкое", "Простата", "Кость", "Печень", "Мозг"};
    private JComboBox ABChoice = new JComboBox(ABs);

    public SwingGUI() {

        ImageIcon img = new ImageIcon(getClass().getResource("/EQD2Calculator/radiation.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocation(700, 300);
        setTitle("EQD2 Калькулятор");
        setVisible(true);
        setIconImage(img.getImage());

        JPanel panelUp = new JPanel();
        panelUp.setBackground(Color.lightGray);
        add(panelUp, BorderLayout.NORTH);

        JPanel panelMid = new JPanel();
        panelMid.setBackground(Color.lightGray);
        add(panelMid, BorderLayout.CENTER);

        JPanel panelDown = new JPanel();
        panelDown.setBackground(Color.lightGray);
        add(panelDown, BorderLayout.SOUTH);

        ABChoice.setEditable(false);
        ABChoice.setMaximumRowCount(6);
        ABChoice.setSelectedIndex(0);

        isd.setHorizontalAlignment(SwingConstants.CENTER);
        isd.setPreferredSize(new Dimension(150, 20));

        isD.setHorizontalAlignment(SwingConstants.CENTER);
        isD.setPreferredSize(new Dimension(150, 20));

        isAB.setHorizontalAlignment(SwingConstants.CENTER);
        isAB.setPreferredSize(new Dimension(150, 20));

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

        JLabel alfaBeta = new JLabel("α/β ткани");
        alfaBeta.setBackground(Color.lightGray);
        alfaBeta.setHorizontalAlignment(SwingConstants.CENTER);
        alfaBeta.setVerticalAlignment(SwingConstants.CENTER);
        alfaBeta.setPreferredSize(new Dimension(150, 20));

        tfRes.setEditable(false);

        panelUp.add(isd, BorderLayout.WEST);
        panelUp.add(isD, BorderLayout.CENTER);
        panelUp.add(isAB, BorderLayout.EAST);
        panelMid.add(dpf, BorderLayout.WEST);
        panelMid.add(dpc, BorderLayout.CENTER);
        panelMid.add(alfaBeta, BorderLayout.EAST);
        panelDown.add(ABChoice, BorderLayout.WEST);
        panelDown.add(button, BorderLayout.EAST);
        panelDown.add(tfRes, BorderLayout.CENTER);

        ListenButton listen = new ListenButton(button, isd, isD, isAB, tfRes);
        ListenABChoice listen1 = new ListenABChoice(ABChoice, isAB);
        button.addActionListener(listen);
        ABChoice.addActionListener(listen1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
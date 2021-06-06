package dcgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingGUI extends JFrame implements ActionListener {

    private JButton button = new JButton("EQD2 =");
    private JTextField isd = new JTextField();
    private JTextField isD = new JTextField();
    private JTextField isAB = new JTextField();
    private JTextField tfRes = new JTextField(10);

    public SwingGUI() {

        ListenButton listen = new ListenButton(button, isd, isD, isAB, tfRes);
        button.addActionListener(listen);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setLocation(700, 300);
        setTitle("EQD2 Калькулятор");

        ImageIcon img = new ImageIcon(getClass().getResource("/dcgui/radiation.png"));
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

        isd.setHorizontalAlignment(SwingConstants.CENTER);
        isd.setPreferredSize(new Dimension(150, 20));
        isd.setInputVerifier(new MyInputVerifier());

        isD.setHorizontalAlignment(SwingConstants.CENTER);
        isD.setPreferredSize(new Dimension(150, 20));
        isD.setInputVerifier(new MyInputVerifier());

        isAB.setHorizontalAlignment(SwingConstants.CENTER);
        isAB.setPreferredSize(new Dimension(150, 20));
        isAB.setInputVerifier(new MyInputVerifier());

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

        tfRes.setHorizontalAlignment(SwingConstants.CENTER);
        tfRes.setEditable(false);

        panelUp.add(isd, BorderLayout.WEST);
        panelUp.add(isD, BorderLayout.CENTER);
        panelUp.add(isAB, BorderLayout.EAST);
        panelMid.add(dpf, BorderLayout.WEST);
        panelMid.add(dpc, BorderLayout.CENTER);
        panelMid.add(alfaBeta, BorderLayout.EAST);
        panelDown.add(button, BorderLayout.WEST);
        panelDown.add(tfRes, BorderLayout.CENTER);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
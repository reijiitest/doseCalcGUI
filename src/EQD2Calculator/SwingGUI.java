package EQD2Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingGUI extends JFrame implements ActionListener {

    private static JButton button = new JButton("EQD2 =");
    private JTextField isd = new JTextField();
    private JTextField isD = new JTextField();
    private JTextField isAB = new JTextField();
    private JTextField tfRes = new JTextField(6);
    String[] ABs = {"Выберите ткань", "Легкое", "Простата", "Кость", "Печень", "Мозг"};
    private JComboBox ABChoice = new JComboBox(ABs);

    public SwingGUI() {

        ImageIcon img = new ImageIcon(getClass().getResource("/EQD2Calculator/radiation.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(260, 420);
        setLocation(830, 190);
        setResizable(false);
        setTitle("EQD2");
        setVisible(true);
        setIconImage(img.getImage());

        JPanel mainP = new JPanel();
        GridLayout gl = new GridLayout(5,1);
        mainP.setLayout(gl);
        add(mainP);

        JPanel panelUp = new JPanel();
        panelUp.setBackground(Color.lightGray);
        mainP.add(panelUp);
        JPanel panelMid = new JPanel();
        panelMid.setBackground(Color.lightGray);
        mainP.add(panelMid);
        JPanel panel4ab = new JPanel();
        panel4ab.setBackground(Color.lightGray);
        mainP.add(panel4ab);
        JPanel panelPH = new JPanel();
        panelPH.setBackground(Color.lightGray);
        mainP.add(panelPH);
        JPanel panelDown = new JPanel();
        panelDown.setBackground(Color.lightGray);
        mainP.add(panelDown);

        ABChoice.setEditable(false);
        ABChoice.setMaximumRowCount(10);
        ABChoice.setSelectedIndex(0);
        ABChoice.setPreferredSize(new Dimension(150, 20));
        isd.setHorizontalAlignment(SwingConstants.CENTER);
        isd.setPreferredSize(new Dimension(150, 20));
        isD.setHorizontalAlignment(SwingConstants.CENTER);
        isD.setPreferredSize(new Dimension(150, 20));
        isAB.setHorizontalAlignment(SwingConstants.CENTER);
        isAB.setPreferredSize(new Dimension(150, 20));
        tfRes.setEditable(false);

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
        JLabel placeHolder = new JLabel("       ");
        placeHolder.setBackground(Color.lightGray);
        placeHolder.setHorizontalAlignment(SwingConstants.CENTER);
        placeHolder.setVerticalAlignment(SwingConstants.CENTER);
        placeHolder.setPreferredSize(new Dimension(150, 20));

        panelUp.add(dpf);
        panelUp.add(isd);
        panelMid.add(dpc);
        panelMid.add(isD);
        panel4ab.add(alfaBeta);
        panel4ab.add(isAB);
        panel4ab.add(ABChoice);
        panelPH.add(placeHolder);
        panelDown.add(button);
        panelDown.add(tfRes);

        ListenButton listen = new ListenButton(button, isd, isD, isAB, tfRes);
        ListenABChoice listen1 = new ListenABChoice(ABChoice, isAB);
        button.addActionListener(listen);
        ABChoice.addActionListener(listen1);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
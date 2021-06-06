package dcgui;

import java.awt.*;

public class Terminal {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                new SwingGUI();
            } catch (Exception ex) {
                ex.printStackTrace();}});}}

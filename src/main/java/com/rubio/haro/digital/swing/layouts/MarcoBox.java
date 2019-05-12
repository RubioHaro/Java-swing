package com.rubio.haro.digital.swing.layouts;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author rodrigo_rubio
 */
public class MarcoBox extends JFrame{
    static int ANCHO=175, ALTO=150;
    public MarcoBox(){
        super("Marco BoxLayout");
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add( new JLabel("Primera"));
        panel.add( new JLabel("Segunda"));
        panel.add( new JLabel("Tercera"));
        panel.add( new JLabel("Cuarta"));
        panel.add( new JLabel("Quinta"));
        panel.add( new JLabel("Sexta"));
        add(panel);
        setSize(ANCHO, ALTO);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MarcoBox marco =  new MarcoBox();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

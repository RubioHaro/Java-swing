package com.rubio.haro.digital.swing.layouts;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author rodrigo_rubio
 */
public class MarcoFLow extends JFrame {
    static int ALTO = 100, ANCHO = 175;
    
    public MarcoFLow(){
        super("Marco FlowLayout");
        setLayout(new FlowLayout());
        add(new JLabel("Primera"));
        add(new JLabel("Segunda"));
        add(new JLabel("Tercera"));
        add(new JLabel("Cuarta"));
        add(new JLabel("Quinta"));
        add(new JLabel("Sexta"));
        
        setSize(ANCHO, ALTO);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MarcoFLow marco = new  MarcoFLow();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

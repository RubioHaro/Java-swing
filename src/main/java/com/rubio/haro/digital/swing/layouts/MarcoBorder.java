package com.rubio.haro.digital.swing.layouts;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author rodrigo_rubio
 */
public class MarcoBorder extends JFrame {

    static int ANCHO = 175, ALTO = 100;
    
    public MarcoBorder(){
        super("Mi marco ;)");
        add (new JLabel("Norte", SwingConstants.CENTER), BorderLayout.NORTH);
        add (new JLabel("Sur", SwingConstants.CENTER), BorderLayout.SOUTH);
        add (new JLabel("Centro", SwingConstants.CENTER), BorderLayout.CENTER);
        add (new JLabel("Oeste", SwingConstants.CENTER), BorderLayout.WEST);
        add (new JLabel("Este", SwingConstants.CENTER), BorderLayout.EAST);
        
        setSize(ANCHO, ALTO);
        setVisible(true);
    }
    
    public static void main(String args[]){
        MarcoBorder marco = new MarcoBorder();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

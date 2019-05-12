
package com.rubio.haro.digital.swing.layouts;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author rodrigo_rubio
 */
public class MarcoGrid extends JFrame
{
    static int ANCHO = 175, ALTO = 100;
        
    public MarcoGrid(){
        super("Marco GridLayout");
        setLayout(new GridLayout(3, 2, 15, 15));
        add( new JLabel("Primera"));
        add( new JLabel("Segunda"));
        add( new JLabel("Tercera"));
        add( new JLabel("Cuarta"));
        add( new JLabel("Quinta"));
        add( new JLabel("Sexta"));
        setSize(ANCHO, ALTO);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        MarcoGrid marco = new MarcoGrid();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

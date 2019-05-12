package com.rubio.haro.digital.swing;

import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

/**
 *
 * @author rodrigo_rubio
 */
public class MarcoConCadena extends JFrame {

    private static final int ANCHO = 300, ALTO = 150;

    public MarcoConCadena(String c) {
        super(c);
        setSize(ANCHO, ALTO);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Font tipoLetra = new Font("Arial", Font.BOLD, 14);
        g.setFont(tipoLetra);
        g.drawString("Welcom! this is java Swing", ANCHO / 10, 70);
        g.drawLine(ANCHO / 10, 80, ANCHO / 10 + 250, 80);
    }
    
    public static void main(String[] args) {
        MarcoConCadena marco;
        marco = new MarcoConCadena("Marco Gráfico");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

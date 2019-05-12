package com.rubio.haro.digital.swing.layouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author rodrigo_rubio
 */
public class MarcoGestoresCombinados extends JFrame{

    public MarcoGestoresCombinados() throws HeadlessException {
        JPanel panel1= new JPanel(new FlowLayout());
        JPanel panel2= new JPanel(new BorderLayout());
        JPanel panel3= new JPanel();
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.Y_AXIS));
        
        /*Panel 1: componentes*/
        String []opc = {"Marea Alta", "Bajamar", "Montaña"};
        panel1.add(new JLabel("Elegir", JLabel.CENTER));
        panel1.add(new JList(opc));
        panel1.add(new JButton("Pulsar"));
        
        /*Panel 2: componentes*/
        JTextField j = new JTextField("Razones");
        j.setEditable(false);
        panel2.add(j, BorderLayout.CENTER);
        panel2.add(new JButton("boton"), BorderLayout.EAST);
        
        
        /*Panel 3: componentes*/
        panel3.add(new JCheckBox("Box", false));
        panel3.add(new JLabel("Calendario", JLabel.CENTER));
        panel3.add(new JRadioButton("Bot Radio", true));
        
        
        /*Asigna layout al merco y se ponen los paneles*/
        setLayout(new BorderLayout(10, 15));
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);
        
    }
    
   
    public static void main(String[] args) {
        MarcoGestoresCombinados m = new MarcoGestoresCombinados();
        m.setSize(250,300);
        m.setLocation(20, 200);
        m.setResizable(true);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

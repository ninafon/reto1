
package exemevenclases;

import javax.swing.*;

public class Ventana {
    
    JPanel panel;
    JButton boton;
    JFrame marco;
    
    public Ventana(){
        marco = new JFrame();
        panel = new JPanel ();
        boton = new JButton();
//        Accion obx = new Accion(panel);
        Accion obx = new Accion();
        marco.setSize(500, 200);            
        
        panel.add(boton);
        marco.add(panel);
        boton.addActionListener(obx);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
        
        
    }
    
    public JPanel getPanel(){
        return panel;
    }
    
    
}

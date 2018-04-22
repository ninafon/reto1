
package exemevenclases;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Accion implements ActionListener{
   
    JPanel p;
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Ventana o = new Ventana();
        o.getPanel().setBackground(Color.red);
        
    }    
}

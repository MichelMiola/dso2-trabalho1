
package br.com.trabalho1.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tela extends JFrame{
    
    public final void error(String message){
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
    
   
}

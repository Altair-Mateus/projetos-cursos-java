/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Mateus
 */
public class Utilities 
{
    public void cleanScreen(JPanel container)
    {
        Component components[] = container.getComponents();
        
        for(Component component : components)
        {
            if(component instanceof JTextField)
            {
                ((JTextField) component).setText(null);
            }// Fim do bloco if
        }// Fim do bloco de repetição for
    }// Fim do método cleanScreen

    public void limpa(JPanel jPanelPainelCadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}// Fim da classe Utilities

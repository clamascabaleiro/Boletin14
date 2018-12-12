

package boletin14_1;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin14_1 {

 
    public static void main(String[] args) {
       
        ConversorTemperaturas conversor1 = new ConversorTemperaturas();
        
       try {
            
            float grados = Integer.parseInt(JOptionPane.showInputDialog("Añade los centígrados"));
            JOptionPane.showMessageDialog(null,"Fharenheir: " + conversor1.centigradosAFharenheit(grados));
            JOptionPane.showMessageDialog(null,"Reamur: " + conversor1.centigradosAReamur(grados));
            
        } catch(TemperaturaErradaExcepcion e1) {
            
            JOptionPane.showMessageDialog(null,e1.getMessage());
        }
        
    }
        

}

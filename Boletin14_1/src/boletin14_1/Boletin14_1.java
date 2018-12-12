

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
            JOptionPane.showMessageDialog(null,"Fharenheit : " + conversor1.centigradosAFharenheit(grados) + " °F");
            JOptionPane.showMessageDialog(null,"Reamur : " + conversor1.centigradosAReamur(grados) + " °R");
            
        } catch(TemperaturaErradaExcepcion ex) {
            
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
    }
        

}



package boletin14_1;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin14_1 {

 
    public static void main(String[] args) {
       
        ConversorTemperaturas conversor1 = new ConversorTemperaturas();
        
        float grados;
        
        try{
            do{
                grados = Integer.parseInt(JOptionPane.showInputDialog("Introduzca los grados"));
            }while (grados < 80);
            
            JOptionPane.showMessageDialog(null, "Reamur = " + conversor1.centigradosAReamur(grados)+ " °R ");
            JOptionPane.showMessageDialog(null, "Fahrenheit = " + conversor1.centigradosAFharenheit(grados)+ " °F ");
        } catch (TemperaturaErradaExcepcion ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

}

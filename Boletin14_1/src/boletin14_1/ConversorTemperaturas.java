package boletin14_1;

/**
 *
 * @author clamascabaleiro
 */
public class ConversorTemperaturas {

    final float GRADOS = 80;

    public float centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion {
        
        float fharenheit;
            
        if(centigrados < GRADOS){
            
            throw new TemperaturaErradaExcepcion("La temperatura es < que " + GRADOS );
        } else {
            
            fharenheit = (float) (9.0 / 5.0 * centigrados + 32.4);
            return fharenheit;
        } 

    }
    
    public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion{
        
        float reamur = 0;
        
        if(centigrados < GRADOS){
            
            throw new TemperaturaErradaExcepcion("La temperatura es < que " + GRADOS);
        } else{
            
            reamur = (float) (4.0 / 5.0 * centigrados);
            return reamur;
        }
    }
}
